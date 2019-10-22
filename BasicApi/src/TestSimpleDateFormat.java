import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	
	public static void main(String[]args) {
		
		Date today = new Date();
		
		//System.out.println(today);
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //��-��-�� ��:��:��
		
		String ftToday = ft.format(today);
		
		System.out.println(ftToday);
		
	}

}
