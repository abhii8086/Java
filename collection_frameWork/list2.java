package collection_frameWork;

import java.util.LinkedList;
import java.util.List;

public class list2 {

	public static void main(String[] args) {
		List<String> groceries = new LinkedList<String>();
// create add last
		groceries.add("chaval");
		groceries.add("gehu");
		groceries.add("dal");
// add position specific 
		groceries.add(0, "sunFlowerOil");
		System.out.println(groceries);
// read 
		System.out.println(groceries.get(2));
// update
		groceries.set(0, "chana");
		System.out.println(groceries);
// delete 
		groceries.remove(0);
		System.out.println(groceries);

	}

}
