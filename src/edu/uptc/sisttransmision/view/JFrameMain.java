package edu.uptc.sisttransmision.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.uptc.sisttransmision.controller.Control;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldFuente;
	public JTextField textFieldDestino;
	public JTextField textFieldMensaje;
	public JTextField textFieldFuenteBin;
	public JTextField textFieldDestinoBin;
	public JTextField textFieldLongitudBin;
	public JTextField textField_FuenteBin2;
	public JTextField textField_DestinoBin2;
	public JTextField textField_LongitudBin2;
	public JTextArea textAreaMensaje1;
	public JButton btnEnviar;



	/**
	 * Create the frame.
	 * @param control 
	 */
	public JFrameMain(ActionListener control) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(83, 22, 711, 157);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INGRESAR INFORMACION");
		lblNewLabel.setBounds(272, 11, 164, 28);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESE DIRECCION FUENTE");
		lblNewLabel_1.setBounds(131, 44, 170, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("INGRESE DIRECCION DESTINO");
		lblNewLabel_2.setBounds(131, 72, 170, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("INGRESE MENSAJEl");
		lblNewLabel_3.setBounds(131, 98, 170, 14);
		panel.add(lblNewLabel_3);
		
		textFieldFuente = new JTextField();
		textFieldFuente.setBounds(334, 41, 170, 20);
		panel.add(textFieldFuente);
		textFieldDestino = new JTextField();
		textFieldDestino.setBounds(334, 69, 170, 20);
		panel.add(textFieldDestino);
		
		textFieldMensaje = new JTextField();
		textFieldMensaje.setBounds(334, 95, 170, 20);
		panel.add(textFieldMensaje);
		
		btnEnviar = new JButton("ENVIAR MENSAJE");
		btnEnviar.setBounds(301, 126, 170, 23);
		btnEnviar.addActionListener(control);
		btnEnviar.setActionCommand("ENVIAR_MENSAJE");
		panel.add(btnEnviar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "FUENTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(83, 190, 351, 348);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("DIRECCION FUENTE");
		lblNewLabel_4.setBounds(10, 36, 170, 14);
		panel_1.add(lblNewLabel_4);
		
		textFieldFuenteBin = new JTextField();
		textFieldFuenteBin.setBounds(171, 33, 170, 20);
		panel_1.add(textFieldFuenteBin);
		textFieldFuenteBin.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("DIRECCION DESTINO");
		lblNewLabel_5.setBounds(10, 66, 170, 14);
		panel_1.add(lblNewLabel_5);
		
		textFieldDestinoBin = new JTextField();
		textFieldDestinoBin.setBounds(171, 61, 170, 20);
		panel_1.add(textFieldDestinoBin);
		textFieldDestinoBin.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("LONGITUD MENSAJE");
		lblNewLabel_6.setBounds(10, 91, 170, 14);
		panel_1.add(lblNewLabel_6);
		
		textFieldLongitudBin = new JTextField();
		textFieldLongitudBin.setBounds(171, 88, 86, 20);
		panel_1.add(textFieldLongitudBin);
		textFieldLongitudBin.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("MENSAJE");
		lblNewLabel_7.setBounds(10, 123, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 331, 126);
		panel_1.add(scrollPane);
		
		textAreaMensaje1 = new JTextArea();
		textAreaMensaje1.setLineWrap(true);
		scrollPane.setViewportView(textAreaMensaje1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "DESTINO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(443, 190, 351, 348);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("DIRECCION FUENTE");
		lblNewLabel_4_1.setBounds(10, 37, 170, 14);
		panel_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("DIRECCION DESTINO");
		lblNewLabel_5_1.setBounds(10, 62, 170, 14);
		panel_1_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("LONGITUD MENSAJE");
		lblNewLabel_6_1.setBounds(10, 87, 170, 14);
		panel_1_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("MENSAJE");
		lblNewLabel_7_1.setBounds(10, 122, 170, 14);
		panel_1_1.add(lblNewLabel_7_1);
		
		JTextArea textArea_MensajeBin2 = new JTextArea();
		textArea_MensajeBin2.setBounds(10, 147, 331, 100);
		panel_1_1.add(textArea_MensajeBin2);
		
		JLabel lblNewLabel_8 = new JLabel("MENSAJE TRADUCIDO");
		lblNewLabel_8.setBounds(10, 258, 170, 14);
		panel_1_1.add(lblNewLabel_8);
		
		JTextArea textArea_MensajeTraducido = new JTextArea();
		textArea_MensajeTraducido.setBounds(10, 282, 331, 55);
		panel_1_1.add(textArea_MensajeTraducido);
		
		textField_FuenteBin2 = new JTextField();
		textField_FuenteBin2.setColumns(10);
		textField_FuenteBin2.setBounds(149, 34, 170, 20);
		panel_1_1.add(textField_FuenteBin2);
		
		textField_DestinoBin2 = new JTextField();
		textField_DestinoBin2.setColumns(10);
		textField_DestinoBin2.setBounds(149, 59, 170, 20);
		panel_1_1.add(textField_DestinoBin2);
		
		textField_LongitudBin2 = new JTextField();
		textField_LongitudBin2.setColumns(10);
		textField_LongitudBin2.setBounds(149, 87, 86, 20);
		panel_1_1.add(textField_LongitudBin2);
		
//		Control.getInstance().setFrame(this);

	}
	
	
	public JTextField getTextFieldFuente() {
		return textFieldFuente;
	}
}
