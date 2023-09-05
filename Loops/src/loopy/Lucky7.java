package loopy;

import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner play = new Scanner(System.in);
		Scanner money = new Scanner(System.in);
		
		int num1, num2, num3;
		int cash;
		int tries = 0;
		;
		
		System.out.println("Would you like to try your luck today? (y/n)");
		
		if(play.next().equals("y")) 
		{
		System.out.println("Then let us begin!");
		}
		else {System.out.println("Fuck you, you don't get to choose!");}
		System.out.println("");
		System.out.println("INSERT MONEY HERE");
		cash = money.nextInt();
		
		do {
		cash--;
		num1 = random.nextInt(10);
		num2 = random.nextInt(10);
		num3 = random.nextInt(10);
		
		System.out.println("");
		System.out.println("   " + (num1) + " " + (num2) + " " + (num3));
		System.out.println("");
		
		if(num1 == 7 || num2 == 7 || num3 == 7) {
		System.out.println("You won!");
		if (num1 == num2 && num1 ==num3) {
		cash += 10;
		System.out.println("You won 10€!");}
		else if(num1 == num2 || num1 == num3 || num2 == num3) {
		cash += 5;
		System.out.println("You won 5€!");}
		else {cash += 3;
		System.out.println("You won 3€!");}
		}
		
		else System.out.println("You lost!");
		System.out.println("");
		System.out.println("Current balance: " + (cash) + "€");
		if(cash == 0) {
			System.out.println("You broke lmao");
			break;}
		System.out.println("Would you like to try again?");
		tries++;
		System.out.println("Tries: "+ (tries));
		} 
		//while (play.next().equals("y"));
		while (cash != 0);		
		System.out.println("Have a nice day!");

	}

}
