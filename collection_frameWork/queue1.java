package collection_frameWork;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue1 {

	public static void main(String[] args) {
		Queue<String> q1 = new ArrayDeque<>();

		// add
		q1.add("one");
		q1.add("two");
		// delete
		q1.remove("remove");
		// update
		// no direct method use add()/remove()
		// read
		for (String x : q1) {
			System.out.println(x);
		}

		// contains
		System.out.println(q1.contains("two"));

	}

}
