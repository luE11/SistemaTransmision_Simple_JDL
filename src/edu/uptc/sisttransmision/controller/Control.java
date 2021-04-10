package edu.uptc.sisttransmision.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		}
	}

	public void setFrame(JFrameMain frame) {
		this.frame = frame;
	}

	public void getInfo() {
		fuente = messageProcessing.convertMessageToBits(frame.textFieldFuente.getText());
		destino = messageProcessing.convertMessageToBits(frame.textFieldDestino.getText());
		mensaje = messageProcessing.convertMessageToBits(frame.textFieldMensaje.getText());

	}

	public void setInfoFuente() {
		frame.textFieldDestinoBin.setText(destino);
		frame.textFieldFuenteBin.setText(fuente);
		frame.textFieldLongitudBin.setText(messageProcessing.messageBitsLength(frame.textFieldMensaje.getText()));
		frame.textAreaMensaje1.setText(mensaje);

	}

}
