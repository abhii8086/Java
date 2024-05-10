package collection_frameWork;

import java.util.Stack;

public class list3 {

	public static void main(String[] args) {
		Stack<String> id1 = new Stack<String>();
		Stack<String> id2 = new Stack<String>();
		id1.add("one");
		id1.add("two");
		System.out.println(id1);
		id2.push("three");
		id2.push("four");
		System.out.println(id2);
		id1.addAll(id2);
		System.out.println(id1);
		id1.pop();
		System.out.println(id1);

	}
}
