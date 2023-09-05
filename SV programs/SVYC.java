package bigballs;
import java.util.Scanner;
import java.lang.Math;
public class SVYC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		int choice;
		String crop = "b";
		int season;
		double profit = 0;
		double amount = 1;
		double number = 1;
		double mult = 1;
		double repeat = 1;
		double sum;
		double price = 1;
		double sumprice;
		String yes;
		
		System.out.println("Select your crop season.");
		System.out.println("1. Spring, 2. Summer, 3. Fall");
		season = type.nextInt();
		switch (season) {
		case 1:
			System.out.println("Select your crop.");
			System.out.println("1. Blue Jazz, 2. Cauliflower ,3. Coffee Bean");
			System.out.println("4. Garlic, 5. Green bean, 6. Kale");
			System.out.println("7. Parsnip, 8. Potato, 9. Rhubarb");
			System.out.println("10. Strawberry, 11. Tulip, 12. Rice");
			choice = type.nextInt();
			switch (choice) {
			case 1: crop = "Blue Jazz";
			profit = 50;
			price = 30;
			break;
			case 2: crop = "Cauliflower";
			profit = 175;
			price = 80;
			break;
			case 3: crop = "Coffee Bean";
			profit = 15;
			amount = 4;	
			price = 0;
			break;
			case 4: crop = "Garlic";
			profit = 60;
			price = 40;
			break;
			case 5: crop = "Green Bean";
			profit = 40;
			price = 60;
			break;
			case 6: crop = "Kale";
			profit = 110;
			price = 70;
			break;
			case 7: crop = "Parsnip";
			profit = 35;
			price = 20;
			break;
			case 8: crop = "Potato";
			profit = 80;
			price = 50;
			break;
			case 9: crop = "Rhubarb";
			profit = 220;
			price = 100;
			break;
			case 10: crop = "Strawberry";
			profit = 120;
			price = 100;
			break;
			case 11: crop = "Tulip";
			profit = 30;
			price = 20;
			break;
			case 12: crop = "Rice";
			profit = 30;
			price = 40;
			break;
			}
			break;
		case 2:
			System.out.println("Select your crop.");
			System.out.println("1. Bluleberry, 2. Corn, 3. Coffee Bean");
			System.out.println("4. Hops, 5. Hot Pepper, 6. Melon ");
			System.out.println("7. Poppy, 8. Radish, 9. Red Cabbage");
			System.out.println("10. Starfruit, 11. Summer Spangle, 12. Sunflower");
			System.out.println("13. Tomato, 14. Wheat");
			choice = type.nextInt();
			switch (choice) {
			case 1: crop = "Blueberry";
			profit = 50;
			amount = 3;
			price = 80;
			break;
			case 2: crop = "Corn";
			profit = 50;
			price = 150;
			break;
			case 3: crop = "Coffee Bean";
			profit = 15;
			amount = 4;
			price = 0;
			break;
			case 4: crop = "Hops";
			profit = 25;
			price = 60;
			break;
			case 5: crop = "Hot Pepper";
			profit = 40;
			price = 40;
			break;
			case 6: crop = "Melon";
			profit = 250;
			price = 80;
			break;
			case 7: crop = "Poppy";
			profit = 140;
			price = 100;
			break;
			case 8: crop = "Radish";
			profit = 90;
			price = 40;
			break;
			case 9: crop = "Red Cabbage";
			profit = 260;
			price = 100;
			break;
			case 10: crop = "Starfruit";
			profit = 750;
			price = 400;
			break;
			case 11: crop = "Summer Spangle";
			profit = 90;
			price = 50;
			break;
			case 12: crop = "Sunflower";
			profit = 80;
			price = 200;
			break;
			case 13: crop = "Tomato";
			profit = 60;
			price = 50;
			break;
			case 14: crop = "Wheat";
			profit = 25;
			price = 10;
			break;
			}
			break;
		case 3: 
			System.out.println("Select your crop.");
			System.out.println("1. Amaranth, 2. Artichoke, 3. Beet");
			System.out.println("4. Bok Choy, 5. Corn, 6. Cranberries");
			System.out.println("7. Eggplant, 8. Fairy Rose, 9. Grape");
			System.out.println("10. Pumpkin, 11. Yam");
			choice = type.nextInt();
			switch (choice) {
			case 1: crop = "Amaranth";
			profit = 150;
			price = 70;
			break;
			case 2: crop = "Artichoke";
			profit = 160;
			price = 30;
			break;
			case 3: crop = "Beet";
			profit = 100;
			price = 20;
			break;
			case 4: crop = "Bok Choy";
			profit = 80;
			price = 50;
			break;
			case 6: crop = "Cranberries";
			profit = 75;
			price = 240;
			break;
			case 5: crop = "Corn";
			profit = 50;
			price = 150;
			break;
			case 7: crop = "Eggplant";
			profit = 60;
			price = 20;
			break;
			case 8: crop = "Fairy Rose";
			profit = 290;
			price = 200;
			break;
			case 9: crop = "Grape";
			profit = 80;
			price = 60;
			break;
			case 10: crop = "Pumpkin";
			profit = 320;
			price = 100;
			break;
			case 11: crop = "Yam";
			profit = 160;
			price = 60;
			break;
			}
			break;
		}
		
		System.out.println("Chosen crop: " + (crop));
		System.out.println("How much of the crop you will harvest?");
		number = type.nextDouble();
		
		System.out.println("How many times will you harvest the crops? (1 if the crop does not regrow)");
		repeat = type.nextDouble();
		
		System.out.println("Tiller proffession? (y/n)");
		yes = type.nextLine();
		yes = type.nextLine();
		if(yes.equals("y")) {
			mult = mult * 1.1;
		}
		sum = (profit * amount * number * repeat * mult);
		sumprice = (number * price);
		System.out.printf("You are harvesting %.0f ", number);
		System.out.printf((crop) + "s ");
		System.out.printf("%.0f time(s).\n", repeat);
		System.out.println("The total income totals to:");
		System.out.printf("%.0f", sum);
		System.out.println("");
		System.out.println("The cost of the seeds (bought from Pierre):");
		System.out.printf("%.0f", sumprice);
		
		

	}

}
