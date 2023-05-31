package JavaBasics_1;

import java.util.Scanner;

public class area_and_perimeter_of_circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the your choice: \n1.for area\n2.for perimeter");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the radius: ");
			double radius = sc.nextDouble();
			System.out.println("The area of the circle is: " + (3.14 * radius * radius));
		} else if (choice == 2) {
			System.out.println("Enter the radius: ");
			double radius = sc.nextDouble();

			System.out.println("The perimeter of the circle is: " + (2 * 3.14 * radius));
		} else {
			System.out.println("Invalid Input");
		}

	}

}
