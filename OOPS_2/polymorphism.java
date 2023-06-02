//this can be achieved by method overloading and overriding.
package OOPS_2;

import java.util.Scanner;

public class polymorphism {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Apple a1 = new Apple();
		a1.eat();

//		System.out.println("Enter two no");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int z = 7;
//		System.out.println(sum(a, b, z));
//
//	}
//
//	static int sum(int x, int y) {
//
//		int sum = x + y;
//		return sum;
//
//	}
//
//	static int sum(int x, int y, int z) {
//
//		int sum = x + y + z;
//		return sum;
//

//_____________________________________________________________________________________	

	}

}

class Fruit {
	String name;

	void eat() {
		System.out.println("This is Fruit method");
	}
}

class Apple extends Fruit {
	void eat() {
		System.out.println("This is Apple method");
	}
}
