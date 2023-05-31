package JavaBasics_2;

public class fibonacci_method {

	public static void main(String[] args) {
		int a = -1;
		int b = 1;
		int c = 0;
		int N = 6;

		for (int i = 1; i <= N; i++) {

			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}
	}

}
