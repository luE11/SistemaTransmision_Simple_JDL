package edu.uptc.sisttransmision.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InputEmitDataPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTitle, lblEmitter, lblReceiver, lblMessage;
	private JTextField txtEmitter, txtReceiver, txtMessage;
	private JButton btnStartTransmission;
	private GridBagConstraints gbc;
	
	public InputEmitDataPanel(ActionListener control) {
		this.setLayout(new GridBagLayout());
		
		setBackground(Color.red);
		
		Font myFont = new Font(Font.SANS_SERIF, Font.BOLD, 14);
		
		gbc = new GridBagConstraints();
		
		lblTitle = new JLabel("Ingreso de información", SwingConstants.CENTER);
		lblTitle.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblTitle.setFont(myFont.deriveFont(18f));
		
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.insets = new Insets(5, 10, 5, 10);
		
		add(lblTitle, gbc);
		
		lblEmitter = new JLabel("Ingrese la dirección fuente", SwingConstants.CENTER);
		lblEmitter.setFont(myFont);
		
		gbc.gridwidth = 1;
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		add(lblEmitter, gbc);
		
		txtEmitter = new JTextField(20);
		txtEmitter.setFont(myFont);
		
		gbc.gridx = 1;
		
		add(txtEmitter, gbc);
		
		lblReceiver = new JLabel("Ingrese la dirección destino", SwingConstants.CENTER);
		lblReceiver.setFont(myFont);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		
		add(lblReceiver, gbc);
		
		txtReceiver = new JTextField(20);
		txtReceiver.setFont(myFont);
		
		gbc.gridx = 1;
		
		add(txtReceiver, gbc);
		
		
		lblMessage = new JLabel("Ingrese un mensaje", SwingConstants.CENTER);
		lblMessage.setFont(myFont);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		
		add(lblMessage, gbc);
		
		txtMessage = new JTextField(20);
		txtMessage.setFont(myFont);
		
		gbc.gridx = 1;
		
		add(txtMessage, gbc);
		
		btnStartTransmission = new JButton("Iniciar transmisión");
		btnStartTransmission.setFont(myFont);
		btnStartTransmission.addActionListener(control);
		btnStartTransmission.setActionCommand("start");
		
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 4;
		
		add(btnStartTransmission, gbc);
		
		setVisible(true);
	}
	
	
	public void test() {
		System.out.println();
	}
}
