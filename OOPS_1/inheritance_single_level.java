package OOPS_1;

class phone { // parent class
	String name;
	int modelNo;
}

class smartPhone extends phone { // child class
	int newModelNo;

	smartPhone(String name, int ModelNo) { // constructor
		this.name = name;
		this.modelNo = ModelNo;
	}

}

public class inheritance_single_level {

	public static void main(String[] args) {

		smartPhone p1 = new smartPhone("motoG", 2332);
		p1.newModelNo = 3252;
		System.out.println(p1.name + " " + p1.modelNo + " " + p1.newModelNo);

	}

}
