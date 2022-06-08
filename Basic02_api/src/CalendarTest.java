import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//Calendar Ŭ������ new�� ��ü ������ �� �� ����.
		//getInstance() method�� �̿��Ͽ� ��ü�� ���Ѵ�.
		
		Calendar now = Calendar.getInstance();
		
		//Calendar ��ü���� ��¥ �Ǵ� �ð������� ������
		
		// ��¥ �����ϱ�
		//now.set(Calendar.YEAR, 2021);
		//now.set(Calendar.MONTH, 7);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 0->1��, 1->2��, 2->3��... �̷���
		int day = now.get(Calendar.DAY_OF_MONTH);
		int day_of_week = now.get(Calendar.DAY_OF_WEEK); // 1-��, 2-��, 3-ȭ...
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int test = now.get(Calendar.OCTOBER);
		
		System.out.printf("%d\n", test);
		System.out.printf("%d-%d-%d(%d) %d-%d-%d\n", year, month, day, day_of_week, hour, minute, second);
		System.out.println(now);
	}
}
