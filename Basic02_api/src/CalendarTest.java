import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//Calendar 클래스는 new로 객체 생성을 할 수 없다.
		//getInstance() method를 이용하여 객체를 구한다.
		
		Calendar now = Calendar.getInstance();
		
		//Calendar 객체에서 날짜 또는 시간정보를 얻어오기
		
		// 날짜 변경하기
		//now.set(Calendar.YEAR, 2021);
		//now.set(Calendar.MONTH, 7);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 0->1월, 1->2월, 2->3월... 이런식
		int day = now.get(Calendar.DAY_OF_MONTH);
		int day_of_week = now.get(Calendar.DAY_OF_WEEK); // 1-일, 2-월, 3-화...
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int test = now.get(Calendar.OCTOBER);
		
		System.out.printf("%d\n", test);
		System.out.printf("%d-%d-%d(%d) %d-%d-%d\n", year, month, day, day_of_week, hour, minute, second);
		System.out.println(now);
	}
}
