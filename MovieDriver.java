/*
 * Class: CMSC203 CRN 30378
 Program: Lab 1
 Instructor: Professor Monshi
 Summary of Description: User is prompted to enter movie titles, ratings, and numbers of tickets sold and then the information is displayed.
 Due Date: 2/14/23
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source. 
 Kelly Nguyen
 */



package Lab1;
import java.util.Scanner;

public class MovieDriver
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //creates a new scanner object to read from keyboard
		
		String title;      //holds title of the movie
		String rating;     //holds rating of the movie
		int soldTickets;   //holds number of tickets sold for the money
		char answer;       //hold y or n
		String input;      //to hold input for when the user is asked to enter an answer
		String info;      //used to hold message with all the info about the movie (title, rating, number tickets sold)
		
		do {
		Movie m = new Movie();      //creates a new movie object called m
		
		System.out.println("Enter the name of the movie"); //prompts user to enter the name of the movie
		title = keyboard.nextLine();                       //then reads what the user enters and stores in title variable. 
		m.setTitle(title);                                 //Then sets the title to title, which is what the user entered
		
		System.out.println("Enter the rating of the movie"); //prompts user to enter the rating of the movie
		rating = keyboard.nextLine();                        //reads what the user enters and stores in rating variable
		m.setRating(rating);                                 //sets the rating of the movie to rating which is what the user entered
		
		System.out.println("Enter the number of tickets sold for this movie"); //prompts user to enter the number of tickets sold
		soldTickets = keyboard.nextInt();                                      //reads what user enters and stores in soldTickets variable
		keyboard.nextLine();                                                   //consuming enter key
		m.setSoldTickets(soldTickets);                                         //sets the number of sold tickets to soldTickets 
		
		info = m.toString();           //assigns info using m's toString method
		System.out.println(info);       //displays info
		
		System.out.println("Do you want to enter another? (y or n)");  //prompts user if they want to enter another movie
		input = keyboard.nextLine();    //reads a line
		answer = input.charAt(0);      //Answer is assigned to the first character of the input string. 
		
		}while(answer == 'y');    //while the user enters y then the loop with iterate again
		
		System.out.println("Goodbye"); 
		
		keyboard.close();        //closes scanner
		
		
	}
}
