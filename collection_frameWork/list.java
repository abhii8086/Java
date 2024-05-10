package collection_frameWork;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List<String> vegetables = new ArrayList<String>();
//add last
		vegetables.add("tomato");
		vegetables.add("potato");
		vegetables.add("Brinjal");
//add position specific
		vegetables.add(0, "pea");
//update position specific
		vegetables.set(2, "zomato");
		System.out.println(vegetables);
//getting element position specific
		System.out.println(vegetables.get(1));
// remove position specific
		vegetables.remove(0);
		System.out.println(vegetables);

		for (String x : vegetables) {
			System.out.print(x + "  ");
		}
	}

}
