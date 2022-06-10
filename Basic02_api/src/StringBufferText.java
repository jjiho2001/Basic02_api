
public class StringBufferText {

	public static void main(String[] args) {
		
		// String : 연산이 적은 데이터 쓰레드 가능
		// StringBuffer : 연산이 많고 쓰레드(동기화) 가능
		// StringBuilder : 연산이 많고 동기화를 고려하지 않을 때
		
		StringBuffer sb = new StringBuffer("JAVA programming Test..........");
		
		//확보한 메모리 확인
		System.out.println("Capacity -> " + sb.capacity());
		
		sb.append(false);// String은 a = a + "b" 이런식으로 값을 입력해야하지만, StringBuffer은 append만 하면 됨
		sb.insert(4, "JAVA");
		//sb.reverse();
		sb.delete(0, 4);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Java");
		StringBuffer sb3 = new StringBuffer("JAVA");
		
		//compareTo() : 문자와 문자를 비교하여 정수를 리턴해준다.
		
		int result = sb2.compareTo(sb3); // "Java" - "JAVA", a 와 A를 비교하고 차이를 확인했기 때문에, 더 이상 비교안함(비교는 아스키코드로)
		int result2 = sb3.compareTo(sb2); // "JAVA" - "Java"
		// 0 : 두 객체의 데이터가 같다.
		// 양수 : 왼쪽 객체의 데이터가 크다.
		// 음수 : 왼쪽 객체의 데이터가 작다.
		System.out.println("result : " + result + " result2 : " + result2);
		
	}

}
