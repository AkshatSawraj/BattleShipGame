package game;

import java.awt.EventQueue;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import com.jgoodies.forms.factories.DefaultComponentFactory;

public class ClientInterface {

	
	private JFrame frame;
	private JTextField username;
	private JTextField ipAddress;
	private JTextField portNumber;
	private String name;
	private int port;
	private String ip;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					ClientInterface window = new ClientInterface();
					window.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClientInterface() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 434);
		frame.setTitle("Game Client");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Username: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(144, 71, 153, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterPortNumber = new JLabel("Enter Port Number: ");
		lblEnterPortNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterPortNumber.setBounds(144, 121, 153, 28);
		frame.getContentPane().add(lblEnterPortNumber);
		
		JLabel lblEnterIpAddress = new JLabel("Enter IP Address:");
		lblEnterIpAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterIpAddress.setBounds(144, 171, 153, 28);
		frame.getContentPane().add(lblEnterIpAddress);
		
		username = new JTextField();
		username.setBounds(357, 77, 123, 21);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		ipAddress = new JTextField();
		ipAddress.setColumns(10);
		ipAddress.setBounds(357, 177, 123, 21);
		frame.getContentPane().add(ipAddress);
		
		portNumber = new JTextField();
		portNumber.setColumns(10);
		portNumber.setBounds(357, 127, 123, 21);
		frame.getContentPane().add(portNumber);
		
		JButton start = new JButton("Start Game");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 name=username.getText();
				 try {
					 port=Integer.parseInt(portNumber.getText());
					 
				 }
				 catch(NumberFormatException e1){
					 JOptionPane.showMessageDialog(frame, "Incorect Port Number");
				 }
				 ip=ipAddress.getText();
				 mainWindow window=new mainWindow();
				 frame.setVisible(false);
				 
				 
			}
		});
		start.setFont(new Font("Tahoma", Font.PLAIN, 14));
		start.setBounds(144, 273, 123, 45);
		frame.getContentPane().add(start);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		exit.setBounds(357, 273, 123, 45);
		frame.getContentPane().add(exit);
	}

	public String getName() {
		return name;
	}

	public int getPort() {
		return port;
	}

	public String getIp() {
		return ip;
	}
	
	
	
	
}


