package edu.uptc.sisttransmision.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.uptc.sisttransmision.view.JFrameMain;

public class Control implements ActionListener {

	private JFrameMain frame;
	private static Control CONTROL = null;

	public Control() {
		frame = new JFrameMain(this);
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

		}
	}

	public void setFrame(JFrameMain frame) {
		this.frame = frame;
	}

	public void getInfo() {
		String fuente, destino, mensaje;
		fuente = frame.getTextFieldFuente().getText();
		System.out.println("el mensaje es " + fuente + "hooooo");

	}

}
