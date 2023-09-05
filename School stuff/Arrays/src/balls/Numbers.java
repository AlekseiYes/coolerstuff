package balls;
import java.util.Arrays;
import java.util.Random;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random roll = new Random();
		int rolled;
		int[] thrownDiceNumbers = new int[5];
		for(int i = 0; i < thrownDiceNumbers.length; i++) {
			rolled = roll.nextInt(6)+1;
			thrownDiceNumbers[i] = (rolled);
		}
		Arrays.sort(thrownDiceNumbers);
	for(int o = 0; o < thrownDiceNumbers.length; o++) {
		
		System.out.println(thrownDiceNumbers[o]);
		}
	System.out.println("");
	System.out.println(thrownDiceNumbers[4] );
	System.out.println("");
	
	int sum = 0;
	
	for(int p = 0; p <thrownDiceNumbers.length; p++) {
		sum = sum + thrownDiceNumbers[p];
	}
	
	System.out.println(sum);
	
	
	
		

	}

}
