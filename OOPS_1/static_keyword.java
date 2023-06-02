package OOPS_1;

import java.util.Scanner;

//As the main method is static there's is no need of the object;
// However we can also make our own method as the static method;
public class static_keyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and bredth: ");
		int l = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(area(l, b));

	}

	static int area(int l, int b) {
		int area = l * b;
		return area;
	}

}
