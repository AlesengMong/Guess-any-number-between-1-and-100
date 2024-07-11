/**
 * 
 */
package codeS;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class TASK1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Guessing game");
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		
		while(true) {
			int numberToGuess = random.nextInt(100) + 1;
			int urattempts = 0;
			final int maximumAttempts = 10;
			
			
			System.out.println("Guess any number between 1 and 100");
			
			while(urattempts < maximumAttempts) {
				System.out.println("Continue to guess (or press 'Q' to quit): ");
				String input = in.nextLine();
				
				if(input.equalsIgnoreCase("Q")) {
					System.out.println("You have quited the game");
					return;
				}
				
				int guess;
				try {
					guess = Integer.parseInt(input);
				}catch(NumberFormatException e) {
					System.out.println("Please enter the valid the number");
					continue;
				}
				urattempts++;
				
				if(guess < numberToGuess) {
					System.out.println("The number you guessed is below the guessable numbers !! Please try again.");
				}else if(guess > numberToGuess) {
					System.out.println("The number you guessed id above the guessable numbers !! Please try again.");
				}else {
					System.out.println("Wow!! You guessed the number(" + numberToGuess + ") in " + urattempts + "attempts");
					break;
				}
			}
			if(urattempts >= maximumAttempts) {
				System.out.println("Ouch Sorry , You have used all your attempts. The number was " + numberToGuess + ".");
			}
			
			System.out.println("Would you like to play again? (YES/NO): ");
			String Retry = in.nextLine();
			if(!Retry.equalsIgnoreCase("YES")) {
				System.out.println("Thanks for playing!!");
				break;
			}
		}
		in.close();

	}


}
