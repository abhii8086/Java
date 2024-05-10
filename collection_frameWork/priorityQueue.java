package collection_frameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

	public static void main(String[] args) {
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("A");
		q1.add("B");
		q1.add("C");
		System.out.println(q1);
		System.out.println(q1.poll());
		q1.offer("b");
		System.out.println(q1);
		q1.offerFirst(0, "a");

	}

}
