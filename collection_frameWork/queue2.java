package collection_frameWork;

import java.util.LinkedList;
import java.util.Queue;

public class queue2 {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();
		q1.add("A");
		q1.add("B");
		System.out.println(q1);
		q1.remove("B");
		System.out.println(q1);

	}

}
