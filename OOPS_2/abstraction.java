package OOPS_2;

//interface Animal {
//	public void animalSounds(); // body is not here.
//
//	public void sleep();// body is not defined here.
//}
//
//class lion implements Animal {  // body is defined in other implement class
//	public void animalSounds() {
//		System.out.println("Roar");
//	}
//
//	public void sleep() {
//		System.out.println("$$$$");
//	}
//
//}

//______________________________________________________________________________________

interface fisrtInterface {
	public void method1();
}

interface secondInterface {
	public void method2();

}

class demo implements fisrtInterface, secondInterface {
	public void method1() {
		System.out.println("method 1");
	}

	public void method2() {
		System.out.println("method 2");

	}
}

public class abstraction {

	public static void main(String[] args) {

		demo d1 = new demo();
		d1.method1();
		d1.method2();

//
//		lion l1 = new lion();
//		l1.animalSounds();
//		l1.sleep();
	}

}
