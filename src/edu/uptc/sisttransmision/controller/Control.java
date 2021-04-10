package edu.uptc.sisttransmision.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.uptc.sisttransmision.view.JFrameMain;

public class Control implements ActionListener {

	private JFrameMain frame;
	private static Control CONTROL = null;

	public Control() {
	}

	public static Control getInstance() {
		if (CONTROL == null) {
			CONTROL = new Control();
		}
		return CONTROL;
	}

	public void init() {
		frame = new JFrameMain();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "ENVIAR_MENSAJE") {
			System.out.println("enviar");

		}
	}

}
