package collection_frameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");

		Iterator<String> it = l1.iterator();
		while (it.hasNext()) {
			System.err.println(it.next());
		}

	}

}
