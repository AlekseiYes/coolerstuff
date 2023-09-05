package balls;
import java.util.Scanner;

public class Test_basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pick = new Scanner(System.in);
		
		String[] yes = new String[4];
		yes[0] = "Actions speak louder than words.";
		yes[1] = "A barking dog never bites.";
		yes[2] = "A penny saved is a penny earned.";
		yes[3] = "All things come to those who wait.";
		
		System.out.println("Pick number from 1-4.");
		int choice = pick.nextInt();
		System.out.println(yes[choice-1]);
		
		
		
		

	}

}
