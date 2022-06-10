import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		// Math.random() : 0.0000000000001 ~ 0.999999999999
		
		int[] ran = new int[100];
		
		for(int i = 0 ; i < ran.length; i++) {
			ran[i] = (int)(Math.random()*16 + 72); // 1~50
		}
		
		//난수 * 100 + 1 -> 1~100
		//(정수화)난수*(큰수-작은수+1) + 작은 수
		//72~87 (int)(Math.random()*16) + 72
		System.out.println(Arrays.toString(ran));
		
		Random random = new Random();
		
		int[] data = new int[100];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(10);
		}
		
		System.out.println(Arrays.toString(data));
		
		for(int i = 1; i < 100; i++) {
			System.out.print(random.nextBoolean() + "\t");
		}
	}
}
