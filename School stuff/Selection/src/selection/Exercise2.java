package selection;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 100;
		if(age > 0 && age < 18)
		{
			System.out.println("You are underage.");
			if(age >= 15)
			{
				System.out.println("You can drive a moped.");
			}
	
		}
		else if(age >= 65)
		{
			System.out.println("You are retired.");
		}
		else System.out.println("You are an adult");
		
		if(age >= 18)
		{
			System.out.println("You can drive a car.");
		}
		if(age % 10 == 0 && age >= 10 && age <= 120)
		{
			System.out.println("Anniversary party!");
		}
		if(age == 100)
		{
			System.out.println("Congratulations!");
			System.out.println("Congratulations!");
			System.out.println("Congratulations!");
		}
		if(age >= 40 && age <= 50)
		{
			System.out.println("We wish you a happy mid-life!");
		}
		if(age == 69)
		{
			System.out.println("Nice");
		}
	}

}
