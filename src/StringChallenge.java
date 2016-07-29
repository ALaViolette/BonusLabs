import java.util.Scanner;
public class StringChallenge {
	public static void main(String[] args) {
Scanner scan1 = new Scanner(System.in);
		
		String choice = "yes";
		
		while(choice.equalsIgnoreCase("yes"))
		{
		
			System.out.println("Enter a word to see if it is a palindrome");
			String orginal = scan1.nextLine();
			String reverse ="";
		
			for (int i = orginal.length() - 1; i >= 0; i--) {
				reverse = reverse + orginal.charAt(i);

			}
			if (orginal.equalsIgnoreCase(reverse)) {
				System.out.println("Your word is a palindrome");
			} else {
				System.out.println("This is not a palindrome");
			}
			
			
			System.out.println("Continue?");
			choice = scan1.nextLine();
		}
		scan1.close();
	}

}

