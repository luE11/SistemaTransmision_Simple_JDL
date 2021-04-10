package edu.uptc.sisttransmision.model;

public class MessageProcessing {
	private LanguageDictionary dictionary;
	public static String final_plot = "11111111";
	
	public MessageProcessing() {
		dictionary = new LanguageDictionary();
	}
	
	public String convertIPToBitsSegments(String IP) { // convierte una ip en una cadena de bits separado por espacios 
		String IPBinary = ""; 
		for (int i = 0; i < IP.split("\\.").length; i++) {
			IPBinary += String.format("%8s", Integer.toBinaryString(Integer.parseInt(IP.split("\\.")[i]))).replace("\u0020","\u0030");
			IPBinary += (i<(IP.split("\\.").length-1))?" ": "";
		}
		return IPBinary;
	}
	
	public String messageIntLength(String message) { // longitud del mensaje en entero 
		return String.valueOf(message.length());
	}
	
	public String messageBitsLength(String message) { // longitud del mensaje en una cadena de bits
		return String.format("%8s", Integer.toBinaryString(message.length())).replace("\u0020","\u0030");
	}
	
	public String convertMessageToBits(String message) { //convierte el mensaje del usuario en una cadena de bits
		String messagebits = "";
		for (int i = 0; i < message.length(); i++) {
			messagebits += dictionary.getTranslateToBinary(message.charAt(i));
			messagebits += (i<(message.length()-1))?" ": "";
		}
		return messagebits;
	}
	
	public String allPlot(String IPOrigin, String IPDestination, String message) { //retorna todo el mensaje (ip fuente, ip destino, longitud del mensaje, mensaje y 11111111" en bits
		return convertIPToBitsSegments(IPOrigin) + " " + convertIPToBitsSegments(IPDestination) + " " + 
				messageBitsLength(message) + " " + convertMessageToBits(message) + " " + final_plot;
	}
	
	
	public String convertBitsSegmentsToIP(String bitsMessage, int ip) { //da la ip en decimal a partir del mensaje en bits(int ip = 0 ó 1) 0 = ip destino, 1 ip origen  
		String IP = "";
		if (ip == 0) {
			for (int i = 0; i < 4; i++) {
				IP += (i==3)? Integer.parseInt(bitsMessage.split(" ")[i], 2): Integer.parseInt(bitsMessage.split(" ")[i], 2) + ".";
			}
		}
		else {
			for (int i = 4; i < 8; i++) {
				IP += (i==7)? Integer.parseInt(bitsMessage.split(" ")[i], 2): Integer.parseInt(bitsMessage.split(" ")[i], 2) + ".";
			}
		}
		return IP;
	}
	
	public String  messageLength(String bitsMessage) { // longitud del mensaje a partir del mansaje en bits
		return String.valueOf(Integer.parseInt(bitsMessage.split(" ")[8], 2));
	}
	
	public  String convertBitsToMessage(String bitsMessage) { //mensaje a partir del mensaje en bits 
		String message = "";
		for (int i = 9; i < bitsMessage.split(" ").length-1; i++) {
			message += dictionary.getBinaryToCharacter(bitsMessage.split(" ")[i]);
		}
		return message;
	}
	
	public String endOfMessage(String bitsMessage) { //trama final a partir del mensaje en bits
		return bitsMessage.split(" ")[bitsMessage.split(" ").length-1];
	}
}