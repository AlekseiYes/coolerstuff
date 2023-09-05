package loopy;
import java.util.Scanner;

public class Test_Advanced2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner guess = new Scanner(System.in);
		String name;
		int m = 0;
		do{ ;
			System.out.println("Guess my name (type stop to exit)");
		name = guess.nextLine();
		if(name.equals("stop")) {
			break;
		}
		m++;
		if(name.equals("Emma")) {
			System.out.println("Congratulations!");
			
			break;
		}
		
		}while(!name.equals("stop"));
System.out.printf("You guessed %d times.", m);
	}

}
