package JavaBasics_2;

public class factorial_method {

	public static void main(String[] args) {
		int N = 5;
		int f = 1;
		for (int i = 1; i <= N; i++) {
			f = f * i;
		}
		System.out.println(f);
	}

}
