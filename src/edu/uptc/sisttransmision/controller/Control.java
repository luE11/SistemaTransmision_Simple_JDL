package edu.uptc.sisttransmision.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import edu.uptc.sisttransmision.model.MessageProcessing;
import edu.uptc.sisttransmision.view.JFrameMain;

public class Control implements ActionListener {

	private JFrameMain frame;
	private static Control CONTROL = null;
	private String fuente, destino, mensaje;
	private MessageProcessing messageProcessing;

	public Control() {
		frame = new JFrameMain(this);
		messageProcessing = new MessageProcessing();
		init();

	}

	public void init() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "ENVIAR_MENSAJE") {
			getInfo();
			setInfoFuente();
			clean();
		}
	}

	public void setFrame(JFrameMain frame) {
		this.frame = frame;
	}

	public void getInfo() {
		fuente = messageProcessing.convertIPToBitsSegments(frame.textFieldFuente.getText());
		destino = messageProcessing.convertIPToBitsSegments(frame.textFieldDestino.getText());
		mensaje = messageProcessing.convertMessageToBits(frame.textFieldMensaje.getText());

	}

	public void setInfoFuente() {
		verify();

	}

	public void verify() {
		int val = Integer.parseInt(messageProcessing.messageIntLength(frame.textFieldMensaje.getText()));
		if (val > 254) {
			JOptionPane.showMessageDialog(null, "Demasidos Caracteres", "Error de datos", JOptionPane.WARNING_MESSAGE);
		} else {
			frame.textFieldDestinoBin.setText(destino);
			frame.textFieldFuenteBin.setText(fuente);
			frame.textFieldLongitudBin.setText(messageProcessing.messageBitsLength(frame.textFieldMensaje.getText()));
			frame.textFieldLongitudNorm.setText(messageProcessing.messageIntLength(frame.textFieldMensaje.getText()));
			frame.textAreaMensaje1.setText(mensaje);

			frame.textField_DestinoBin2.setText(destino);
			frame.textField_FuenteBin2.setText(fuente);
			frame.textField_LongitudBin2.setText(messageProcessing.messageBitsLength(frame.textFieldMensaje.getText()));
			frame.textFieldLongitudNorm2.setText(messageProcessing.messageIntLength(frame.textFieldMensaje.getText()));
			frame.textArea_MensajeBin2.setText(mensaje);
			frame.textArea_MensajeTraducido.setText(messageProcessing.convertBitsToMessage("         "+mensaje));

		}
	}

	public void clean() {
		frame.textFieldFuente.setText("");
		frame.textFieldDestino.setText("");
		frame.textFieldMensaje.setText("");

	}

}
