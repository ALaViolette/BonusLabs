import java.util.Scanner;

import java.util.Random;

public class GuessNumberGame {

	public static void main(String[] args) {

		Scanner AV = new Scanner(System.in);
		int Guess;
		Random randomGenerator = new Random();
		String choice = "yes";
		int counter = 1;
		String play = "";

		System.out.println("Welcome to the Guessing game, try to guess the number we are thinking of");

		System.out.println("Would you like to play? y/n");
		play = AV.nextLine();


			while (play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes")) {
				// setting the random guess the user will input
				int Answer = randomGenerator.nextInt(100);
				System.out.println(Answer);

				System.out.println("Guess a number between 1 and 100:");

				while (choice.equalsIgnoreCase("yes")) {

					Guess = AV.nextInt();
					AV.nextLine();
					if (Guess < 1 || Guess > 100) {
						System.out.println("Invalid number! Please enter a number between 1 and 100");

					} else if (Answer == Guess) {
						System.out.println("You guessed correctly the answer is " + Answer);
						System.out.println("The number of times you guessed was: " + counter);
						choice = "no";

					} else if (Math.abs(Answer - Guess) > 10) {
						System.out.print("You're too far off");
						if (Answer > Guess)
							System.out.println(", aim higher");
						else
							System.out.println(", aim lower");
						System.out.println("Guess again");
						counter++;

					} else if (Math.abs(Answer - Guess) < 10) {
						System.out.print("You're getting close you're within 10 numbers of what we are thinking");
						if (Answer > Guess)
							System.out.println(", aim higher");
						else
							System.out.println(", aim lower");
						System.out.println("Guess again");
						counter++;
					}

				}
			
			System.out.println("Do you want to play again?");
			play = AV.nextLine();
		}
		System.out.println("Goodbye");
		AV.close();
	}

}
