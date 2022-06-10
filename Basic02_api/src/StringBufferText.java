
public class StringBufferText {

	public static void main(String[] args) {
		
		// String : ������ ���� ������ ������ ����
		// StringBuffer : ������ ���� ������(����ȭ) ����
		// StringBuilder : ������ ���� ����ȭ�� ������� ���� ��
		
		StringBuffer sb = new StringBuffer("JAVA programming Test..........");
		
		//Ȯ���� �޸� Ȯ��
		System.out.println("Capacity -> " + sb.capacity());
		
		sb.append(false);// String�� a = a + "b" �̷������� ���� �Է��ؾ�������, StringBuffer�� append�� �ϸ� ��
		sb.insert(4, "JAVA");
		//sb.reverse();
		sb.delete(0, 4);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Java");
		StringBuffer sb3 = new StringBuffer("JAVA");
		
		//compareTo() : ���ڿ� ���ڸ� ���Ͽ� ������ �������ش�.
		
		int result = sb2.compareTo(sb3); // "Java" - "JAVA", a �� A�� ���ϰ� ���̸� Ȯ���߱� ������, �� �̻� �񱳾���(�񱳴� �ƽ�Ű�ڵ��)
		int result2 = sb3.compareTo(sb2); // "JAVA" - "Java"
		// 0 : �� ��ü�� �����Ͱ� ����.
		// ��� : ���� ��ü�� �����Ͱ� ũ��.
		// ���� : ���� ��ü�� �����Ͱ� �۴�.
		System.out.println("result : " + result + " result2 : " + result2);
		
	}

}
