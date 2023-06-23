package sortingAlgo;

public class bubbleSort {

	public static void main(String[] args) {

		int a[] = { 37, 35, 67, 55, 87, 55, 65 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}
		}

		for (int x : a) {
			System.out.println(x);
		}
	}

}
