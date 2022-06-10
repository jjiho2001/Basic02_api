import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		
		Scanner e_mail = new Scanner(System.in);
		
		for(;;) {
			
			System.out.print("이메일 : ");
			String info = e_mail.next().trim();
			
			//StringTokenizer 이용
			StringTokenizer info_token = new StringTokenizer(info, "@");
			int atMark = info.indexOf("@");
			
			if(info_token.countTokens() != 2) {
				System.out.println("error");
			} else {
				String id = info_token.nextToken();
				String domain = info_token.nextToken();
				int point = domain.indexOf(".");
				
				if(atMark == -1 || id.length() < 3 || point == -1 || point == 0 ) {
					System.out.println("잘못된 이메일 주소입니다.");
					continue;
				} else {
					System.out.println("아이디 : " + id);
					System.out.println("도메인 : " + domain);
				}
				
				System.out.println("다시하시겠습니까? y. 예, n. 아니오");
				if(e_mail.nextLine().equalsIgnoreCase("y")) {
					continue;
				} else if(e_mail.nextLine().equalsIgnoreCase("n")) {
					break;
				} 
				
			}
			
			// Split 이용
			/*
			String[] info_div = info.split("@");
			
			if(info.indexOf("@") == -1 || info_div.length != 2 || info_div[0].length() < 3 || info_div[1].substring(0,1).equals(".") || info_div[1].indexOf(".") == -1) {
				System.out.println("잘못된 이메일 주소입니다.");
				continue;
			} else {
				System.out.printf("아이디 : %s\n", info_div[0]);
				System.out.printf("도메인 : %s\n", info_div[1]);
				
				System.out.println("다시하시겠습니까? y. 예, n. 아니오");
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
