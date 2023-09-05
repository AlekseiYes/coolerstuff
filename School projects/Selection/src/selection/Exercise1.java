package selection;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "Exercise 1";
		String text2 = "Exercise 2";
		String text3 = "Exercise 3";
		
		System.out.println(text1);
		System.out.println("");
		
		int num1 = 7;
		int num2 = 6;
		
		if(num1 == num2) 
		{
			System.out.println("Number 1 is equal to number 2");
		}
		if(num1 > num2)
		{
			System.out.println("Number 1 is greater than number 2");
		}
		if(num1 >= num2)
		{
			System.out.println("Number 1 is greater or equal to number 2");
		}
		if(num1 != num2)
		{
			System.out.println("Number 1 is not equal to number 2");
		}
		
		System.out.println("");
		System.out.println(text2);
		System.out.println("");
		
		num1 = 8;
		num2 = 4;
		int num3 = 8;
		
		if(num1 == num2 && num1 == num3)
		{
			System.out.println("All the numbers are equal");
		}
		else if(num1 != num2)
		{
			System.out.println("All numbers are not equal");
		}
		
		System.out.println("");
		
		if(num1 == num2)
		{
			System.out.println("Number 1 and number 2 are equal");
		}
		else if (num1 != num2)
		{
			System.out.println("Number 1 and number 2 are not equal");
		}
		
		System.out.println("");
		
		if(num1 == num3)
		{
			System.out.println("Number 1 and number 3 are equal");
		}
		else if(num1 != num3)
		{
			System.out.println("Number 1 and number 3 are not equal");
		}
		
		System.out.println("");
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Number 1 is greater than number 2 and greater than number 3");
		}
		else System.out.println("Number 1 is not greater than both number 2 and number 3");
		
		System.out.println("");
		
		if(num1 == num2)
		{
			System.out.println("Number 1 and number 2 are equal");
		}
		else if(num1 == num3)
		{
			System.out.println("Number 1 and number 2 are not equal");
			System.out.println("Number 1 and number 3 are equal");
		}
		
		System.out.println("");
		System.out.println(text3);
		
		System.out.println("");
		
		String name1 = "Poopy";
		String name2 = "Poopy";
		String name3 = "Poopy";
		
		if(name1 == name2)
		{
			System.out.println("Names 1 and 2 are the same");
		}
		if(name1 == name3)
		{
			System.out.println("Names 1 and 3 are the same");
		}
		if (name1 == name2)
		{
			System.out.println("Names 1 and 2 are equal");
		}
		else if (name1 == name3)
		{
			System.out.println("Names 1 and 2 are not the same, but names 1 and 3 are");
		}
		

	}

}
