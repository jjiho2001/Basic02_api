import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		//StringTokenizer : ���ڿ� ��������
		String colorname = "Red,.,.,.,.,.,,.,Blue,/////////Green,-----------Yellow,Brown";
		
		StringTokenizer st = new StringTokenizer(colorname, ",./-?");
		
		String[] color_str = colorname.split(",");
		System.out.println(Arrays.toString(color_str));
		
		System.out.println("tokencounts : " + st.countTokens());
		
		while(st.hasMoreElements()) { // true : ��ū�� �ִ�. false : ��ū�� ����.
			System.out.println(st.nextElement());
			
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(st.nextElement());
		}

	}

}
