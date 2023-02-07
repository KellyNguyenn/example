ja/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: This assignment helps the user with wifi diagnosis. depending on what the user enters,
 * a message will be displayed. 
 * Due: 2/6/23
 * Platform/compiler:Eclipse, Windows PC
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Kelly Nguyen_________
*/

package Assignments;
import java.util.Scanner;
public class KNAssignment1 
{

	public static void main(String[] args) 
	{
		String answer;
		Scanner input = new Scanner (System.in);
		final String NO = "no";
		final String YES = "yes";
		final String decisionQuestion = "Did that fix the problem (Yes or No)?";
		
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("Reboot the computer and try to connect");
		System.out.println(decisionQuestion);
		answer = input.nextLine();
		
		if(answer.equalsIgnoreCase(NO))
		{
			System.out.println("Reboot the router and try to connect");
			System.out.println(decisionQuestion);
			answer = input.nextLine();
			
			if(answer.equalsIgnoreCase(NO))
			{
				System.out.println("Make sure the cables connecting the router are " 
						+ "firmly plugged in and power is getting to the router");
				
				System.out.println(decisionQuestion);
				answer = input.nextLine();
				
				if(answer.equalsIgnoreCase(NO))
				{
					System.out.println("Move the computer closer to the router and try to connect");
					System.out.println(decisionQuestion);
					answer = input.nextLine();
					
					if(answer.equalsIgnoreCase(NO))
					{
						System.out.println("Contact your ISP");
					}
					
					else if (answer.equalsIgnoreCase(YES))
					{
						System.out.println("Done");
					}
					
					else
					{
						System.out.println("Invalid answer; try again");
					}
					
				}
				
				
				else if (answer.equalsIgnoreCase(YES))
				{
					System.out.println("Done");
					
				}
				
				else
				{
					System.out.println("Invalid answer; try again");
				}
			}
			
			else if (answer.equalsIgnoreCase(YES))
			{
				System.out.println("Done");
			}
			
			else
			{
				System.out.println("Invalid answer; try again");
			}	
		}
		
		else if (answer.equalsIgnoreCase(YES))
		{
			System.out.println("Done");
		}
		
		else
		{
			System.out.println("Invalid answer; try again");
		}
		
		
		System.out.println("Programmer: Kelly Nguyen");
		input.close();
	}
	
}
