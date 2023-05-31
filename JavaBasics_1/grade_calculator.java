package JavaBasics_1;

import java.util.Scanner;

public class grade_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please anter your marks between 0 to 100");
		int marks = sc.nextInt();
		switch (marks / 10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		default:
			System.out.println("Failed");
		}

	}

}
