import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// Arrays class : 배열을 이용한 처리한다.
		
		int[] data = {85, 23, 53, 64, 34, 62, 56};
		
		//toString() : 배열의 값을 문자로 만들어 return
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
