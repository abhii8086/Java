package arraysBasics_1;

public class delete_an_element_from_array {

	public static void main(String[] args) {

		int a[] = { 2, 6, 1, 3, 5 };
		int key = 6;

		delete(a, key); // call

	}

	public static void delete(int a[], int key) {
		int res = -1; // for status
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				res = i;
				break;

			}
		}

		if (res == -1) {
			System.out.println("key is absent:");
		}

		for (int j = res; j < a.length - 1; j++) {
			a[j] = a[j + 1];
		}

		for (int x : a) {
			System.out.print(x + "  ");
		}
		System.out.println("");
		System.out.println(a.length);
	}
}