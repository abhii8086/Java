package OOPS_1;

//Note: If you want to use methods without making object of that class use the static keyword as the main method
import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		methods m1 = new methods(); // creating an object m1
		System.out.println("sum is: " + m1.add(a, b));
		System.out.println("sub is: " + m1.sub(a, b));
		System.out.println("mul is: " + m1.mul(a, b));
		System.out.println("div is: " + m1.div(a, b));

	}

	int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	int sub(int x, int y) {
		int sum = x - y;
		return sum;
	}

	int mul(int x, int y) {
		int sum = x * y;
		return sum;
	}

	int div(int x, int y) {
		int sum = x / y;
		return sum;
	}
}
