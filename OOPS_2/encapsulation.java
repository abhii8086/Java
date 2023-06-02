package OOPS_2;

class Student {
	public String name;
	public int age;

	public void Attendence() {
		System.out.println("created for taking roll call");
	}
}

public class encapsulation {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Abhi";
		s1.age = 23;
		s1.Attendence();
		System.out.println(s1.name + "  " + s1.age);

	}

}
