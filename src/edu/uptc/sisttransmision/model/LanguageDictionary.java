package edu.uptc.sisttransmision.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class LanguageDictionary {
	private final String DICTIONARY_PATH = "resources/Language.xml";
	
	
	Properties prop;
	public LanguageDictionary() {
		prop = new Properties();
		try {
			prop.loadFromXML(new FileInputStream(DICTIONARY_PATH));
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTranslateToBinary(char c) {
		return prop.getProperty(Character.toString(c));
	}
	
	public String getBinaryToCharacter(String binary) {
		return prop.getProperty(binary);
	}
}
