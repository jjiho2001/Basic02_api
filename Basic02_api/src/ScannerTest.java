import java.util.Scanner;
//import java.lang, complier가 java.lang 패키지의 클래스는 import를 자동으로 추가해줌.

public class ScannerTest {

	public static void main(String[] args) {
		// 실행중 콘솔에서 데이터를 입력받아 처리한다.
		
		// new : 객체생성(클래스를 이용하여)
		
		Scanner scan = new Scanner(System.in);
		
		// 정수 : nextInt(); 실수 : nextDouble(); 문자열 : nextLine();
		System.out.print("이름 : ");
		String data = scan.nextLine();
		
		System.out.print("점수 : ");
		int data02 = scan.nextInt();
		
		System.out.println("이름 : " + data + " , " + "점수 : " + (data02 + 20));
		
		scan.close();
		System.out.println(data);
		
	}

}
