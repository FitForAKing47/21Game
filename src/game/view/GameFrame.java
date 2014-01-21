package game.view;

import game.controller.GameController;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{


	private GameController baseController;
	/**
	 * The referenced controller object.
	 */
	private GamePanel basePanel;
	/**
	 * The application main panel for GUI.
	 * @param baseController
	 */
	
	public GameFrame(GameController baseController)
	{
		/**
		 * Creates a LoopFrame object with a linked LoopController for the MVC paradigm.
		 * @param baseController The referring controller.
		 */
		this.baseController = baseController;
		basePanel = new GamePanel(baseController);
		
		setupFrame();
	}
	/**
	 * Method to set up the frame.
	 */
	private void setupFrame()
	{
		/**
		 * Sets the content, size and visibility of the frame.
		 */
		this.setContentPane(basePanel);
		this.setSize(450,450);
		this.setVisible(true);
	}
}
