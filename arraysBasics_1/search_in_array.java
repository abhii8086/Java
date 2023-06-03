package arraysBasics_1;

public class search_in_array {

	public static void main(String[] args) {

		int a[] = { 2, 4, 6, 1, 5 };
		int key = 6;
		int result = -1;
		// for search
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				result = i;
				break;

			}
		}
		// for status
		if (result == -1) {
			System.out.println("key is not found");

		} else {
			System.out.println("key is at index : " + result);
		}

	}

}
