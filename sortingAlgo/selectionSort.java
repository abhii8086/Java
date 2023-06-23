package sortingAlgo;

public class selectionSort {
	public static void main(String[] args) {
		int a[] = { 20, 12, 10, 15, 2 };

		for (int i = 0; i < a.length - 1; i++) {

			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			// swap
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;

		}

		for (int x : a) {
			System.out.println(x);
		}

	}

}
