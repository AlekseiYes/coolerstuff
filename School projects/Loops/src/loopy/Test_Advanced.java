package loopy;
import java.util.Scanner;
public class Test_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		
		System.out.println("First number?");
		int num1 = type.nextInt();
		System.out.println("Second number?");
		int num2 = type.nextInt();
		
		for(int i = 0; i <= num2; i++) {
			if(i >= num1 && i <= num2) {
				
				System.out.println(i);
			}
			
			
			
			
		}
		
		
		
		
		

	}

}
