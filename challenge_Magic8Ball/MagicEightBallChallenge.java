/**
 * 
 */
package challenge_Magic8Ball;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class MagicEightBallChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare and Initiate Variables

		int randNumber;
		String randAnswer = null, question;

		// Instantiate Scanner + Random

		Scanner myScan = new Scanner(System.in);
		Random myRand = new Random();

		// Prompt User

		System.out.println("What is your question?");

		question = myScan.nextLine();

		System.out.println("You want to know ... \n" + question);

		// Generate Random Number

		randNumber = myRand.nextInt(1, 9);

		// Switch statement

		switch (randNumber) {

		case 1:
			randAnswer = "I see it, yes.";
			break;
		case 2:
			randAnswer = "Ask again later.";
			break;
		case 3:
			randAnswer = "Better not tell you now.";
			break;
		case 4:
			randAnswer = "Cannot predict now.";
			break;
		case 5:
			randAnswer = "Concentrate and ask again.";
			break;
		case 6:
			randAnswer = "Don't count on it.";
			break;
		case 7:
			randAnswer = "It is certain.";
			break;
		case 8:
			randAnswer = "It is decidedly so.";
			break;
		}

		System.out.println(randAnswer);
		
		myScan.close();
	
	}

}
