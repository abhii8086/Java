package collection_frameWork;

import java.util.HashMap;
import java.util.Map;

public class map1 {

	public static void main(String[] args) {
		Map<Integer, String> AttendenceSheet = new HashMap<>();
		AttendenceSheet.put(1, "Anb");
		AttendenceSheet.put(2, "pnb");
		AttendenceSheet.put(3, "ajk");

		System.out.println(AttendenceSheet.get(1));
		System.out.println(AttendenceSheet);
		AttendenceSheet.remove(2);
		System.out.println(AttendenceSheet);

	}

}
