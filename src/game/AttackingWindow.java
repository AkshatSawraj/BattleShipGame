package game;

import java.awt.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import gameEngine.gameEngine;
import utilities.InputListener;
import utilities.Message;
import utilities.Moves;


public class AttackingWindow  implements Observer{
	private JFrame frame;
	private JButton[][] playerMatrix;
	private Panel panel;
	private Panel panel_1;
	private JButton[][] tempMatrix = new JButton[10][10];
	private JButton[][] attackMatrix = new JButton[10][10];
	private JTextField 			messageToSend;
	private JTextArea			displayMessage;
	private JButton				send, connect, disconnect;
	private Socket				socket;
	private String 				userName;
	private ObjectOutputStream 	oos;
	private InputListener		listener;
	private boolean				newSession;
	private gameEngine			gme;
	private String 				playResult;
	private Moves 				opponentMove;
	private int i;
	//ClientInterface user = new ClientInterface();
	private int j;
	
	/**
	 * Create the application.
	 */
	public AttackingWindow(JButton[][] matrix) {
		this.tempMatrix = matrix;
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 * @return 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Attacking Window");
		frame.setVisible(true);
		frame.setBounds(100, 100, 1022, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Quit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(591, 440, 85, 21);
		frame.getContentPane().add(btnNewButton);

		panel = new Panel();
		panel.setBounds(10, 10, 271, 273);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0 };
		gbl_panel.rowHeights = new int[] { 0 };
		gbl_panel.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		panel_1 = new Panel();
		panel_1.setBounds(287, 10, 411, 361);
		frame.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0 };
		gbl_panel_1.rowHeights = new int[] { 0 };
		gbl_panel_1.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblNewLabel = new JLabel("Score: 0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(402, 440, 96, 21);
		frame.getContentPane().add(lblNewLabel);JLabel lblNewLabel_2 = new JLabel("Player Grid");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(79, 283, 96, 21);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Attacking Grid");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(448, 373, 113, 21);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		

		createPlayerGrid();
		createAttackGrid();
		gme = new gameEngine(playerMatrix,attackMatrix);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(704, 10, 294, 389);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(5,5));
		Border buttonEdge = BorderFactory.createRaisedBevelBorder();
		JPanel fp = new JPanel(new GridLayout(3,1));
		JLabel sendLabel = new JLabel("Message to Send:");
		messageToSend = new JTextField();
		JPanel sendPanel = new JPanel();
		send = new JButton("Send");
		send.setBorder(buttonEdge);
		send.addActionListener(new ButtonListener());
		send.setEnabled(false);
		sendPanel.add(send);
		fp.add(sendLabel);
		fp.add(messageToSend);
		fp.add(sendPanel);
		panel_2.add(fp, BorderLayout.NORTH);
		
		JPanel sp = new JPanel(new BorderLayout());
		JLabel receiveLabel = new JLabel("Message Board");
		displayMessage = new JTextArea();
		displayMessage.setBorder(BorderFactory.createEtchedBorder());
		displayMessage.setEditable(false);
		sp.add(receiveLabel, BorderLayout.NORTH);
		sp.add(displayMessage, BorderLayout.CENTER);
		panel_2.add(sp,BorderLayout.CENTER);
		
		JPanel tp = new JPanel(new GridLayout(1,2));
		JPanel cp = new JPanel();
		connect = new JButton("Connect");
		connect.setBorder(buttonEdge);
		connect.addActionListener(new ButtonListener());
		connect.setEnabled(true);
		cp.add(connect);
		JPanel dPanel = new JPanel();
		disconnect = new JButton("Disconnect");
		disconnect.setBorder(buttonEdge);
		disconnect.addActionListener(new ButtonListener());
		disconnect.setEnabled(false);
		dPanel.add(disconnect);
		
		tp.add(cp);
		tp.add(dPanel);
		panel_2.add(tp, BorderLayout.SOUTH);
	}

	private void createAttackGrid() {
		char alphabets='A';
		int numbers=1;
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				
				
				if(i==0 && j==0) {
					JLabel tempLabel= new JLabel(" ");
					tempLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
					GridBagConstraints temp = new GridBagConstraints();
					temp.insets = new Insets(0, 0, 5, 5);
					temp.gridx = j+1;
					temp.gridy = i+1;
					panel_1.add(tempLabel, temp);

				}
				if(i==0 && j>0) {
					JLabel tempLabel= new JLabel(Character.toString(alphabets));
					tempLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
					GridBagConstraints temp = new GridBagConstraints();
					temp.insets = new Insets(0, 0, 5, 5);
					temp.gridx = j+1;
					temp.gridy = i+1;
					panel_1.add(tempLabel, temp);
					alphabets++;
				}
				if(i!=0 && j==0) {
					JLabel tempLabel= new JLabel(""+numbers);
					tempLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
					GridBagConstraints temp = new GridBagConstraints();
					temp.insets = new Insets(0, 0, 5, 5);
					temp.gridx = j+1;
					temp.gridy = i+1;
					panel_1.add(tempLabel, temp);
					numbers++;
				}
			}
		}
		
		for ( int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				final int tempI=i;
				final int tempJ=j;
				attackMatrix[i][j] = new JButton("");
				attackMatrix[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						onClick(tempI, tempJ);
					}
				});
				attackMatrix[i][j].setForeground(Color.BLACK);
				attackMatrix[i][j].setFont(new Font("Tahoma", Font.PLAIN, 15));
				attackMatrix[i][j].setBackground(Color.PINK);
				attackMatrix[i][j].setPreferredSize(new Dimension(29, 29));
				GridBagConstraints temp = new GridBagConstraints();
				temp.insets = new Insets(0, 0, 5, 5);
				temp.gridx = j + 2;
				temp.gridy = i + 2;
				panel_1.add(attackMatrix[i][j], temp);
				
			}
		}

	}

	protected void onClick(int i, int j) {
	
		this.i =  i;
		this.j = j;
		
		opponentMove = new Moves(false, i, j);
		///////Seennndddddd to Oppenent////////(i,j, isPlaying()) -> OOS
			
			try {
				oos.writeObject(opponentMove);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		/////////////////////////
			
		
					//if (Received) - From New Class -> Then send to gme
		/////////////////////////
		//playResult = gme.hit(i,j);
		//gme.hitMiss(i, j, playResult);
		
		System.out.println(i+","+j);
		
	}

	private void createPlayerGrid() {

		playerMatrix = new JButton[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				playerMatrix[i][j] = new JButton("");
				playerMatrix[i][j].setForeground(Color.BLACK);
				playerMatrix[i][j].setFont(new Font("Tahoma", Font.PLAIN, 15));
				playerMatrix[i][j].setBackground(Color.PINK);
				
				
				
				
				playerMatrix[i][j].setPreferredSize(new Dimension(20, 20));
				playerMatrix[i][j].setEnabled(false);
				if (tempMatrix[i][j].getBackground() != Color.PINK ) {
					playerMatrix[i][j].setBackground(tempMatrix[i][j].getBackground());
				}
				GridBagConstraints temp = new GridBagConstraints();
				temp.insets = new Insets(0, 0, 5, 5);
				temp.gridx = j + 1;
				temp.gridy = i + 1;
				panel.add(playerMatrix[i][j], temp);
			}
		}
	}
	
	@SuppressWarnings("unused")
	@Override
	public void update(Observable o, Object arg)
	{
		if (arg instanceof Message)
		{
			Message m = (Message)arg;		
			String msg = m.getUser()+": "+m.getMsg()+" ("+m.getTimeStamp()+")";
			displayMessage.append(msg+"\n");
		
			// connected to another person
			if (m.getMsg().compareTo("You can start chatting!") == 0)
			{
				send.setEnabled(true); // now i can TALK!
				disconnect.setEnabled(true); // and if i don't like the other person, i can run away!
			}
		
			// the other person ran away!
			if (m.getMsg().compareTo("has disconnected.") == 0)
			{
				// i didn't quit the session, so i get to keep my username
				newSession = false;
				disconnectMe(); // drop current session
				connectMe(); // start new session
			}
		
		}
		
		else if (arg instanceof Moves)
			{ //This is where we have to be sending the coordinates for the player grid so that the opponent can update us on if we hit them. }
			
			//2 Change at Receive
			
			Moves opponentMove = (Moves)arg;
			
			this.i = opponentMove.getI();
			this.j = opponentMove.getJ();
			
		//	if(gme.isPlaying() == false)
			if(true)
			{ 
			playResult = gme.hit(i,j);
			
			//3  Send hit or miss string to OG machine
			
			opponentMove = new Moves(playResult);
			opponentMove.setPlayResult(playResult);
			
			try {
				oos.writeObject(opponentMove);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//4 OG Machine makes changes and cycle restarts

				gme.setPlaying(true);
				
				disconnectMe(); // drop current session
				connectMe(); // start new session
			
			}
			else if(gme.isPlaying()) {
				opponentMove = (Moves)arg;
				this.playResult = opponentMove.getPlayResult();
				gme.hitMiss(i, j, playResult);
			    gme.setPlaying(false);
			    disconnectMe(); // drop current session
				connectMe(); // start new session
			
			}
				
		}
	
	}
	

	public void connectMe()
	{
		try
		{
			socket = new Socket("localhost",5555);
			// if i didn't disconnect, i want to keep my username
			if(newSession==true)
			{
				userName = "Beans";
			}
			connect.setEnabled(false);
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			displayMessage.append("Connected! Waiting for a chat partner...\n");
			
			//start an input listener thread
			listener = new InputListener(socket,AttackingWindow.this);
			Thread t1 = new Thread(listener);
			t1.start();
		}
		catch (HeadlessException e1)
		{
			e1.printStackTrace();
		}
		catch (UnknownHostException e1)
		{
			e1.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}
	
	public void disconnectMe()
	{
		displayMessage.append("Disconnected.\n");
		disconnect.setEnabled(false);
		send.setEnabled(false);
		connect.setEnabled(true);
		try
		{
			oos.close();
			//socket.close();
			//listener = null;
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}
	
//***************************************************(
	private class ButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == connect)
			{
				// if i can get to this button, it means i want to start a new chat session
				newSession = true;
				connectMe();
			}
			if(e.getSource() == send)
			{
				Message m = new Message(userName,messageToSend.getText(),new Date());
				
				try
				{
					oos.writeObject(m);
					displayMessage.append("Me: "+m.getMsg()+" ("+m.getTimeStamp()+")\n");
					messageToSend.setText("");
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
			
			if(e.getSource() == disconnect)
			{
				// if i hit this button, it means i want to quit
				newSession = true;
				Message m = new Message(userName,"has disconnected.",new Date());
				try
				{
					oos.writeObject(m);
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
				disconnectMe();
			}
		}
	}
}
	








