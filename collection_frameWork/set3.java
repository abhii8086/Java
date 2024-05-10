package collection_frameWork;

import java.util.Set;
import java.util.TreeSet;

public class set3 {

	public static void main(String[] args) {
		Set<String> t1 = new TreeSet<>();
// add
		t1.add("A");
		t1.add("B");
		t1.add("C");
// display		
		System.out.println(t1);

// delete
		t1.remove("B");
		System.out.println(t1);
//update
		t1.add("D");
		t1.remove("A");
		System.out.println(t1);

	}

}
