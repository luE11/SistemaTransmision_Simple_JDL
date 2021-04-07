package edu.uptc.sisttransmision.view;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private InputEmitDataPanel dataPanel;
	private TransmissionPanel trPanel;
	
	public MainFrame(ActionListener control) {
		super("Sistema Simple Transmisión de datos");
		setLayout(new BorderLayout());
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width,
				Toolkit.getDefaultToolkit().getScreenSize().height);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		dataPanel = new InputEmitDataPanel(control);
		add(dataPanel, BorderLayout.NORTH);
		
		trPanel = new TransmissionPanel(control);
		add(trPanel, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}
