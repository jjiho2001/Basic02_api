import java.util.Scanner;
//import java.lang, complier�� java.lang ��Ű���� Ŭ������ import�� �ڵ����� �߰�����.

public class ScannerTest {

	public static void main(String[] args) {
		// ������ �ֿܼ��� �����͸� �Է¹޾� ó���Ѵ�.
		
		// new : ��ü����(Ŭ������ �̿��Ͽ�)
		
		Scanner scan = new Scanner(System.in);
		
		// ���� : nextInt(); �Ǽ� : nextDouble(); ���ڿ� : nextLine();
		System.out.print("�̸� : ");
		String data = scan.nextLine();
		
		System.out.print("���� : ");
		int data02 = scan.nextInt();
		
		System.out.println("�̸� : " + data + " , " + "���� : " + (data02 + 20));
		
		scan.close();
		System.out.println(data);
		
	}

}
