import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	
	public static void main(String[]args) {
	
		
		//Calendar today = Calendat.getInstance();
		//�����ڰ� protected, new�� ���� ����
		
		GregorianCalendar today = new GregorianCalendar();
		
		//Calendar�� �ļ�Ŭ����
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "����":"����";
		System.out.printf("%d�� %d�� %d�� %s %d�� %d�� %d��",year,month,day,ampm,hour,min,sec);
		
		
	}

}
