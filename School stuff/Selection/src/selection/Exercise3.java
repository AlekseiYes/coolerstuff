package selection;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int randomNumber;
		Scanner input = new Scanner(System.in);
		int badAttempts = 0;
		
		do {
			randomNumber = random.nextInt(100)+1;
			if(randomNumber == 69)
			{
				System.out.println((randomNumber) + " Nice!");
				badAttempts++;
			}
			else { 
				System.out.println((randomNumber) + " Unlucky");
				badAttempts++;
			}
			System.out.println("You tried this already " + badAttempts + " times!");
			System.out.println("Do you want to continue?");
			
		} while(input.next().equals("y"));
		System.out.println("Too bad!");
	}

}
