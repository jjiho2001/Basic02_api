
public class PrintfTest {

	public static void main(String[] args) {
		//출력시 문자열 또는 숫자를 자릿수를 지정하여 출력할 수 있다.
		
		// Inputstream class의 print(), println(), printf()
		
		int a = 135;
		double b = 235.235235;
		String name = "홍길동";
		
		System.out.println(a);
		
		
		System.out.printf("1. a변수의 값은 %10d입니다. \n", a);
		System.out.printf("2. a변수의 값은 %-10d입니다. \n", a);
		System.out.printf("3. %.4f\n", b);
		System.out.printf("4. %5s\n", name);
		System.out.printf("5. 나의 이름은 %5s입니다.\n", name);
		System.out.printf("6. %5s\n", "ABC");
		System.out.printf("7. %5c\n", 'Z');
		// printf(pattern, 변수);
		// pattern : %d(정수), %f(실수), %s(문자열), %c(문자 하나)
		// 줄바꿈 없음
		// 한글과 영어는 길이가 다름.
		// '' 안에는 두 글자 못들어감.
		
		System.out.println("8. 나의 이름은\n \"홍길동\"입니다.");
		// \ : 제어문자, \n : 줄바꿈, \" : ", \t : tab키(8칸 들여쓰기)
		
		System.out.printf("9. a=%5d, b=%7.2f, name = %s", a, b, name);
		//한 번에 여러 패턴을 나열해서 쓸 수도 있음.
	}

}
