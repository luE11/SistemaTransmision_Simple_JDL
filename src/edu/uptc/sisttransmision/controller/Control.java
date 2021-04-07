package edu.uptc.sisttransmision.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.uptc.sisttransmision.view.MainFrame;

public class Control implements ActionListener {

	private MainFrame frame;
	
	public Control() {		
	}
	
	public void init() {
		frame = new MainFrame(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
