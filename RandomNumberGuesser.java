
/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: This assignment allows uer to enter a guess for the random number
 * Due: 2/23/22
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Kelly Nguyen__________
*/

package Assignment2; //DELETE LATER!!!

import java.util.Scanner;

public class RandomNumberGuesser 
{
	public static void main(String[] args) 
	{
		System.out.println("This application generates a random interger between 1 and 100 "
				+ "and asks the user to guess repeatedly until they guess correctly.");

	
		Scanner input = new Scanner(System.in);     //creates a new Scanner for input
		int randomNum = RNG.rand(); // This is the random number between 1 and 100

		int guess = 0; // This stores the number the user guesses. It is initialized to 0.

		int highestGuess = 100; //This is the highest number the user can guess. It is assigned to 100.
		int lowestGuess = 0; // This is the lowest guess the user can enter

		final int MAX_COUNT = RNG.getMaxGuessCount(); //This is the max number of times the user can guess. It is 7.

		String answer;     //This is the variable that stores the users answer.

		//Prompts user to enter their first guess and stores it in guess. Then count is incremented.
		System.out.println("Enter your first guess: ");
		guess = input.nextInt();
		RNG.incrementCount();

		do 
		{
			//while the count is less than the max count and the users guess is not equal to the random number
			while ((RNG.getCount()) <= MAX_COUNT && (guess!= randomNum)) 
			{
				if (RNG.inputValidation(guess, lowestGuess, highestGuess))  //if the input is within the correct range. 
				{
					if (guess < randomNum)      //if the guess is less than the random number print the number is too low and set lowestGuess to guess
					{
						System.out.println("Your guess is too low");    
							lowestGuess = guess;
					}
			
					if (guess > randomNum) //if the guess is more than the random number print the number is too high and set highestGuess to guess
					{
						System.out.println("Your guess is too high");
							highestGuess = guess;
					}
		
					System.out.println("Number of guesses is: " + RNG.getCount()); //display the number of guesses.

					//prompts the user to enter the next guess between the range of the lowest guess and highest guess
					//then stores that value in guess and increments the count
					System.out.println("Enter your next guess between " + lowestGuess + " and " + highestGuess);
					guess = input.nextInt();
					RNG.incrementCount();

				}//end of if statement
					
				else //if the guess is not within the range then display the message that the guess needs to be within the correct range and prompt for input
				{
					guess = input.nextInt();
				}

			} //end while loop
							
			
			//if the count is more than or equal to the max guess count (which is 7) 
			if (RNG.getCount() >= RNG.getMaxGuessCount()) 
			{
				System.out.println("You have exceeded the maximum number of guesses,7. Try again.");
			}

			if (guess == randomNum) {
				System.out.println("Congratulations, you guessed correctly");
			}

			System.out.println("Try again? (yes or no) ");
			answer = input.nextLine();

			
			input.close();

		} while (answer.equals("yes"));

		if (answer.equals("yes")) 
		{
			RNG.resetCount();
		}
		
		
	}
}
