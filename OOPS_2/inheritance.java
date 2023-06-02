package OOPS_2;

class university {
	String name;
	int estabishedYear;
}

class mumbaiUniversity extends university {

}

class puneUniversity extends university {

}

public class inheritance {

	public static void main(String[] args) {

		mumbaiUniversity u1 = new mumbaiUniversity();
		u1.estabishedYear = 1962;
		System.out.println(u1.estabishedYear);

	}

}
