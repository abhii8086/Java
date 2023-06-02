package OOPS_1;

class person {
	String name;
	int age;

	person(String name, int age) { // newName , newAge avoid ambiguity also this keyword can used

		this.name = name;
		this.age = age;
	}

}

public class this_keyword {

	public static void main(String[] args) {

		person p1 = new person("Ajay", 23);
		System.out.println(p1.name + " " + p1.age);

	}

}
