package JavaBasics_1;

import java.util.Scanner;

public class swap_of_two_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		System.out.println("The numebers before swap: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("The numebers after swap: ");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
