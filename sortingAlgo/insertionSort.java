package sortingAlgo;

public class insertionSort {

	public static void main(String[] args) {

		int a[] = { 1, 5, 9, 4, 3, 456, 56, 54 };
		for (int i = 1; i < a.length; i++) {
			int key = a[i]; // a[1]
			int j = i - 1; // a[0]

			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j]; // swap of j+1 and j
				--j;

			}

			a[j + 1] = key; // update the next value

		}

		for (int x : a) {
			System.out.println(x);
		}

	}
}