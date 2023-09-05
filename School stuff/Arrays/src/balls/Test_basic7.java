package balls;
import java.util.ArrayList;
import java.util.Collections;
public class Test_basic7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Kia");
		cars.add("Tesla");
		cars.add("BMW");
		cars.add("Renault");
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		cars.add(1, "Ford");
		cars.remove(2);
		cars.set(2, "Audi");
		System.out.println("MODIFIED LIST");
		for(int o = 0; o < cars.size(); o++) {
		System.out.println(cars.get(o));	
		}
		
		Collections.sort(cars);
		System.out.println("SORTED LIST");
		for(int p = 0; p < cars.size(); p++) {
			System.out.println(cars.get(p));	
			}

	}

}
