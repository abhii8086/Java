package JavaBasics_1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the yaer: ");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			System.out.println("This is leap year");
		} else {
			System.out.println("This is not a leap year");

		}
	}

}
