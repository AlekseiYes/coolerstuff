package loopy;
import java.util.Scanner;
public class Test_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		String star = "";
		System.out.println("How many rows?");
		int rows = type.nextInt();
		String spaces = " ";
		for(int i = 0; i < rows; i++) {
			
			System.out.println((spaces.repeat(rows -1 - i)) + (star+="*"));
		}
		
		
		
		
		

	}

}
