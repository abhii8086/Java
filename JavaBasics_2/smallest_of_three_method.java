package JavaBasics_2;

import java.util.Scanner;

public class smallest_of_three_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		smallest(a, b, c);
	}

// this method for smallest of three.
	static void smallest(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if (b < c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
	}
}
