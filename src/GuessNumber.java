import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Random rn = new Random();
        int answer = rn.nextInt(100) + 1;
        boolean keepGuessing = true;
        //System.out.println(answer);
        String choice = "";
        int counter = 0;
        
        counter++;
        
        System.out.println("Welcome to the Guess a Number Game!");
        System.out.println("-----------------------------------\n");

        while (keepGuessing) {

            System.out.println("Guess a number between 1 and 100.");
            Scanner scan1 = new Scanner(System.in);
            int guess = scan1.nextInt();
            scan1.nextLine();

            if (answer == guess) {
                System.out.println("YAY! You got it.");
                keepGuessing = false;
                
                if (counter >1) {
                System.out.println("It took you " + counter + " tries.");
                }
                else {
                    System.out.println("It only took you " + counter + " try, you genius!");
                }

            }

            else if (guess > answer) {
                System.out.println("Your guess is too high.  ");
                counter++;
            }

            else {
                System.out.println("Your guess is too low.");
                counter++;
                
            }


            }

        }

    }
