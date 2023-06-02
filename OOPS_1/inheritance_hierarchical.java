package OOPS_1;

class A {
	void M() {
		System.out.println("this is method of A");
	}
}

class B extends A {
	void N() {
		System.out.println("this is method of B");
	}
}

class C extends A {
	void O() {
		System.out.println("this is the method of C");
	}
}

public class inheritance_hierarchical {

	public static void main(String[] args) {

		C c1 = new C();
		B b1 = new B();
		c1.M();
		b1.M();
	}

}
