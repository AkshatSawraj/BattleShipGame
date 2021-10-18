package gameEngine;

import java.awt.Color;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class gameEngine {

	/*
	 * Pre-game activities - Read the Player Matrix & Opponent Matrix
	 * 
	 */

	// Import Player Matrix & Opponent Matrix
	
	JButton[][] playerMatrix;
	JButton[][] opponentMatrix;
	JFrame frame;
	int i ;
	int j;
	static int score;
	boolean playing=true;
// implement away for both clients to share variable "playing" 
	
	
		public gameEngine(JButton[][] playerMatrix2,JButton[][] opponentMatrix) {
			this.playerMatrix = playerMatrix2;
			this.opponentMatrix = opponentMatrix;
			
			
			if(playing) {
				hit(i,j);
			}
			else {
				JOptionPane.showOptionDialog(null, "Please wait! It's not your turn 😊","Please Wait", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
				
			}
		}

		public String hit(int i, int j) {
			
			this.i=i ;
			this.j=j ;
			
			
			//Actual hit
			
			if(playerMatrix[i][j].getBackground() !=(Color.PINK)) {
				
				
//  Return: setArt (*********SET ICON**********)
//			ImageIcon icon = new ImageIcon("C:\\Users\\835489\\OneDrive - Southern Alberta Institute of Technology\\GitHub 311\\Game Folder\\game\\images\\2064381_1.jpg");
				playerMatrix[i][j].setBackground(Color.RED);
//			playerMatrix[i][j].setIcon(icon);
				
				
				// Record Score (# of ships sunken) 
				score += 1;		
				System.out.println("Scored");
				System.out.println(score);
				
				// Check to see if it is the last ship
				if(score == 17) {
					// Print Message indicating game over 
					JOptionPane.showMessageDialog(frame, "Game Over");
					
					//End of game logic here.
				}
				else {
					// Next Player turn *********
					
				}
				//  Return: send a message to other client
				return "hit";
				
			}
			//Miss 
			else {
				
				//SetArt
				playerMatrix[i][j].setBackground(Color.WHITE);
				return "miss";
				
//********SET ICON*******
				
			}
			
			
			
		}

			public void hitMiss(int i , int j, String hM) 
			{
				
				this.i=i ;
				this.j=j ;
				
				if(hM.equals("hit")) {
					
					//opponent grid changes in this method when hit
					
					opponentMatrix[i][j].setBackground(Color.RED);
					opponentMatrix[i][j].setEnabled(false);
				}
				else if (hM.equals("miss"))
				{

					//opponent grid changes in this method when miss
					
					opponentMatrix[i][j].setBackground(Color.white); }
					opponentMatrix[i][j].setEnabled(false);
			}
		
	/*
	 * During-game activities Hit(i,j) 
	 * 
	 * 		- Actually hit 
	 * 			- Return: setArt, disable * spot, send a message to other client
	 * 
	 * 			- Record Score (# of ships sunken) 
	 * 			- Check to see if it is the last ship
	 * 				-Print Message indicating game over || Next Player turn
	 * 
	 * 		- Miss 
	 * 			- Return: setArt, disable spot, send a message to other client
	 * 		    - Next Player turn
	 * 
	 */
	



	public JButton[][] getPlayerMatrix() {
		return playerMatrix;
	}



	public void setPlayerMatrix(JButton[][] playerMatrix) {
		this.playerMatrix = playerMatrix;
	}



	public JButton[][] getOpponentMatrix() {
		return opponentMatrix;
	}



	public void setOpponentMatrix(JButton[][] opponentMatrix) {
		this.opponentMatrix = opponentMatrix;
	}



	public JFrame getFrame() {
		return frame;
	}



	public void setFrame(JFrame frame) {
		this.frame = frame;
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	public int getJ() {
		return j;
	}



	public void setJ(int j) {
		this.j = j;
	}



	public static int getScore() {
		return score;
	}



	public static void setScore(int score) {
		gameEngine.score = score;
	}



	public boolean isPlaying() {
		return playing;
	}



	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	

	
	
	
	public void quit() {
		
		
		boolean b1 = true;
		boolean b2 = true;
		
		if(b1 && b2) {
			//quit
		}
		else if(b1 && !b2) {
			//Please press connect
		}
		else if(!b1 && b2) {
			//
		}
		else{
			//
		}
	
	/*
	 * Post-game activities
	 *
	 * - Surrender Logic
	 * 
		 * At the end of each game, the players should be given a choice if they wish to
		 * continue playing. 
		 * a) 
			 * If they both choose yes to quitting, they log off
			 * the system and their sockets are dropped.
			 * 
		 * b) 
		   * If one responds yes and the
			 * other no, then the player responding yes should be paired up with the next
			 * available player on the server. The chat history should remain on-screen. 
		 * c)
			 * If both players wish to keep playing, then the gameboard will reset and the
			 * player who won the last game will go first in the next game. The chat history
			 * should remain on-screen.
	 * 
	 */
		
		
		
	}
}
