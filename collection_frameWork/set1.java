package collection_frameWork;

import java.util.HashSet;

public class set1 {

	public static void main(String[] args) {
		HashSet<String> student = new HashSet<>();
		student.add("Abhi");
		student.add("Tim");
		System.out.println(student);
		student.add("Abhi");
		System.out.println(student);
		System.out.println(student.contains("Abhi"));
//		remove(element)
		student.remove("Tim");
		System.out.println(student);
//		no direct update function is there!

	}

}
