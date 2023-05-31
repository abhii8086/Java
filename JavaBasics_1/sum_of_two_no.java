package JavaBasics_1;

import java.util.Scanner;

public class sum_of_two_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		System.out.println("Sum is: " + (num1 + num2));
	}

}
