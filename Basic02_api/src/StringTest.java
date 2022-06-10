import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		String name2 = "ȫ�浿";
		
		String addr = new String("  ����� ������ ������ ���ﵿ - d  ");
		String addr2 = new String("����� ������ ���ﵿ - D");
		
		if(name == name2) {
			System.out.println("name�� name2�� ����");
		} else {
			System.out.println("name�� name2�� �ٸ���");
		}
		
		if(addr == addr2) {
			System.out.println("addr�� addr2�� ����");
		} else {
			System.out.println("addr�� addr2�� �ٸ���");
		}
		
		String addr3 = addr2;
		
		if(addr2 == addr3) {
			System.out.println("addr2�� addr3�� ����");
		} else {
			System.out.println("addr2�� addr3�� �ٸ���");
		}
		
		// equels() : ��ü ���� ���� ������. ��ҹ��� ������
		
		boolean check = addr.equals(addr2);
		if(check) {
			System.out.println("addr�� addr2�� ����");
		} else {
			System.out.println("addr�� addr2�� �ٸ���");
		}
		
		// equelsIgnoreCase() : �� ��, ��ҹ��� ���� X
		
		if(addr.equalsIgnoreCase(addr2)) {
			System.out.println("addr�� addr2�� ����");
		} else {
			System.out.println("addr�� addr2�� �ٸ���");
		}
		
		String str = "A";
		str += "B"; // String�� ���� �ٲ�� ���� �ּҴ� ����ϰ� ���ο� �ּҷ� ����
		String str2 = str + 100;
		System.out.println(str2);
		
		System.out.println("charAt()->" + addr.charAt(5));
		System.out.println("concat()->" + addr.concat(str2));
		
		String txt = "Hello!";
		byte txtCode[] = txt.getBytes();
		System.out.println(Arrays.toString(txtCode));
		
		// ã�� ���ڰ� ���� ��� -1�� return
		int indexof = addr.indexOf("��");
		System.out.println(indexof);
		System.out.println(addr.lastIndexOf("��"));
		System.out.println(addr.indexOf("��", 5));
		System.out.println(addr.length());
		System.out.println("8".repeat(50));
		
		addr = addr.replaceAll("������", "Gangnamgu");
		System.out.println(addr);
		
		String tel = "010 -1111-2222";
		
		String[] tel_str = tel.split("-");
		
		System.out.println(Arrays.toString(tel_str));
		
		// substring : ���ڿ����� �Ϻ��� ���ڿ��� ���� ��
		String sub1 = addr.substring(6, 14);
		System.out.println(sub1);
		System.out.println(addr.toLowerCase());
		System.out.println(addr.toUpperCase());
		
		String x = String.valueOf(2500) + 500;
		System.out.println(x);
		char[] c = {'a','b','c','��','��'};
		System.out.println(c);
		System.out.println(String.valueOf(c));
		
		System.out.println(addr.trim() + "?");
		}

}
