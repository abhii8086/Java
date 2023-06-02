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

class C extends B {
	void O() {
		System.out.println("this is method of C");
	}
}

public class inheritance_multilevel {

	public static void main(String[] args) {
		C c1 = new C();
		c1.M();
		c1.N();
		c1.O();

	}

}
