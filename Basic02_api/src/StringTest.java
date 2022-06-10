import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String name2 = "홍길동";
		
		String addr = new String("  서울시 강남구 강남구 역삼동 - d  ");
		String addr2 = new String("서울시 강남구 역삼동 - D");
		
		if(name == name2) {
			System.out.println("name과 name2는 같다");
		} else {
			System.out.println("name과 name2는 다르다");
		}
		
		if(addr == addr2) {
			System.out.println("addr과 addr2는 같다");
		} else {
			System.out.println("addr과 addr2는 다르다");
		}
		
		String addr3 = addr2;
		
		if(addr2 == addr3) {
			System.out.println("addr2과 addr3는 같다");
		} else {
			System.out.println("addr2과 addr3는 다르다");
		}
		
		// equels() : 객체 내의 값을 비교해줌. 대소문자 구별함
		
		boolean check = addr.equals(addr2);
		if(check) {
			System.out.println("addr과 addr2는 같다");
		} else {
			System.out.println("addr과 addr2는 다르다");
		}
		
		// equelsIgnoreCase() : 값 비교, 대소문자 구별 X
		
		if(addr.equalsIgnoreCase(addr2)) {
			System.out.println("addr과 addr2는 같다");
		} else {
			System.out.println("addr과 addr2는 다르다");
		}
		
		String str = "A";
		str += "B"; // String이 값이 바뀌면 기존 주소는 폐기하고 새로운 주소룰 가짐
		String str2 = str + 100;
		System.out.println(str2);
		
		System.out.println("charAt()->" + addr.charAt(5));
		System.out.println("concat()->" + addr.concat(str2));
		
		String txt = "Hello!";
		byte txtCode[] = txt.getBytes();
		System.out.println(Arrays.toString(txtCode));
		
		// 찾는 문자가 없는 경우 -1이 return
		int indexof = addr.indexOf("강");
		System.out.println(indexof);
		System.out.println(addr.lastIndexOf("강"));
		System.out.println(addr.indexOf("강", 5));
		System.out.println(addr.length());
		System.out.println("8".repeat(50));
		
		addr = addr.replaceAll("강남구", "Gangnamgu");
		System.out.println(addr);
		
		String tel = "010 -1111-2222";
		
		String[] tel_str = tel.split("-");
		
		System.out.println(Arrays.toString(tel_str));
		
		// substring : 문자열에서 일부의 문자열을 얻을 때
		String sub1 = addr.substring(6, 14);
		System.out.println(sub1);
		System.out.println(addr.toLowerCase());
		System.out.println(addr.toUpperCase());
		
		String x = String.valueOf(2500) + 500;
		System.out.println(x);
		char[] c = {'a','b','c','핫','핫'};
		System.out.println(c);
		System.out.println(String.valueOf(c));
		
		System.out.println(addr.trim() + "?");
		}

}
