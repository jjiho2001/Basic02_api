
public class PrintfTest {

	public static void main(String[] args) {
		//��½� ���ڿ� �Ǵ� ���ڸ� �ڸ����� �����Ͽ� ����� �� �ִ�.
		
		// Inputstream class�� print(), println(), printf()
		
		int a = 135;
		double b = 235.235235;
		String name = "ȫ�浿";
		
		System.out.println(a);
		
		
		System.out.printf("1. a������ ���� %10d�Դϴ�. \n", a);
		System.out.printf("2. a������ ���� %-10d�Դϴ�. \n", a);
		System.out.printf("3. %.4f\n", b);
		System.out.printf("4. %5s\n", name);
		System.out.printf("5. ���� �̸��� %5s�Դϴ�.\n", name);
		System.out.printf("6. %5s\n", "ABC");
		System.out.printf("7. %5c\n", 'Z');
		// printf(pattern, ����);
		// pattern : %d(����), %f(�Ǽ�), %s(���ڿ�), %c(���� �ϳ�)
		// �ٹٲ� ����
		// �ѱ۰� ����� ���̰� �ٸ�.
		// '' �ȿ��� �� ���� ����.
		
		System.out.println("8. ���� �̸���\n \"ȫ�浿\"�Դϴ�.");
		// \ : �����, \n : �ٹٲ�, \" : ", \t : tabŰ(8ĭ �鿩����)
		
		System.out.printf("9. a=%5d, b=%7.2f, name = %s", a, b, name);
		//�� ���� ���� ������ �����ؼ� �� ���� ����.
	}

}
