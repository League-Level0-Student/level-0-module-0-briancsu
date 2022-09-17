package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
		
		int score = 0;
		
		String One = JOptionPane.showInputDialog(null,"Are you cool? ");
		String Two = JOptionPane.showInputDialog(null," ");
		String Three = JOptionPane.showInputDialog(null,"Is the league cool? ");
		String Four = JOptionPane.showInputDialog(null,"Are you asian? ");
		
		if (One.equals("yes")){
			score += 1;
			}
		else {
			score -= 1;
		}
		
		
		
		if (Two.equals("no")){
			score += 1;
		}
		else {
			score -= 1;
			}
		
		
		
		if (Three.equals("yes")){
			score += 1;
		}
		else {
			score -= 1;
		}
		
		
		
		if (Four.equals("yes")){
			score += 1;
		}
		else {
			score -= 1;
			
			
		}
		
		
		
		JOptionPane.showMessageDialog(null, "Your score is " +score+".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


