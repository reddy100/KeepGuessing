import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber, guess = 0;//guess is initialized to 0
		Random rand = new Random();
		secretNumber = 1 + rand.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.print("Enter the number:");
		guess = keyboard.nextInt();
		
		while ( guess != secretNumber && guess != 5)
		{
			System.out.println("\nYou are wrong. Try again.");
			if(guess < secretNumber)
			{
				System.out.println("Guess Higher");
			}
			else
			{
				System.out.println("Guess Lower");
			}
			System.out.println("Enter the number: ");
			guess = keyboard.nextInt();
		}
		
		System.out.println("You are correct. You win a prize!");
		keyboard.close();
	}
}