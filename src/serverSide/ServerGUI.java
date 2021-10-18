package serverSide;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServerGUI {

	private JFrame frame;
	private JTextField portNumber;
	private int port;

	/**
	 * Create the application.
	 */
	public ServerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Game Server");
		frame.setBounds(100, 100, 620, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					port=Integer.parseInt(portNumber.getText());
					
				}
				catch(NumberFormatException e1){
					 JOptionPane.showMessageDialog(frame, "Incorect Port Number");
				 }
			}
		});
		startButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		startButton.setBounds(118, 131, 114, 35);
		frame.getContentPane().add(startButton);
		
		JButton stopButton = new JButton("Stop");
		stopButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stopButton.setBounds(307, 131, 114, 35);
		frame.getContentPane().add(stopButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(54, 238, 474, 195);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Game Traffic");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(228, 216, 114, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Port Number: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(124, 63, 173, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		portNumber = new JTextField();
		portNumber.setBounds(307, 68, 131, 19);
		frame.getContentPane().add(portNumber);
		portNumber.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(511, 238, 17, 195);
		frame.getContentPane().add(scrollBar);
	}

	public int getPort() {
		return port;
	}
	
	
}
