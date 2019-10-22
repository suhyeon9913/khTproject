
public class TestWrapper {
	
	public static void main(String[] args) { //main +컨트롤+스페이스바 , 메인메소드 자동완성
		
		int i = 5; //기본자료형
		
		Integer i2=new Integer(5); //Wrapper 클래스
		
		Integer i3 = 5; //오토 박싱(Auto-boxing) 위의 식을 이런식으로 간단하게 써도 된다
		
	    int i4 = i3.intValue(); //기본자료형으로 바꿔주는 식
	    
	    int i5 = i3; //오토 언박싱(Auto-unboxing) 위의 식을 이런식으로 간단하게 써도 된다
	    
	    
	    
	    String str = "1"; //컴퓨터는 1을 문자열로 인식하지만 숫자1로 쓸 수 있게 하는방법이 있다
	    
	    byte b=Byte.parseByte(str); //문자열을 숫자로 바꿔줄 수 있다
	    short s=Short.parseShort(str); //str부분에 "2"를 넣어도 된다
	    int iVal=Integer.parseInt("3");
	    long l=Long.parseLong("4");
	    float f=Float.parseFloat("0.1");
	    double d=Double.parseDouble("0.2");
	    boolean bool=Boolean.parseBoolean("true");
	    
	    
	    //1(숫자) -> byte(문자) 이런 식으로 바꾸고 싶은 경우도 있다
	    String bByte=Byte.valueOf((byte)1).toString();
	    String sShort=Short.valueOf((short)2).toString();
	    String iInteger=Integer.valueOf(3).toString();
	    String lLong=Long.valueOf(4L).toString();
	    String fFloat=Float.valueOf(0.1f).toString();
	    String dDouble=Double.valueOf(0.2).toString();
	    String bBool=Boolean.valueOf(true).toString();
	    String cChar=Character.valueOf('a').toString();
	    
	    //1234 + " " , String.valueOf(1234)
	    
	    
		
	}

}
