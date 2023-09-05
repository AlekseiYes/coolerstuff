package balls;

public class Test_basic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[3];
		nums[0] = 3;
		nums[1] = 6;
		nums[2] = 1;
		
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
		}
		System.out.println(sum);
		
		

	}

}
