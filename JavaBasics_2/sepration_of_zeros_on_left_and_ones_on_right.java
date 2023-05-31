package JavaBasics_2;

public class sepration_of_zeros_on_left_and_ones_on_right {

	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 0, 1, 1, 1, 1, 0 };

		int size = a.length;
		int b[] = new int[size];
		int p = 0; // for 0
		int q = 0; // for 1

		for (int x : a) {
			if (x == 0) {
				p++;
			} else {
				q++;
			}
		}
		System.out.println("no of zero's: " + p);
		System.out.println("no of one's: " + q);

		for (int j = 0; j < p; j++) {
			b[j] = 0;
		}
		for (int k = p; k < size; k++) {
			b[k] = 1;
		}

		for (int y : b) {
			System.out.print(y + " ");
		}
	}
}
