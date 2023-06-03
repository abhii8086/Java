package arraysBasics_1;

public class max_in_array {

	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2 };
		System.out.println(a[max(a)]);
	}

	public static int max(int a[]) {

		int max = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[max]) {
				max = i;
			}
		}
		return (max);
	}
}
