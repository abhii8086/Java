package JavaBasics_1;

import java.util.Scanner;

public class inches_to_meter_conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the inch value: ");
		double inches = sc.nextDouble();
		System.out.println("The meter value is: " + inches * 0.0254);

	}

}
