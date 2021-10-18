package game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainWindow {

	private JFrame frame;
	private JButton[][] matrix;
	private JComboBox<?> comboBox;

	

	/**
	 * Create the application.
	 */
	public mainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(722, 522);
		frame.setVisible(true);
		frame.setResizable(false);

		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Deploy Your Ships");
		lblNewLabel.setBounds(214, 10, 268, 44);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Chose the ship to deploy");
		lblNewLabel_1.setBounds(530, 53, 172, 24);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);
		String[] ships = { "Aircraft Carrier - 5", "Battleship - 4", "Cruiser - 3", "Submarine - 3", "Destroyer - 2" };
		comboBox = new JComboBox(ships);
		comboBox.setBounds(530, 87, 148, 21);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("Start Attacking");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(comboBox.getItemCount()==0) {
						frame.setVisible(false);
						AttackingWindow window = new AttackingWindow(matrix);
						
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please deploy all the ships before attacking!");
					}
				} catch (Exception e11) {
					e11.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(540, 404, 138, 34);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnNewButton);

		Panel panel = new Panel();
		panel.setBounds(10, 103, 514, 372);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel_2 = new JLabel("    ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("  A  ");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lblNewLabel_2_1.gridx = 2;
		gbc_lblNewLabel_2_1.gridy = 1;
		panel.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("  B  ");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_1.gridx = 3;
		gbc_lblNewLabel_2_1_1.gridy = 1;
		panel.add(lblNewLabel_2_1_1, gbc_lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_2 = new JLabel("  C  ");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2.gridx = 4;
		gbc_lblNewLabel_2_1_2.gridy = 1;
		panel.add(lblNewLabel_2_1_2, gbc_lblNewLabel_2_1_2);

		JLabel lblNewLabel_2_1_2_1 = new JLabel("  D  ");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2_1.gridx = 5;
		gbc_lblNewLabel_2_1_2_1.gridy = 1;
		panel.add(lblNewLabel_2_1_2_1, gbc_lblNewLabel_2_1_2_1);

		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("  E  ");
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2_1_1.gridx = 6;
		gbc_lblNewLabel_2_1_2_1_1.gridy = 1;
		panel.add(lblNewLabel_2_1_2_1_1, gbc_lblNewLabel_2_1_2_1_1);

		JLabel lblNewLabel_2_1_2_1_2 = new JLabel("  F  ");
		lblNewLabel_2_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2_1_2.gridx = 7;
		gbc_lblNewLabel_2_1_2_1_2.gridy = 1;
		panel.add(lblNewLabel_2_1_2_1_2, gbc_lblNewLabel_2_1_2_1_2);

		JLabel lblNewLabel_2_1_2_1_3 = new JLabel("  G  ");
		lblNewLabel_2_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2_1_3.gridx = 8;
		gbc_lblNewLabel_2_1_2_1_3.gridy = 1;
		panel.add(lblNewLabel_2_1_2_1_3, gbc_lblNewLabel_2_1_2_1_3);

		JLabel lblNewLabel_2_1_2_1_4 = new JLabel("  H  ");
		lblNewLabel_2_1_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2_1_4 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2_1_4.gridx = 9;
		gbc_lblNewLabel_2_1_2_1_4.gridy = 1;
		panel.add(lblNewLabel_2_1_2_1_4, gbc_lblNewLabel_2_1_2_1_4);

		JLabel lblNewLabel_2_1_2_1_5 = new JLabel("  I  ");
		lblNewLabel_2_1_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2_1_5 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2_1_5.gridx = 10;
		gbc_lblNewLabel_2_1_2_1_5.gridy = 1;
		panel.add(lblNewLabel_2_1_2_1_5, gbc_lblNewLabel_2_1_2_1_5);

		JLabel lblNewLabel_2_1_2_1_6 = new JLabel("  J  ");
		lblNewLabel_2_1_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_2_1_6 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_2_1_6.gridx = 11;
		gbc_lblNewLabel_2_1_2_1_6.gridy = 1;
		panel.add(lblNewLabel_2_1_2_1_6, gbc_lblNewLabel_2_1_2_1_6);

		JLabel lblNewLabel_2_1_3 = new JLabel("1");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_3.gridx = 1;
		gbc_lblNewLabel_2_1_3.gridy = 2;
		panel.add(lblNewLabel_2_1_3, gbc_lblNewLabel_2_1_3);

		JButton btn0_0 = new JButton("  ");
		btn0_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 0);
			}
		});
//		btnNewButton_1.setBorderPainted(false);
		btn0_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_0.setBackground(Color.PINK);
		btn0_0.setForeground(Color.BLACK);
		GridBagConstraints gbc_btn0_0 = new GridBagConstraints();
		gbc_btn0_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_0.gridx = 2;
		gbc_btn0_0.gridy = 2;
		panel.add(btn0_0, gbc_btn0_0);

		JButton btn0_1 = new JButton("  ");
		btn0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 1);
			}
		});
		btn0_1.setForeground(Color.BLACK);
		btn0_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_1 = new GridBagConstraints();
		gbc_btn0_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_1.gridx = 3;
		gbc_btn0_1.gridy = 2;
		panel.add(btn0_1, gbc_btn0_1);

		JButton btn0_2 = new JButton("  ");
		btn0_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 2);
			}
		});
		btn0_2.setForeground(Color.BLACK);
		btn0_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_2 = new GridBagConstraints();
		gbc_btn0_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_2.gridx = 4;
		gbc_btn0_2.gridy = 2;
		panel.add(btn0_2, gbc_btn0_2);

		JButton btn0_3 = new JButton("  ");
		btn0_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 3);
			}
		});
		btn0_3.setForeground(Color.BLACK);
		btn0_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_3 = new GridBagConstraints();
		gbc_btn0_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_3.gridx = 5;
		gbc_btn0_3.gridy = 2;
		panel.add(btn0_3, gbc_btn0_3);

		JButton btn0_4 = new JButton("  ");
		btn0_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 4);
			}
		});
		btn0_4.setForeground(Color.BLACK);
		btn0_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_4 = new GridBagConstraints();
		gbc_btn0_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_4.gridx = 6;
		gbc_btn0_4.gridy = 2;
		panel.add(btn0_4, gbc_btn0_4);

		JButton btn0_5 = new JButton("  ");
		btn0_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 5);
			}
		});
		btn0_5.setForeground(Color.BLACK);
		btn0_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_5 = new GridBagConstraints();
		gbc_btn0_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_5.gridx = 7;
		gbc_btn0_5.gridy = 2;
		panel.add(btn0_5, gbc_btn0_5);

		JButton btn0_6 = new JButton("  ");
		btn0_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 6);
			}
		});
		btn0_6.setForeground(Color.BLACK);
		btn0_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_6 = new GridBagConstraints();
		gbc_btn0_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_6.gridx = 8;
		gbc_btn0_6.gridy = 2;
		panel.add(btn0_6, gbc_btn0_6);

		JButton btn0_7 = new JButton("  ");
		btn0_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 7);
			}
		});
		btn0_7.setForeground(Color.BLACK);
		btn0_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_7 = new GridBagConstraints();
		gbc_btn0_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_7.gridx = 9;
		gbc_btn0_7.gridy = 2;
		panel.add(btn0_7, gbc_btn0_7);

		JButton btn0_8 = new JButton("  ");
		btn0_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 8);
			}
		});
		btn0_8.setForeground(Color.BLACK);
		btn0_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_8 = new GridBagConstraints();
		gbc_btn0_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_8.gridx = 10;
		gbc_btn0_8.gridy = 2;
		panel.add(btn0_8, gbc_btn0_8);

		JButton btn0_9 = new JButton("  ");
		btn0_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(0, 9);
			}
		});
		btn0_9.setForeground(Color.BLACK);
		btn0_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn0_9 = new GridBagConstraints();
		gbc_btn0_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_9.gridx = 11;
		gbc_btn0_9.gridy = 2;
		panel.add(btn0_9, gbc_btn0_9);

		JLabel lblNewLabel_2_1_4 = new JLabel("2");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_4 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_4.gridx = 1;
		gbc_lblNewLabel_2_1_4.gridy = 3;
		panel.add(lblNewLabel_2_1_4, gbc_lblNewLabel_2_1_4);

		JButton btn1_0 = new JButton("  ");
		btn1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 0);
			}
		});
		btn1_0.setForeground(Color.BLACK);
		btn1_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_0 = new GridBagConstraints();
		gbc_btn1_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_0.gridx = 2;
		gbc_btn1_0.gridy = 3;
		panel.add(btn1_0, gbc_btn1_0);

		JButton btn1_1 = new JButton("  ");
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 1);

			}
		});
		btn1_1.setForeground(Color.BLACK);
		btn1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_1 = new GridBagConstraints();
		gbc_btn1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_1.gridx = 3;
		gbc_btn1_1.gridy = 3;
		panel.add(btn1_1, gbc_btn1_1);

		JButton btn1_2 = new JButton("  ");
		btn1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 2);
			}
		});
		btn1_2.setForeground(Color.BLACK);
		btn1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_2 = new GridBagConstraints();
		gbc_btn1_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_2.gridx = 4;
		gbc_btn1_2.gridy = 3;
		panel.add(btn1_2, gbc_btn1_2);

		JButton btn1_3 = new JButton("  ");
		btn1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 3);

			}
		});
		btn1_3.setForeground(Color.BLACK);
		btn1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_3 = new GridBagConstraints();
		gbc_btn1_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_3.gridx = 5;
		gbc_btn1_3.gridy = 3;
		panel.add(btn1_3, gbc_btn1_3);

		JButton btn1_4 = new JButton("  ");
		btn1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 4);

			}
		});
		btn1_4.setForeground(Color.BLACK);
		btn1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_4 = new GridBagConstraints();
		gbc_btn1_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_4.gridx = 6;
		gbc_btn1_4.gridy = 3;
		panel.add(btn1_4, gbc_btn1_4);

		JButton btn1_5 = new JButton("  ");
		btn1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 5);

			}
		});
		btn1_5.setForeground(Color.BLACK);
		btn1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_5 = new GridBagConstraints();
		gbc_btn1_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_5.gridx = 7;
		gbc_btn1_5.gridy = 3;
		panel.add(btn1_5, gbc_btn1_5);

		JButton btn1_6 = new JButton("  ");
		btn1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 6);

			}
		});
		btn1_6.setForeground(Color.BLACK);
		btn1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_6 = new GridBagConstraints();
		gbc_btn1_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_6.gridx = 8;
		gbc_btn1_6.gridy = 3;
		panel.add(btn1_6, gbc_btn1_6);

		JButton btn1_7 = new JButton("  ");
		btn1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 7);

			}
		});
		btn1_7.setForeground(Color.BLACK);
		btn1_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_7 = new GridBagConstraints();
		gbc_btn1_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_7.gridx = 9;
		gbc_btn1_7.gridy = 3;
		panel.add(btn1_7, gbc_btn1_7);

		JButton btn1_8 = new JButton("  ");
		btn1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 8);

			}
		});
		btn1_8.setForeground(Color.BLACK);
		btn1_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_8 = new GridBagConstraints();
		gbc_btn1_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_8.gridx = 10;
		gbc_btn1_8.gridy = 3;
		panel.add(btn1_8, gbc_btn1_8);

		JButton btn1_9 = new JButton("  ");
		btn1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(1, 9);

			}
		});
		btn1_9.setForeground(Color.BLACK);
		btn1_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn1_9 = new GridBagConstraints();
		gbc_btn1_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn1_9.gridx = 11;
		gbc_btn1_9.gridy = 3;
		panel.add(btn1_9, gbc_btn1_9);

		JLabel lblNewLabel_2_1_5 = new JLabel("3");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_5 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_5.gridx = 1;
		gbc_lblNewLabel_2_1_5.gridy = 4;
		panel.add(lblNewLabel_2_1_5, gbc_lblNewLabel_2_1_5);

		JButton btn2_0 = new JButton("  ");
		btn2_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 0);

			}
		});
		btn2_0.setForeground(Color.BLACK);
		btn2_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_0 = new GridBagConstraints();
		gbc_btn2_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_0.gridx = 2;
		gbc_btn2_0.gridy = 4;
		panel.add(btn2_0, gbc_btn2_0);

		JButton btn2_1 = new JButton("  ");
		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 1);
			}
		});
		btn2_1.setForeground(Color.BLACK);
		btn2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_1 = new GridBagConstraints();
		gbc_btn2_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_1.gridx = 3;
		gbc_btn2_1.gridy = 4;
		panel.add(btn2_1, gbc_btn2_1);

		JButton btn2_2 = new JButton("  ");
		btn2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 2);
			}
		});
		btn2_2.setForeground(Color.BLACK);
		btn2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_2 = new GridBagConstraints();
		gbc_btn2_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_2.gridx = 4;
		gbc_btn2_2.gridy = 4;
		panel.add(btn2_2, gbc_btn2_2);

		JButton btn2_3 = new JButton("  ");
		btn2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 3);
			}
		});
		btn2_3.setForeground(Color.BLACK);
		btn2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_3 = new GridBagConstraints();
		gbc_btn2_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_3.gridx = 5;
		gbc_btn2_3.gridy = 4;
		panel.add(btn2_3, gbc_btn2_3);

		JButton btn2_4 = new JButton("  ");
		btn2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 4);
			}
		});
		btn2_4.setForeground(Color.BLACK);
		btn2_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_4 = new GridBagConstraints();
		gbc_btn2_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_4.gridx = 6;
		gbc_btn2_4.gridy = 4;
		panel.add(btn2_4, gbc_btn2_4);

		JButton btn2_5 = new JButton("  ");
		btn2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 5);
			}
		});
		btn2_5.setForeground(Color.BLACK);
		btn2_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_5 = new GridBagConstraints();
		gbc_btn2_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_5.gridx = 7;
		gbc_btn2_5.gridy = 4;
		panel.add(btn2_5, gbc_btn2_5);

		JButton btn2_6 = new JButton("  ");
		btn2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 6);
			}
		});
		btn2_6.setForeground(Color.BLACK);
		btn2_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_6 = new GridBagConstraints();
		gbc_btn2_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_6.gridx = 8;
		gbc_btn2_6.gridy = 4;
		panel.add(btn2_6, gbc_btn2_6);

		JButton btn2_7 = new JButton("  ");
		btn2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 7);
			}
		});
		btn2_7.setForeground(Color.BLACK);
		btn2_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_7 = new GridBagConstraints();
		gbc_btn2_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_7.gridx = 9;
		gbc_btn2_7.gridy = 4;
		panel.add(btn2_7, gbc_btn2_7);

		JButton btn2_8 = new JButton("  ");
		btn2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 8);
			}
		});
		btn2_8.setForeground(Color.BLACK);
		btn2_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_8 = new GridBagConstraints();
		gbc_btn2_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_8.gridx = 10;
		gbc_btn2_8.gridy = 4;
		panel.add(btn2_8, gbc_btn2_8);

		JButton btn2_9 = new JButton("  ");
		btn2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(2, 9);
			}
		});
		btn2_9.setForeground(Color.BLACK);
		btn2_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn2_9 = new GridBagConstraints();
		gbc_btn2_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn2_9.gridx = 11;
		gbc_btn2_9.gridy = 4;
		panel.add(btn2_9, gbc_btn2_9);

		JLabel lblNewLabel_2_1_6 = new JLabel("4");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_6 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_6.gridx = 1;
		gbc_lblNewLabel_2_1_6.gridy = 5;
		panel.add(lblNewLabel_2_1_6, gbc_lblNewLabel_2_1_6);

		JButton btn3_0 = new JButton("  ");
		btn3_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 0);
			}
		});
		btn3_0.setForeground(Color.BLACK);
		btn3_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_0 = new GridBagConstraints();
		gbc_btn3_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_0.gridx = 2;
		gbc_btn3_0.gridy = 5;
		panel.add(btn3_0, gbc_btn3_0);

		JButton btn3_1 = new JButton("  ");
		btn3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 1);
			}
		});
		btn3_1.setForeground(Color.BLACK);
		btn3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_1 = new GridBagConstraints();
		gbc_btn3_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_1.gridx = 3;
		gbc_btn3_1.gridy = 5;
		panel.add(btn3_1, gbc_btn3_1);

		JButton btn3_2 = new JButton("  ");
		btn3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 2);
			}
		});
		btn3_2.setForeground(Color.BLACK);
		btn3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_2 = new GridBagConstraints();
		gbc_btn3_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_2.gridx = 4;
		gbc_btn3_2.gridy = 5;
		panel.add(btn3_2, gbc_btn3_2);

		JButton btn3_3 = new JButton("  ");
		btn3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 3);
			}
		});
		btn3_3.setForeground(Color.BLACK);
		btn3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_3 = new GridBagConstraints();
		gbc_btn3_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_3.gridx = 5;
		gbc_btn3_3.gridy = 5;
		panel.add(btn3_3, gbc_btn3_3);

		JButton btn3_4 = new JButton("  ");
		btn3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 4);
			}
		});
		btn3_4.setForeground(Color.BLACK);
		btn3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_4 = new GridBagConstraints();
		gbc_btn3_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_4.gridx = 6;
		gbc_btn3_4.gridy = 5;
		panel.add(btn3_4, gbc_btn3_4);

		JButton btn3_5 = new JButton("  ");
		btn3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 5);
			}
		});
		btn3_5.setForeground(Color.BLACK);
		btn3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_5 = new GridBagConstraints();
		gbc_btn3_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_5.gridx = 7;
		gbc_btn3_5.gridy = 5;
		panel.add(btn3_5, gbc_btn3_5);

		JButton btn3_6 = new JButton("  ");
		btn3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 6);
			}
		});
		btn3_6.setForeground(Color.BLACK);
		btn3_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_6 = new GridBagConstraints();
		gbc_btn3_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_6.gridx = 8;
		gbc_btn3_6.gridy = 5;
		panel.add(btn3_6, gbc_btn3_6);

		JButton btn3_7 = new JButton("  ");
		btn3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 7);
			}
		});
		btn3_7.setForeground(Color.BLACK);
		btn3_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_7 = new GridBagConstraints();
		gbc_btn3_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_7.gridx = 9;
		gbc_btn3_7.gridy = 5;
		panel.add(btn3_7, gbc_btn3_7);

		JButton btn3_8 = new JButton("  ");
		btn3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 8);
			}
		});
		btn3_8.setForeground(Color.BLACK);
		btn3_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_8 = new GridBagConstraints();
		gbc_btn3_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_8.gridx = 10;
		gbc_btn3_8.gridy = 5;
		panel.add(btn3_8, gbc_btn3_8);

		JButton btn3_9 = new JButton("  ");
		btn3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(3, 9);
			}
		});
		btn3_9.setForeground(Color.BLACK);
		btn3_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn3_9 = new GridBagConstraints();
		gbc_btn3_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn3_9.gridx = 11;
		gbc_btn3_9.gridy = 5;
		panel.add(btn3_9, gbc_btn3_9);

		JLabel lblNewLabel_2_1_7 = new JLabel("5");
		lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_7 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_7.gridx = 1;
		gbc_lblNewLabel_2_1_7.gridy = 6;
		panel.add(lblNewLabel_2_1_7, gbc_lblNewLabel_2_1_7);

		JButton btn4_0 = new JButton("  ");
		btn4_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 0);
			}
		});
		btn4_0.setForeground(Color.BLACK);
		btn4_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_0 = new GridBagConstraints();
		gbc_btn4_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_0.gridx = 2;
		gbc_btn4_0.gridy = 6;
		panel.add(btn4_0, gbc_btn4_0);

		JButton btn4_1 = new JButton("  ");
		btn4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 1);
			}
		});
		btn4_1.setForeground(Color.BLACK);
		btn4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_1 = new GridBagConstraints();
		gbc_btn4_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_1.gridx = 3;
		gbc_btn4_1.gridy = 6;
		panel.add(btn4_1, gbc_btn4_1);

		JButton btn4_2 = new JButton("  ");
		btn4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 2);
			}
		});
		btn4_2.setForeground(Color.BLACK);
		btn4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_2 = new GridBagConstraints();
		gbc_btn4_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_2.gridx = 4;
		gbc_btn4_2.gridy = 6;
		panel.add(btn4_2, gbc_btn4_2);

		JButton btn4_3 = new JButton("  ");
		btn4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 3);
			}
		});
		btn4_3.setForeground(Color.BLACK);
		btn4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_3 = new GridBagConstraints();
		gbc_btn4_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_3.gridx = 5;
		gbc_btn4_3.gridy = 6;
		panel.add(btn4_3, gbc_btn4_3);

		JButton btn4_4 = new JButton("  ");
		btn4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 4);
			}
		});
		btn4_4.setForeground(Color.BLACK);
		btn4_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_4 = new GridBagConstraints();
		gbc_btn4_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_4.gridx = 6;
		gbc_btn4_4.gridy = 6;
		panel.add(btn4_4, gbc_btn4_4);

		JButton btn4_5 = new JButton("  ");
		btn4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 5);
			}
		});
		btn4_5.setForeground(Color.BLACK);
		btn4_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_5 = new GridBagConstraints();
		gbc_btn4_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_5.gridx = 7;
		gbc_btn4_5.gridy = 6;
		panel.add(btn4_5, gbc_btn4_5);

		JButton btn4_6 = new JButton("  ");
		btn4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 6);
			}
		});
		btn4_6.setForeground(Color.BLACK);
		btn4_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_6 = new GridBagConstraints();
		gbc_btn4_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_6.gridx = 8;
		gbc_btn4_6.gridy = 6;
		panel.add(btn4_6, gbc_btn4_6);

		JButton btn4_7 = new JButton("  ");
		btn4_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 7);
			}
		});
		btn4_7.setForeground(Color.BLACK);
		btn4_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_7 = new GridBagConstraints();
		gbc_btn4_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_7.gridx = 9;
		gbc_btn4_7.gridy = 6;
		panel.add(btn4_7, gbc_btn4_7);

		JButton btn4_8 = new JButton("  ");
		btn4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 8);
			}
		});
		btn4_8.setForeground(Color.BLACK);
		btn4_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_8 = new GridBagConstraints();
		gbc_btn4_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_8.gridx = 10;
		gbc_btn4_8.gridy = 6;
		panel.add(btn4_8, gbc_btn4_8);

		JButton btn4_9 = new JButton("  ");
		btn4_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(4, 9);
			}
		});
		btn4_9.setForeground(Color.BLACK);
		btn4_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn4_9 = new GridBagConstraints();
		gbc_btn4_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn4_9.gridx = 11;
		gbc_btn4_9.gridy = 6;
		panel.add(btn4_9, gbc_btn4_9);

		JLabel lblNewLabel_2_1_8 = new JLabel("6");
		lblNewLabel_2_1_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_8 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_8.gridx = 1;
		gbc_lblNewLabel_2_1_8.gridy = 7;
		panel.add(lblNewLabel_2_1_8, gbc_lblNewLabel_2_1_8);

		JButton btn5_0 = new JButton("  ");
		btn5_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 0);
			}
		});
		btn5_0.setForeground(Color.BLACK);
		btn5_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_0 = new GridBagConstraints();
		gbc_btn5_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_0.gridx = 2;
		gbc_btn5_0.gridy = 7;
		panel.add(btn5_0, gbc_btn5_0);

		JButton btn5_1 = new JButton("  ");
		btn5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 1);
			}
		});
		btn5_1.setForeground(Color.BLACK);
		btn5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_1 = new GridBagConstraints();
		gbc_btn5_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_1.gridx = 3;
		gbc_btn5_1.gridy = 7;
		panel.add(btn5_1, gbc_btn5_1);

		JButton btn5_2 = new JButton("  ");
		btn5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 2);
			}
		});
		btn5_2.setForeground(Color.BLACK);
		btn5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_2 = new GridBagConstraints();
		gbc_btn5_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_2.gridx = 4;
		gbc_btn5_2.gridy = 7;
		panel.add(btn5_2, gbc_btn5_2);

		JButton btn5_3 = new JButton("  ");
		btn5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 3);
			}
		});
		btn5_3.setForeground(Color.BLACK);
		btn5_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_3 = new GridBagConstraints();
		gbc_btn5_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_3.gridx = 5;
		gbc_btn5_3.gridy = 7;
		panel.add(btn5_3, gbc_btn5_3);

		JButton btn5_4 = new JButton("  ");
		btn5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 4);
			}
		});
		btn5_4.setForeground(Color.BLACK);
		btn5_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_4 = new GridBagConstraints();
		gbc_btn5_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_4.gridx = 6;
		gbc_btn5_4.gridy = 7;
		panel.add(btn5_4, gbc_btn5_4);

		JButton btn5_5 = new JButton("  ");
		btn5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 5);
			}
		});
		btn5_5.setForeground(Color.BLACK);
		btn5_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_5 = new GridBagConstraints();
		gbc_btn5_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_5.gridx = 7;
		gbc_btn5_5.gridy = 7;
		panel.add(btn5_5, gbc_btn5_5);

		JButton btn5_6 = new JButton("  ");
		btn5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 6);
			}
		});
		btn5_6.setForeground(Color.BLACK);
		btn5_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_6 = new GridBagConstraints();
		gbc_btn5_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_6.gridx = 8;
		gbc_btn5_6.gridy = 7;
		panel.add(btn5_6, gbc_btn5_6);

		JButton btn5_7 = new JButton("  ");
		btn5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 7);
			}
		});
		btn5_7.setForeground(Color.BLACK);
		btn5_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_7 = new GridBagConstraints();
		gbc_btn5_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_7.gridx = 9;
		gbc_btn5_7.gridy = 7;
		panel.add(btn5_7, gbc_btn5_7);

		JButton btn5_8 = new JButton("  ");
		btn5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 8);
			}
		});
		btn5_8.setForeground(Color.BLACK);
		btn5_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_8 = new GridBagConstraints();
		gbc_btn5_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_8.gridx = 10;
		gbc_btn5_8.gridy = 7;
		panel.add(btn5_8, gbc_btn5_8);

		JButton btn5_9 = new JButton("  ");
		btn5_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(5, 9);
			}
		});
		btn5_9.setForeground(Color.BLACK);
		btn5_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn5_9 = new GridBagConstraints();
		gbc_btn5_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn5_9.gridx = 11;
		gbc_btn5_9.gridy = 7;
		panel.add(btn5_9, gbc_btn5_9);

		JLabel lblNewLabel_2_1_9 = new JLabel("7");
		lblNewLabel_2_1_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_9 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_9.gridx = 1;
		gbc_lblNewLabel_2_1_9.gridy = 8;
		panel.add(lblNewLabel_2_1_9, gbc_lblNewLabel_2_1_9);

		JButton btn6_0 = new JButton("  ");
		btn6_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 0);
			}
		});
		btn6_0.setForeground(Color.BLACK);
		btn6_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_0 = new GridBagConstraints();
		gbc_btn6_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_0.gridx = 2;
		gbc_btn6_0.gridy = 8;
		panel.add(btn6_0, gbc_btn6_0);

		JButton btn6_1 = new JButton("  ");
		btn6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 1);
			}
		});
		btn6_1.setForeground(Color.BLACK);
		btn6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_1 = new GridBagConstraints();
		gbc_btn6_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_1.gridx = 3;
		gbc_btn6_1.gridy = 8;
		panel.add(btn6_1, gbc_btn6_1);

		JButton btn6_2 = new JButton("  ");
		btn6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 2);
			}
		});
		btn6_2.setForeground(Color.BLACK);
		btn6_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_2 = new GridBagConstraints();
		gbc_btn6_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_2.gridx = 4;
		gbc_btn6_2.gridy = 8;
		panel.add(btn6_2, gbc_btn6_2);

		JButton btn6_3 = new JButton("  ");
		btn6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 3);
			}
		});
		btn6_3.setForeground(Color.BLACK);
		btn6_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_3 = new GridBagConstraints();
		gbc_btn6_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_3.gridx = 5;
		gbc_btn6_3.gridy = 8;
		panel.add(btn6_3, gbc_btn6_3);

		JButton btn6_4 = new JButton("  ");
		btn6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 4);
			}
		});
		btn6_4.setForeground(Color.BLACK);
		btn6_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_4 = new GridBagConstraints();
		gbc_btn6_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_4.gridx = 6;
		gbc_btn6_4.gridy = 8;
		panel.add(btn6_4, gbc_btn6_4);

		JButton btn6_5 = new JButton("  ");
		btn6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 5);
			}
		});
		btn6_5.setForeground(Color.BLACK);
		btn6_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_5 = new GridBagConstraints();
		gbc_btn6_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_5.gridx = 7;
		gbc_btn6_5.gridy = 8;
		panel.add(btn6_5, gbc_btn6_5);

		JButton btn6_6 = new JButton("  ");
		btn6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 6);
			}
		});
		btn6_6.setForeground(Color.BLACK);
		btn6_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_6 = new GridBagConstraints();
		gbc_btn6_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_6.gridx = 8;
		gbc_btn6_6.gridy = 8;
		panel.add(btn6_6, gbc_btn6_6);

		JButton btn6_7 = new JButton("  ");
		btn6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 7);
			}
		});
		btn6_7.setForeground(Color.BLACK);
		btn6_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_7 = new GridBagConstraints();
		gbc_btn6_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_7.gridx = 9;
		gbc_btn6_7.gridy = 8;
		panel.add(btn6_7, gbc_btn6_7);

		JButton btn6_8 = new JButton("  ");
		btn6_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 8);
			}
		});
		btn6_8.setForeground(Color.BLACK);
		btn6_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_8 = new GridBagConstraints();
		gbc_btn6_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_8.gridx = 10;
		gbc_btn6_8.gridy = 8;
		panel.add(btn6_8, gbc_btn6_8);

		JButton btn6_9 = new JButton("  ");
		btn6_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(6, 9);
			}
		});
		btn6_9.setForeground(Color.BLACK);
		btn6_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn6_9 = new GridBagConstraints();
		gbc_btn6_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn6_9.gridx = 11;
		gbc_btn6_9.gridy = 8;
		panel.add(btn6_9, gbc_btn6_9);

		JLabel lblNewLabel_2_1_10 = new JLabel("8");
		lblNewLabel_2_1_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_10 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_10.gridx = 1;
		gbc_lblNewLabel_2_1_10.gridy = 9;
		panel.add(lblNewLabel_2_1_10, gbc_lblNewLabel_2_1_10);

		JButton btn7_0 = new JButton("  ");
		btn7_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 0);
			}
		});
		btn7_0.setForeground(Color.BLACK);
		btn7_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_0 = new GridBagConstraints();
		gbc_btn7_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_0.gridx = 2;
		gbc_btn7_0.gridy = 9;
		panel.add(btn7_0, gbc_btn7_0);

		JButton btn7_1 = new JButton("  ");
		btn7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 1);
			}
		});
		btn7_1.setForeground(Color.BLACK);
		btn7_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_1 = new GridBagConstraints();
		gbc_btn7_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_1.gridx = 3;
		gbc_btn7_1.gridy = 9;
		panel.add(btn7_1, gbc_btn7_1);

		JButton btn7_2 = new JButton("  ");
		btn7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 2);
			}
		});
		btn7_2.setForeground(Color.BLACK);
		btn7_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_2 = new GridBagConstraints();
		gbc_btn7_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_2.gridx = 4;
		gbc_btn7_2.gridy = 9;
		panel.add(btn7_2, gbc_btn7_2);

		JButton btn7_3 = new JButton("  ");
		btn7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 3);
			}
		});
		btn7_3.setForeground(Color.BLACK);
		btn7_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_3 = new GridBagConstraints();
		gbc_btn7_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_3.gridx = 5;
		gbc_btn7_3.gridy = 9;
		panel.add(btn7_3, gbc_btn7_3);

		JButton btn7_4 = new JButton("  ");
		btn7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 4);
			}
		});
		btn7_4.setForeground(Color.BLACK);
		btn7_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_4 = new GridBagConstraints();
		gbc_btn7_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_4.gridx = 6;
		gbc_btn7_4.gridy = 9;
		panel.add(btn7_4, gbc_btn7_4);

		JButton btn7_5 = new JButton("  ");
		btn7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 5);
			}
		});
		btn7_5.setForeground(Color.BLACK);
		btn7_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_5 = new GridBagConstraints();
		gbc_btn7_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_5.gridx = 7;
		gbc_btn7_5.gridy = 9;
		panel.add(btn7_5, gbc_btn7_5);

		JButton btn7_6 = new JButton("  ");
		btn7_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 6);
			}
		});
		btn7_6.setForeground(Color.BLACK);
		btn7_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_6 = new GridBagConstraints();
		gbc_btn7_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_6.gridx = 8;
		gbc_btn7_6.gridy = 9;
		panel.add(btn7_6, gbc_btn7_6);

		JButton btn7_7 = new JButton("  ");
		btn7_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 7);
			}
		});
		btn7_7.setForeground(Color.BLACK);
		btn7_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_7 = new GridBagConstraints();
		gbc_btn7_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_7.gridx = 9;
		gbc_btn7_7.gridy = 9;
		panel.add(btn7_7, gbc_btn7_7);

		JButton btn7_8 = new JButton("  ");
		btn7_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 8);
			}
		});
		btn7_8.setForeground(Color.BLACK);
		btn7_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_8 = new GridBagConstraints();
		gbc_btn7_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_8.gridx = 10;
		gbc_btn7_8.gridy = 9;
		panel.add(btn7_8, gbc_btn7_8);

		JButton btn7_9 = new JButton("  ");
		btn7_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(7, 9);
			}
		});
		btn7_9.setForeground(Color.BLACK);
		btn7_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn7_9 = new GridBagConstraints();
		gbc_btn7_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn7_9.gridx = 11;
		gbc_btn7_9.gridy = 9;
		panel.add(btn7_9, gbc_btn7_9);

		JLabel lblNewLabel_2_1_11 = new JLabel("9");
		lblNewLabel_2_1_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_11 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1_11.gridx = 1;
		gbc_lblNewLabel_2_1_11.gridy = 10;
		panel.add(lblNewLabel_2_1_11, gbc_lblNewLabel_2_1_11);

		JButton btn8_0 = new JButton("  ");
		btn8_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 0);
			}
		});
		btn8_0.setForeground(Color.BLACK);
		btn8_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_0 = new GridBagConstraints();
		gbc_btn8_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_0.gridx = 2;
		gbc_btn8_0.gridy = 10;
		panel.add(btn8_0, gbc_btn8_0);

		JButton btn8_1 = new JButton("  ");
		btn8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 1);
			}
		});
		btn8_1.setForeground(Color.BLACK);
		btn8_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_1 = new GridBagConstraints();
		gbc_btn8_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_1.gridx = 3;
		gbc_btn8_1.gridy = 10;
		panel.add(btn8_1, gbc_btn8_1);

		JButton btn8_2 = new JButton("  ");
		btn8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 2);
			}
		});
		btn8_2.setForeground(Color.BLACK);
		btn8_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_2 = new GridBagConstraints();
		gbc_btn8_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_2.gridx = 4;
		gbc_btn8_2.gridy = 10;
		panel.add(btn8_2, gbc_btn8_2);

		JButton btn8_3 = new JButton("  ");
		btn8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 3);
			}
		});
		btn8_3.setForeground(Color.BLACK);
		btn8_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_3 = new GridBagConstraints();
		gbc_btn8_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_3.gridx = 5;
		gbc_btn8_3.gridy = 10;
		panel.add(btn8_3, gbc_btn8_3);

		JButton btn8_4 = new JButton("  ");
		btn8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 4);
			}
		});
		btn8_4.setForeground(Color.BLACK);
		btn8_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_4 = new GridBagConstraints();
		gbc_btn8_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_4.gridx = 6;
		gbc_btn8_4.gridy = 10;
		panel.add(btn8_4, gbc_btn8_4);

		JButton btn8_5 = new JButton("  ");
		btn8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 5);
			}
		});
		btn8_5.setForeground(Color.BLACK);
		btn8_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_5 = new GridBagConstraints();
		gbc_btn8_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_5.gridx = 7;
		gbc_btn8_5.gridy = 10;
		panel.add(btn8_5, gbc_btn8_5);

		JButton btn8_6 = new JButton("  ");
		btn8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 6);
			}
		});
		btn8_6.setForeground(Color.BLACK);
		btn8_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_6 = new GridBagConstraints();
		gbc_btn8_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_6.gridx = 8;
		gbc_btn8_6.gridy = 10;
		panel.add(btn8_6, gbc_btn8_6);

		JButton btn8_7 = new JButton("  ");
		btn8_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 7);
			}
		});
		btn8_7.setForeground(Color.BLACK);
		btn8_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_7 = new GridBagConstraints();
		gbc_btn8_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_7.gridx = 9;
		gbc_btn8_7.gridy = 10;
		panel.add(btn8_7, gbc_btn8_7);

		JButton btn8_8 = new JButton("  ");
		btn8_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 8);
			}
		});
		btn8_8.setForeground(Color.BLACK);
		btn8_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_8 = new GridBagConstraints();
		gbc_btn8_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_8.gridx = 10;
		gbc_btn8_8.gridy = 10;
		panel.add(btn8_8, gbc_btn8_8);

		JButton btn8_9 = new JButton("  ");
		btn8_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(8, 9);
			}
		});
		btn8_9.setForeground(Color.BLACK);
		btn8_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn8_9 = new GridBagConstraints();
		gbc_btn8_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn8_9.gridx = 11;
		gbc_btn8_9.gridy = 10;
		panel.add(btn8_9, gbc_btn8_9);

		JLabel lblNewLabel_2_1_12 = new JLabel("10");
		lblNewLabel_2_1_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2_1_12 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_12.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2_1_12.gridx = 1;
		gbc_lblNewLabel_2_1_12.gridy = 11;
		panel.add(lblNewLabel_2_1_12, gbc_lblNewLabel_2_1_12);

		JButton btn9_0 = new JButton("  ");
		btn9_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 0);
			}
		});
		btn9_0.setForeground(Color.BLACK);
		btn9_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_0.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_0 = new GridBagConstraints();
		gbc_btn9_0.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_0.gridx = 2;
		gbc_btn9_0.gridy = 11;
		panel.add(btn9_0, gbc_btn9_0);

		JButton btn9_1 = new JButton("  ");
		btn9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 1);
			}
		});
		btn9_1.setForeground(Color.BLACK);
		btn9_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_1 = new GridBagConstraints();
		gbc_btn9_1.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_1.gridx = 3;
		gbc_btn9_1.gridy = 11;
		panel.add(btn9_1, gbc_btn9_1);

		JButton btn9_2 = new JButton("  ");
		btn9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 2);
			}
		});
		btn9_2.setForeground(Color.BLACK);
		btn9_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_2.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_2 = new GridBagConstraints();
		gbc_btn9_2.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_2.gridx = 4;
		gbc_btn9_2.gridy = 11;
		panel.add(btn9_2, gbc_btn9_2);

		JButton btn9_3 = new JButton("  ");
		btn9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 3);
			}
		});
		btn9_3.setForeground(Color.BLACK);
		btn9_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_3.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_3 = new GridBagConstraints();
		gbc_btn9_3.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_3.gridx = 5;
		gbc_btn9_3.gridy = 11;
		panel.add(btn9_3, gbc_btn9_3);

		JButton btn9_4 = new JButton("  ");
		btn9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 4);
			}
		});
		btn9_4.setForeground(Color.BLACK);
		btn9_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_4.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_4 = new GridBagConstraints();
		gbc_btn9_4.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_4.gridx = 6;
		gbc_btn9_4.gridy = 11;
		panel.add(btn9_4, gbc_btn9_4);

		JButton btn9_5 = new JButton("  ");
		btn9_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 5);
			}
		});
		btn9_5.setForeground(Color.BLACK);
		btn9_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_5.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_5 = new GridBagConstraints();
		gbc_btn9_5.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_5.gridx = 7;
		gbc_btn9_5.gridy = 11;
		panel.add(btn9_5, gbc_btn9_5);

		JButton btn9_6 = new JButton("  ");
		btn9_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 6);
			}
		});
		btn9_6.setForeground(Color.BLACK);
		btn9_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_6.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_6 = new GridBagConstraints();
		gbc_btn9_6.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_6.gridx = 8;
		gbc_btn9_6.gridy = 11;
		panel.add(btn9_6, gbc_btn9_6);

		JButton btn9_7 = new JButton("  ");
		btn9_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 7);
			}
		});
		btn9_7.setForeground(Color.BLACK);
		btn9_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_7.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_7 = new GridBagConstraints();
		gbc_btn9_7.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_7.gridx = 9;
		gbc_btn9_7.gridy = 11;
		panel.add(btn9_7, gbc_btn9_7);

		JButton btn9_8 = new JButton("  ");
		btn9_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 8);
			}
		});
		btn9_8.setForeground(Color.BLACK);
		btn9_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_8.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_8 = new GridBagConstraints();
		gbc_btn9_8.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_8.gridx = 10;
		gbc_btn9_8.gridy = 11;
		panel.add(btn9_8, gbc_btn9_8);

		JButton btn9_9 = new JButton("  ");
		btn9_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClick(9, 9);
			}
		});
		btn9_9.setForeground(Color.BLACK);
		btn9_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9_9.setBackground(Color.PINK);
		GridBagConstraints gbc_btn9_9 = new GridBagConstraints();
		gbc_btn9_9.insets = new Insets(0, 0, 0, 5);
		gbc_btn9_9.gridx = 11;
		gbc_btn9_9.gridy = 11;
		panel.add(btn9_9, gbc_btn9_9);

		matrix = new JButton[10][10];
		matrix[0][0] = btn0_0;
		matrix[0][1] = btn0_1;
		matrix[0][2] = btn0_2;
		matrix[0][3] = btn0_3;
		matrix[0][4] = btn0_4;
		matrix[0][5] = btn0_5;
		matrix[0][6] = btn0_6;
		matrix[0][7] = btn0_7;
		matrix[0][8] = btn0_8;
		matrix[0][9] = btn0_9;
		matrix[1][0] = btn1_0;
		matrix[1][1] = btn1_1;
		matrix[1][2] = btn1_2;
		matrix[1][3] = btn1_3;
		matrix[1][4] = btn1_4;
		matrix[1][5] = btn1_5;
		matrix[1][6] = btn1_6;
		matrix[1][7] = btn1_7;
		matrix[1][8] = btn1_8;
		matrix[1][9] = btn1_9;
		matrix[2][0] = btn2_0;
		matrix[2][1] = btn2_1;
		matrix[2][2] = btn2_2;
		matrix[2][3] = btn2_3;
		matrix[2][4] = btn2_4;
		matrix[2][5] = btn2_5;
		matrix[2][6] = btn2_6;
		matrix[2][7] = btn2_7;
		matrix[2][8] = btn2_8;
		matrix[2][9] = btn2_9;
		matrix[3][0] = btn3_0;
		matrix[3][1] = btn3_1;
		matrix[3][2] = btn3_2;
		matrix[3][3] = btn3_3;
		matrix[3][4] = btn3_4;
		matrix[3][5] = btn3_5;
		matrix[3][6] = btn3_6;
		matrix[3][7] = btn3_7;
		matrix[3][8] = btn3_8;
		matrix[3][9] = btn3_9;
		matrix[4][0] = btn4_0;
		matrix[4][1] = btn4_1;
		matrix[4][2] = btn4_2;
		matrix[4][3] = btn4_3;
		matrix[4][4] = btn4_4;
		matrix[4][5] = btn4_5;
		matrix[4][6] = btn4_6;
		matrix[4][7] = btn4_7;
		matrix[4][8] = btn4_8;
		matrix[4][9] = btn4_9;
		matrix[5][0] = btn5_0;
		matrix[5][1] = btn5_1;
		matrix[5][2] = btn5_2;
		matrix[5][3] = btn5_3;
		matrix[5][4] = btn5_4;
		matrix[5][5] = btn5_5;
		matrix[5][6] = btn5_6;
		matrix[5][7] = btn5_7;
		matrix[5][8] = btn5_8;
		matrix[5][9] = btn5_9;
		matrix[6][0] = btn6_0;
		matrix[6][1] = btn6_1;
		matrix[6][2] = btn6_2;
		matrix[6][3] = btn6_3;
		matrix[6][4] = btn6_4;
		matrix[6][5] = btn6_5;
		matrix[6][6] = btn6_6;
		matrix[6][7] = btn6_7;
		matrix[6][8] = btn6_8;
		matrix[6][9] = btn6_9;
		matrix[7][0] = btn7_0;
		matrix[7][1] = btn7_1;
		matrix[7][2] = btn7_2;
		matrix[7][3] = btn7_3;
		matrix[7][4] = btn7_4;
		matrix[7][5] = btn7_5;
		matrix[7][6] = btn7_6;
		matrix[7][7] = btn7_7;
		matrix[7][8] = btn7_8;
		matrix[7][9] = btn7_9;
		matrix[8][0] = btn8_0;
		matrix[8][1] = btn8_1;
		matrix[8][2] = btn8_2;
		matrix[8][3] = btn8_3;
		matrix[8][4] = btn8_4;
		matrix[8][5] = btn8_5;
		matrix[8][6] = btn8_6;
		matrix[8][7] = btn8_7;
		matrix[8][8] = btn8_8;
		matrix[8][9] = btn8_9;
		matrix[9][0] = btn9_0;
		matrix[9][1] = btn9_1;
		matrix[9][2] = btn9_2;
		matrix[9][3] = btn9_3;
		matrix[9][4] = btn9_4;
		matrix[9][5] = btn9_5;
		matrix[9][6] = btn9_6;
		matrix[9][7] = btn9_7;
		matrix[9][8] = btn9_8;
		matrix[9][9] = btn9_9;

	}

	private void onClick(int x, int y) {
		Color shipColor = null;
		int size = 0;
		String direction = "";
		String shipName = "";
		if(comboBox.getItemCount()==0) {
			JOptionPane.showMessageDialog(frame, "All ships are deployed! Please start attacking!");
			
		}
		else {
		if (comboBox.getSelectedItem() == "Aircraft Carrier - 5") {
			size = 5;
			shipColor = Color.green;
			shipName = "Aircraft Carrier - 5";
		} else if (comboBox.getSelectedItem() == "Battleship - 4") {
			size = 4;
			shipColor = Color.blue;
			shipName = "Battleship - 4";
		} else if (comboBox.getSelectedItem() == "Cruiser - 3") {
			size = 3;
			shipColor = Color.YELLOW;
			shipName = "Cruiser - 3";
		} else if (comboBox.getSelectedItem() == "Submarine - 3") {
			size = 3;
			shipColor = Color.cyan;
			shipName = "Submarine - 3";
		} else if (comboBox.getSelectedItem() == "Destroyer - 2") {
			size = 2;
			shipColor = Color.orange;
			shipName = "Destroyer - 2";
		}

		Object[] options = { "Horizontal", "Vertical" };
		int n = JOptionPane.showOptionDialog(frame, "What direction do you want to deploy the ship?", "Direction",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

		if (n == 0) {
			direction = "Horizontal";
		} else if (n == 1) {
			direction = "Vertical";
		}
		deploy(x, y, size, direction, shipColor, shipName);
		}
	}

	private void deploy(int x, int y, int size, String direction, Color shipColor, String shipName) {
		try {
		if (direction.equals("Horizontal")) {
			int temp = 0;
			for (int z = 0; z < size; z++) {
				int yy = y + z;
				if (matrix[x][yy].getBackground() == Color.green || matrix[x][yy].getBackground() == Color.blue
						|| matrix[x][yy].getBackground() == Color.YELLOW || matrix[x][yy].getBackground() == Color.cyan
						|| matrix[x][yy].getBackground() == Color.orange) {
					temp++;
				}
			}
			if (temp == 0) {
				for (int z = 0; z < size; z++) {
					int yy = y + z;
					matrix[x][yy].setBackground(shipColor);
					matrix[x][yy].setEnabled(false);
					comboBox.removeItem(shipName);
				}
			} else if (temp > 0) {
				JOptionPane.showMessageDialog(frame, "ships are overlapping");
			}
		}

		if (direction.equals("Vertical")) {
			int temp = 0;
			for (int z = 0; z < size; z++) {
				int xx = x + z;
				if (matrix[xx][y].getBackground() == Color.green || matrix[xx][y].getBackground() == Color.blue
						|| matrix[xx][y].getBackground() == Color.YELLOW || matrix[xx][y].getBackground() == Color.cyan
						|| matrix[xx][y].getBackground() == Color.orange) {
					temp++;
				}
			}
			if (temp == 0) {
				for (int z = 0; z < size; z++) {
					int xx = x + z;
					matrix[xx][y].setBackground(shipColor);
					matrix[xx][y].setEnabled(false);
					comboBox.removeItem(shipName);
				}
			} else if (temp > 0) 
				JOptionPane.showMessageDialog(frame, "Ships are overlapping");
			}
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			JOptionPane.showMessageDialog(frame, "Ship can not be deployed here!");
		}

	}
	

	
}
