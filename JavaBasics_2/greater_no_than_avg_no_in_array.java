package JavaBasics_2;

//Note:we can use both here for each and for loop to complete this task.
public class greater_no_than_avg_no_in_array {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int sum = 0;
		double avg = 0;
		for (int x : array) {
			sum = sum + x;
		}
		avg = sum / array.length;
		System.out.println(avg);

//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > avg) {
//				System.out.println(array[i]);
//			}
//		}

		for (int y : array) {
			if (y > avg) {
				System.out.println(y);
			}
		}

	}

}
