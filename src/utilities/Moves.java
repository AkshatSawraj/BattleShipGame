package utilities;

import java.io.Serializable;

import javax.swing.JButton;

public class Moves implements Serializable {
	// Constants
	private static final long serialVersionUID = -7635341076366698125L;

	// Attributes
	private boolean playing;
	private int i;
	private int j;
	private String playResult;
	private JButton[][] playerMatrix;

	public Moves(String playResult) {
		this.setPlayResult(playResult);
	}
	
	// Constructors
	/**
	 * User defined constructor
	 * 
	 * @param playing turn
	 * @param i coordinate being transported
	 * @param j coordinate being transported
	 * @param playerMatrix being transported
	 */
	public Moves(Boolean playing, Integer i, Integer j, JButton[][] playerMatrix) {
		this.playing = playing;
		this.i = i;
		this.j = j;
	}
	public Moves(Boolean playing, Integer i, Integer j) {
		this.playing = playing;
		this.i = i;
		this.j = j;
	}

	public Moves(Boolean playing) {
		this.playing = playing;
	}

	public Moves(Integer i, Integer j) {
		this.i = i;
		this.j = j;
	}
	
	public Moves(JButton[][] playerMatrix) {
		this.playerMatrix = playerMatrix;
	}

	// Getter and Setter Methods
	/**
	 * @return the playing
	 */
	public boolean getplaying() {
		return playing;
	}

	/**
	 * @param playing the playing to set
	 */
	public void setPlaying(Boolean playing) {
		this.playing = playing;
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(Integer i) {
		this.i = i;
	}

	/**
	 * @return the j
	 */
	public int getJ() {
		return j;
	}

	/**
	 * @param j the j to set
	 */
	public void setJ(Integer j) {
		this.j = j;
	}
	
	/**
	 * @return the playerMatrix
	 */
	public JButton[][] getPlayerMatrix() {
		return playerMatrix;
	}

	/**
	 * @param playerMatrix the playerMatrix to set
	 */
	public void setPlayerMatrix(JButton[][] playerMatrix) {
		this.playerMatrix = playerMatrix;
	}

	public String getPlayResult() {
		return playResult;
	}

	public void setPlayResult(String playResult) {
		this.playResult = playResult;
	}
}