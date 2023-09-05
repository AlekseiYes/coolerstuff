package balls;

public class Test_basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] gby = new String[3];
		gby[0] = "Green";
		gby[1] = "Blue";
		gby[2] = "Yellow";
		
		System.out.println(gby[1]);
		
		for(int i = 0; i < gby.length; i++) {
			System.out.println((i+1) + ". " + (gby[i]));
		}
		

	}

}
