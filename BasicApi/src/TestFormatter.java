import java.util.Formatter;

public class TestFormatter {
	
	public static void main(String[]args) {
		
		Formatter ft = new Formatter(System.out);
		
		ft.format("%s,%d,%d \n","String", 10,20);
		
		System.out.printf("%s, %d, %d \n", "String", 10,20);
	}

}
