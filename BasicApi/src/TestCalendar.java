import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	
	public static void main(String[]args) {
	
		
		//Calendar today = Calendat.getInstance();
		//생성자가 protected, new로 생성 못함
		
		GregorianCalendar today = new GregorianCalendar();
		
		//Calendar의 후손클래스
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "오전":"오후";
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",year,month,day,ampm,hour,min,sec);
		
		
	}

}
