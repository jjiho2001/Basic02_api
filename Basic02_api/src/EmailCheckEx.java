import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		
		Scanner e_mail = new Scanner(System.in);
		
		for(;;) {
			
			System.out.print("�̸��� : ");
			String info = e_mail.next().trim();
			
			//StringTokenizer �̿�
			StringTokenizer info_token = new StringTokenizer(info, "@");
			int atMark = info.indexOf("@");
			
			if(info_token.countTokens() != 2) {
				System.out.println("error");
			} else {
				String id = info_token.nextToken();
				String domain = info_token.nextToken();
				int point = domain.indexOf(".");
				
				if(atMark == -1 || id.length() < 3 || point == -1 || point == 0 ) {
					System.out.println("�߸��� �̸��� �ּ��Դϴ�.");
					continue;
				} else {
					System.out.println("���̵� : " + id);
					System.out.println("������ : " + domain);
				}
				
				System.out.println("�ٽ��Ͻðڽ��ϱ�? y. ��, n. �ƴϿ�");
				if(e_mail.nextLine().equalsIgnoreCase("y")) {
					continue;
				} else if(e_mail.nextLine().equalsIgnoreCase("n")) {
					break;
				} 
				
			}
			
			// Split �̿�
			/*
			String[] info_div = info.split("@");
			
			if(info.indexOf("@") == -1 || info_div.length != 2 || info_div[0].length() < 3 || info_div[1].substring(0,1).equals(".") || info_div[1].indexOf(".") == -1) {
				System.out.println("�߸��� �̸��� �ּ��Դϴ�.");
				continue;
			} else {
				System.out.printf("���̵� : %s\n", info_div[0]);
				System.out.printf("������ : %s\n", info_div[1]);
				
				System.out.println("�ٽ��Ͻðڽ��ϱ�? y. ��, n. �ƴϿ�");
					if(e_mail.nextLine().equalsIgnoreCase("y")) {
						continue;
					} else if(e_mail.nextLine().equalsIgnoreCase("n")) {
						break;
					} 
			}
			*/
		}
		
	}
}
