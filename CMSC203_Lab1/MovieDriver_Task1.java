package Lab1;

import java.util.Scanner;

public class MovieDriver_Task1 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //creates a new scanner object to read from keyboard
		
		String title;      //holds title of the movie
		String rating;     //holds rating of the movie
		int soldTickets;   //holds number of tickets sold for the money
		String info;      //used to hold message with all the info about the movie (title, rating, number tickets sold)
		
		
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
		
		System.out.println("Goodbye"); 
		
		keyboard.close();        //closes scanner
		
		
	}
	
}
