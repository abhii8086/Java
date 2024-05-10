package collection_frameWork;

import java.util.LinkedHashSet;

public class set2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
//add
		l1.add(1);
		l1.add(2);
		l1.add(3);
//delete
		l1.remove(1);
//isEmpty()
		l1.isEmpty();

//		no direct update method but can achieve by add and delete
		System.out.println(l1);
	}

}
