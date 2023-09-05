package balls;

public class Test_basic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {16, 18, 5, 3, 10};
		int lowestnum = 20;
		for(int i = 0; i < nums.length; i++) {
			
			if(lowestnum > nums[i]) {
				lowestnum = nums[i];
			}
			
			
		}
		
		System.out.println(lowestnum);
		
		
		

	}

}
