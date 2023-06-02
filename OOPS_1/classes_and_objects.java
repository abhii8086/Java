package OOPS_1;

class Animal {
	String Name; // properties
	int legs;

	void walk() { // Behavior
		System.out.println("Yes I can walk.");
	}

	void sounds() {
		System.out.println("You can identify me by my sound.");
	}

}

public class classes_and_objects {

	public static void main(String[] args) {

		Animal a1 = new Animal(); // creating object a1

		a1.Name = "lion";
		a1.legs = 4;

		System.out.println(a1.Name + " " + a1.legs);
		a1.walk();
		a1.sounds();
	}

}
