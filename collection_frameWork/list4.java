package collection_frameWork;

import java.util.Vector;

public class list4 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		System.out.println(v1);

		v1.remove(0);

		System.out.println(v1);

		v1.set(0, "B");
		v1.set(1, "A");
		System.out.println(v1);

	}

}
