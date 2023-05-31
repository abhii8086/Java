package JavaBasics_2;

import java.util.Scanner;

public class max_min_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
// for taking user input 
		for (int j = 0; j < a.length; j++) {
			a[j] = sc.nextInt();
		}

// bubble sorting logic
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = 0; i < a.length - j - 1; i++) {
				if (a[i] > a[i + 1]) {
					a[i] = a[i] + a[i + 1];
					a[i + 1] = a[i] - a[i + 1];
					a[i] = a[i] - a[i + 1];
				}
			}
		}

		System.out.println("minima: " + a[0]);
		System.out.println("maxima: " + a[a.length - 1]);

	}
}
