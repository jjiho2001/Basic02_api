import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		//StringTokenizer : 문자열 조각내기
		String colorname = "Red,.,.,.,.,.,,.,Blue,/////////Green,-----------Yellow,Brown";
		
		StringTokenizer st = new StringTokenizer(colorname, ",./-?");
		
		String[] color_str = colorname.split(",");
		System.out.println(Arrays.toString(color_str));
		
		System.out.println("tokencounts : " + st.countTokens());
		
		while(st.hasMoreElements()) { // true : 토큰이 있다. false : 토큰이 없다.
			System.out.println(st.nextElement());
			
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(st.nextElement());
		}

	}

}
