package collection_frameWork;

import java.util.Map;
import java.util.TreeMap;

public class map2 {

	public static void main(String[] args) {
		Map<Integer, String> AttendenceSheet = new TreeMap<>();
		AttendenceSheet.put(1, "Anb");
		AttendenceSheet.put(2, "pnb");
		AttendenceSheet.put(3, "ajk");

		System.out.println(AttendenceSheet.get(1));
		System.out.println(AttendenceSheet);
		AttendenceSheet.remove(2);
		System.out.println(AttendenceSheet);
	}

}
