package selection;

import java.util.Random;
import java.util.Scanner;

public class Independent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner type = new Scanner(System.in);
		Scanner growth = new Scanner(System.in);
		Random random = new Random();
		
		String shirt = "null";
		
		
		boolean died = false;
		boolean poor = false;
		boolean hard = false;
		boolean middle = false;
		boolean rich = false;
		boolean million = false;
		boolean help = false;
		int age = -1;
		int hatred = 0;
		int event = 0;
		do {
			age++;
		 
			
				System.out.println("You are " + (age) + " years old");
				
				switch (age) 
				{
				
				case 0:
					
					event = random.nextInt(100)+1;
					if(event <= 20) {
					System.out.println("You were born in a poor family.");
					poor = true;
					hard= false; middle = false; rich = false; million = false;}
					else if(event <= 50){
					System.out.println("You were born in a family of hard workers.");
					hard = true;
					poor= false; middle = false; rich = false; million = false;}
					else if(event <= 84) {
					System.out.println("You were born in a middle-class family.");
					middle = true;
					hard= false; poor = false; rich = false; million = false;}
					else if(event <= 96) {
					System.out.println("You were born in a rich and sustainable family.");
					rich = true;
					hard= false; middle = false; poor = false; million = false;}
					else if(event <= 100){
					System.out.println("You were born in a family of millionaires.");
					million = true;
					hard= false; middle = false; rich = false; poor = false;}
					event = random.nextInt(10000)+1;
					if(event == 10000) {
					System.out.println("The doctor accidentally dropped you and you died.");
					died = true;}
					break;
					
				case 1:
					System.out.println("You are about to say your first word...");
					type.next();
					event = random.nextInt(101)+1;
					if(event >= 0 && event <= 49){
					System.out.println("It was \"Mama\"!!!");}
					if(event == 50) { 
					System.out.println("It was \"MAMAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
					System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
					System.out.println("DIDN'T MEEEEAN TO MAKE YOOU CRYYYYYY!");
					System.out.println("Due to copyright I can not continue the lyrics, but you got the meme.");}
					if(event >= 51 && event <= 100) {
					System.out.println("It was \"Dada\"!!!");}
					if(event == 101) {
					System.out.println("It was... \"Help\"?");
					System.out.println("Your parents got frightened for a moment. ");
					help = true;}
					break;
				case 2:
					System.out.println("You are trying to make your first steps...");
					type.next();
					event = random.nextInt(1001)+1;
					if(event == 1) {
					System.out.println("You fell forward and hit your head and died.");
					died = true;}
					if(event >= 2 && event <= 101) {
					System.out.println("You fall after taking a single step...");
					type.next();
					System.out.println("Your parents are laughing.");
					System.out.println("You did not find that funny.");
					hatred++;}
					if(event >= 102 && event <= 501) {
					System.out.println("You take a couple of steps...");
					type.next();
					System.out.println("and fall.");}
					if(event >= 502) {
					System.out.println("You take a couple of steps...");
					type.next();
					System.out.println("and you manage to stand!");}
					break;
				case 3:
					System.out.println("It is your first day in the kindergarden!");
					type.next();
			
					
					if(hard) {
					event = random.nextInt(5)+1;
					switch (event) {
					case 1: shirt = "sun";
					break;
					case 2: shirt = "lion";
					break;
					case 3: shirt = "teddy bear";
					break;
					case 4: shirt = "";
					break;
					case 5: shirt = "Siemens SC-44 passenger locomotive";
					break;}
					}
					if(middle) {
					event = random.nextInt(10)+1;
					switch (event) {
					case 1: shirt = "sun";
					break;
					case 2: shirt = "lion";
					break;
					case 3: shirt = "teddy bear";
					break;
					case 4: shirt = "";
					break;
					case 5: shirt = "Siemens SC-44 passenger locomotive";
					break;
					case 6: shirt = "hydrogen atom";
					break;
					case 7: shirt = "football";
					break;
					case 8: shirt = "Lockheed SR-71 \"Blackbirt\" long-range, high-altitude, Mach 3+ strategic reconnaissance aircraft";
					break;
					case 9: shirt = "music note";
					break;
					case 10: shirt = "man";
					break;
					}
					}
					if(rich) {
					event = random.nextInt(15)+1;
					switch (event) {
					case 1: shirt = "sun";
					break;
					case 2: shirt = "lion";
					break;
					case 3: shirt = "teddy bear";
					break;
					case 4: shirt = "";
					break;
					case 5: shirt = "Siemens SC-44 passenger locomotive";
					break;
					case 6: shirt = "hydrogen atom";
					break;
					case 7: shirt = "football";
					break;
					case 8: shirt = "Lockheed SR-71 \"Blackbirt\" long-range, high-altitude, Mach 3+ strategic reconnaissance aircraft";
					break;
					case 9: shirt = "music note";
					break;
					case 10: shirt = "hotdog";
					break;
					case 11: shirt = "cat";
					break;
					case 12: shirt = "bags of money";
					break;
					case 13: shirt = "gold bar";
					break;
					case 14: shirt = "chicken";
					break;
					case 15: shirt = "space rocket";
					break;
					}
					}
					if(million) {
						event = random.nextInt(15)+1;
						switch (event) {
						case 1: shirt = "sun";
						break;
						case 2: shirt = "lion";
						break;
						case 3: shirt = "teddy bear";
						break;
						case 4: shirt = "";
						break;
						case 5: shirt = "Siemens SC-44 passenger locomotive";
						break;
						case 6: shirt = "hydrogen atom";
						break;
						case 7: shirt = "football";
						break;
						case 8: shirt = "Lockheed SR-71 \"Blackbird\" long-range, high-altitude, Mach 3+ strategic reconnaissance aircraft";
						break;
						case 9: shirt = "music note";
						break;
						case 10: shirt = "hotdog";
						break;
						case 11: shirt = "cat";
						break;
						case 12: shirt = "bags of money";
						break;
						case 13: shirt = "gold bar";
						break;
						case 14: shirt = "chicken";
						break;
						case 15: shirt = "space rocket";
						break;
						}
						}
					if(poor) {
						System.out.println("You are wearing a pair of old overalls, torn boots and a dirty shirt.");
						type.next();
						System.out.println("Everyone is laughing at you.");
						hatred++;}
					else if(event != 4) {System.out.println("You are wearing a clean t-shirt with a " + (shirt)+ " print on it.");
					}
					else System.out.println("You are wearing a plain pastel green CAE7C1 t-shirt from H&M");
						
					
					break;
					
				case 4:
					
					break;
				}
				
					
				if(died)
				{
					System.out.println("You died!");
			        System.out.println("Game over");
			        System.out.println("You died at the age of " + (age));
			        break;
				}
				
			
			
		}	while(growth.next().equals("y"));
		System.out.println("You pressed a wrong button which stopped the game.");
			
		
	}
}
