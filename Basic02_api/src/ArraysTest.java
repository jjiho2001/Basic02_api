import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// Arrays class : �迭�� �̿��� ó���Ѵ�.
		
		int[] data = {85, 23, 53, 64, 34, 62, 56};
		
		//toString() : �迭�� ���� ���ڷ� ����� return
		String lst = Arrays.toString(data); // [85, 23, 53, 64, 34, 62, 56]
		System.out.println(lst);
		
		Integer[] data2 = {85,23,66,44,12};
		Arrays.sort(data2, Collections.reverseOrder());
		System.out.println(Arrays.toString(data2));
		
		int[] data3 = Arrays.copyOfRange(data, 2, 6);
		System.out.println(Arrays.toString(data3));
		
		System.out.println(Arrays.equals(data, data3));
	}
}
