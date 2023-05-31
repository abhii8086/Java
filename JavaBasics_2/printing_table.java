package JavaBasics_2;

import java.util.Scanner;

public class printing_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no for table: ");
		int num = sc.nextInt();
		int table = 0;
		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(table);
		}

	}

}
