package game.view;

import java.awt.Color;

import game.controller.GameController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel
{
		private GameController baseController;
		private SpringLayout baseLayout;
		private JTextArea loopTextArea;
		private JButton submitButton;
		private JScrollPane textPane;

		/**
		 * Creates a LoopPanel object linked via the controller for MVC paradigm.
		 * @param baseController The linked controller object.
		 */
		public GamePanel(GameController baseController)
		{
			this.baseController = baseController;
			
			baseLayout = new SpringLayout();
			submitButton = new JButton("Click here");
			submitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			textPane = new JScrollPane();
			
			setupPanel();
			setupLayout();
		}
		
		private void setupPanel()
		{
			/**
			 * Adds all components to the panel, sets color and component settings.
			 */
			this.setLayout(baseLayout);
			this.setBackground(new Color(120, 50, 220));
			this.add(submitButton);
			this.add(textPane);
			loopTextArea = new JTextArea(10,20);
			
		}
		
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, loopTextArea, 37, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, loopTextArea, -162, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 6, SpringLayout.SOUTH, loopTextArea);
			baseLayout.putConstraint(SpringLayout.EAST, submitButton, -10, SpringLayout.EAST, loopTextArea);
			baseLayout.putConstraint(SpringLayout.WEST, loopTextArea, 144, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, loopTextArea, -185, SpringLayout.EAST, this);
			add(loopTextArea);
			
			loopTextArea.setWrapStyleWord(true);
			loopTextArea.setLineWrap(true);
			loopTextArea.setEditable(false);
		}

}
