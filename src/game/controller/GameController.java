package game.controller;

import javax.swing.JOptionPane;

import game.view.GameFrame;

public class GameController
{
	private GameFrame appFrame;

	public void start()
	{
		instructions();
	}

	private void instructions()
	{
		String answer;
		answer = JOptionPane.showInputDialog(appFrame,"Would you like to go over the tutorial?" + "\n" + "                Type yes or no :D");
		if(answer.equals("yes"))
		{
			JOptionPane.showMessageDialog(appFrame,"When you start the game you will start off with $1000" + "\n" + "When you start it you will be asked how much you will want to bet. "
					+ "\n" + "Now this is the key part of the game. This is where you either win or lose money." + "\n" + "After that you will be dealt your hand which is two cards."
					+ "\n" + "Each hand will result in one of the following events for the player:" + "\n" + "Lose - the player's bet is taken by the dealer." + "\n"
+ "Win - the player wins as much as he bet. If you bet $10, you win $10 from the dealer" + "\n" + "plus you keep your original bet, of course." + "\n" +
"Blackjack (natural) - the player wins twice what they bet." + "\n" + "With a bet of $10, you keep your $10 and win a further $10 from the dealer." + "\n" +
 "Push - the hand is a draw. The player keeps his bet, neither winning nor losing money." + "\n" + "Press enter to continue! :D ");
			JOptionPane.showMessageDialog(appFrame,"Start:" + "\n" +"Aces cards are worth 1 or 11." + "\n" +
"Dealer will come to you in the order he passed out the cards." + "\n" +
"If you want another card you will click Hit." + "\n" +
"If you do not want to take another card you will click hold." + "\n" +
"The object of the game is to get as close to 21 without going over." + "\n" +
"The rule is if the dealer has a hand 16 or less they have to take another hand."+ "\n" +
"If they have 17 or better they have to stand."+ "\n" + "Press enter to continue! :D ");
			JOptionPane.showMessageDialog(appFrame, "Surrender:" + "\n" + "If you have a bad hand compared to the dealer's hand, judging from what you can see of it."
+"\n" + "You can give up the hand and reclaim half your bet." + "\n" + "The casino, in this case this game, keeps the other half uncontested."
+ "\n" + "You need a really bad hand match-up for a surrender to be profitable," + "\n" + "Such as 16 vs the dealer showing a 10." + "\n" +
"At some casinos, surrenders will not be allowed if the dealer has a blackjack." + "\n" + "Which he then checks for immediately after the deal."
+ "\n" + "If the dealer has a blackjack, no surrenders will be granted and you'll lose the entire bet"
+ "\n" + "- unless you also have a blackjack, in which case it's a push." + "\n" + "This side rule variation is called late surrender."+ "\n" + "Press enter to continue! :D ");
			JOptionPane.showMessageDialog(appFrame," Splitting: " + "\n" + "When you get two starting cards of the same face value, you have the option to split the hand in two."
 + "\n" + "You place another bet of the same size as the original bet and play on with two hands."
 + "\n" + "Note that it is legal to split 10-point cards even if they do not form a pair - for example you could split a jack and a king." + "\n" +
"When you've decided to split a hand, the dealer immediately deals a second card to each hand." + "\n" + "Now, if you're dealt yet another pair, some casinos allow you to split the hand again, while others don't."+ "\n" +
"When you're done splitting, each of your hands will be treated separately." + "\n" + "Meaning that you will take cards to your first hand until you stand or bust, and then carry on with the next hand." + "\n" +
"If you split aces, you are dealt a second card to each hand as usual, but you are not allowed to take any further cards." + "\n" + "Unless you are dealt another ace and split again." 
+ "\n" + "All hands resulting from splitting aces remain as two-card hands." + "\n" +
"If the second card dealt to a split ace is a 10-point card you do not receive the blackjack bonus for this hand." 
+ "\n" + "It does however win against an ordinary 21 made of more than two cards." + "\n" + "If the dealer also has a blackjack the result for this hand is a push as usual."
+ "\n" + "In many places the same rule, no blackjack bonus, is played if an ace is dealt as the second card to a 10-point card after splitting."+ "\n" + "Press enter to continue! :D ");
			JOptionPane.showMessageDialog(appFrame, "Insurance:" + "\n" + "When the dealer's face-up card is an ace, each player gets the chance to bet on whether the dealer has a blackjack or not." + "\n" + "This is done before any other player actions."+ "\n" +
					"The insurance wager equals your original bet and is used to cancel out the likely loss of this bet." + "\n" + "A winning insurance bet will be paid at odds of 2:1, and since you lose your original bet, you'll break even on the hand."+ "\n" + "Strategy guides tend to advice against taking insurance.");			
			answer = JOptionPane.showInputDialog(appFrame, "Would you like to go over it again?"+ "\n" + "                Type yes or no :D");
			if(answer.equals("yes"))
			{
				instructionsTwo();
			}
			else
			{
				JOptionPane.showMessageDialog(appFrame, "     Good luck and have fun!!" + "\n" + "Press enter to enter the game.");
				//rungame
			}
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "     Good luck and have fun!!" + "\n" + "Press enter to enter the game.");
			//rungame
		}
		
	}

	private void instructionsTwo()
	{
		String answer;
		JOptionPane.showMessageDialog(appFrame,"When you start the game you will start off with $1000" + "\n" + "When you start it you will be asked how much you will want to bet. "
				+ "\n" + "Now this is the key part of the game. This is where you either win or lose money." + "\n" + "After that you will be dealt your hand which is two cards."
				+ "\n" + "Each hand will result in one of the following events for the player:" + "\n" + "Lose - the player's bet is taken by the dealer." + "\n"
+ "Win - the player wins as much as he bet. If you bet $10, you win $10 from the dealer" + "\n" + "plus you keep your original bet, of course." + "\n" +
"Blackjack (natural) - the player wins twice what they bet." + "\n" + "With a bet of $10, you keep your $10 and win a further $10 from the dealer." + "\n" +
"Push - the hand is a draw. The player keeps his bet, neither winning nor losing money." + "\n" + "Press enter to continue! :D ");
		JOptionPane.showMessageDialog(appFrame,"Start:" + "\n" +"Aces cards are worth 1 or 11." + "\n" +
"Dealer will come to you in the order he passed out the cards." + "\n" +
"If you want another card you will click Hit." + "\n" +
"If you do not want to take another card you will click hold." + "\n" +
"The object of the game is to get as close to 21 without going over." + "\n" +
"The rule is if the dealer has a hand 16 or less they have to take another hand."+ "\n" +
"If they have 17 or better they have to stand."+ "\n" + "Press enter to continue! :D ");
		JOptionPane.showMessageDialog(appFrame, "Surrender:" + "\n" + "If you have a bad hand compared to the dealer's hand, judging from what you can see of it."
+"\n" + "You can give up the hand and reclaim half your bet." + "\n" + "The casino, in this case this game, keeps the other half uncontested."
+ "\n" + "You need a really bad hand match-up for a surrender to be profitable," + "\n" + "Such as 16 vs the dealer showing a 10." + "\n" +
"At some casinos, surrenders will not be allowed if the dealer has a blackjack." + "\n" + "Which he then checks for immediately after the deal."
+ "\n" + "If the dealer has a blackjack, no surrenders will be granted and you'll lose the entire bet"
+ "\n" + "- unless you also have a blackjack, in which case it's a push." + "\n" + "This side rule variation is called late surrender."+ "\n" + "Press enter to continue! :D ");
		JOptionPane.showMessageDialog(appFrame," Splitting: " + "\n" + "When you get two starting cards of the same face value, you have the option to split the hand in two."
+ "\n" + "You place another bet of the same size as the original bet and play on with two hands."
+ "\n" + "Note that it is legal to split 10-point cards even if they do not form a pair - for example you could split a jack and a king." + "\n" +
"When you've decided to split a hand, the dealer immediately deals a second card to each hand." + "\n" + "Now, if you're dealt yet another pair, some casinos allow you to split the hand again, while others don't."+ "\n" +
"When you're done splitting, each of your hands will be treated separately." + "\n" + "Meaning that you will take cards to your first hand until you stand or bust, and then carry on with the next hand." + "\n" +
"If you split aces, you are dealt a second card to each hand as usual, but you are not allowed to take any further cards." + "\n" + "Unless you are dealt another ace and split again." 
+ "\n" + "All hands resulting from splitting aces remain as two-card hands." + "\n" +
"If the second card dealt to a split ace is a 10-point card you do not receive the blackjack bonus for this hand." 
+ "\n" + "It does however win against an ordinary 21 made of more than two cards." + "\n" + "If the dealer also has a blackjack the result for this hand is a push as usual."
+ "\n" + "In many places the same rule, no blackjack bonus, is played if an ace is dealt as the second card to a 10-point card after splitting."+ "\n" + "Press enter to continue! :D ");
		JOptionPane.showMessageDialog(appFrame, "Insurance:" + "\n" + "When the dealer's face-up card is an ace, each player gets the chance to bet on whether the dealer has a blackjack or not." + "\n" + "This is done before any other player actions."+ "\n" +
				"The insurance wager equals your original bet and is used to cancel out the likely loss of this bet." + "\n" + "A winning insurance bet will be paid at odds of 2:1, and since you lose your original bet, you'll break even on the hand."+ "\n" + "Strategy guides tend to advice against taking insurance.");
		answer = JOptionPane.showInputDialog(appFrame, "Would you like to go over it again?"+ "\n" + "                Type yes or no :D");
		if(answer.equals("yes"))
		{
			instructionsTwo();
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "     Good luck and have fun!!" + "\n" + "Press enter to enter the game.");
			//rungame
		}
	}
}

