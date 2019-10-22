import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	
	public static void main(String[]args) {
		
		Date today = new Date();
		
		//System.out.println(today);
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //년-월-일 시:분:초
		
		String ftToday = ft.format(today);
		
		System.out.println(ftToday);
		
	}

}
