package JavaBasics_2;

public class sum_of_value_of_array {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int x : array) {
			sum = sum + x;
		}
		System.out.println("sum = " + sum);
	}

}
