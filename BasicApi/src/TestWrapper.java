
public class TestWrapper {
	
	public static void main(String[] args) { //main +��Ʈ��+�����̽��� , ���θ޼ҵ� �ڵ��ϼ�
		
		int i = 5; //�⺻�ڷ���
		
		Integer i2=new Integer(5); //Wrapper Ŭ����
		
		Integer i3 = 5; //���� �ڽ�(Auto-boxing) ���� ���� �̷������� �����ϰ� �ᵵ �ȴ�
		
	    int i4 = i3.intValue(); //�⺻�ڷ������� �ٲ��ִ� ��
	    
	    int i5 = i3; //���� ��ڽ�(Auto-unboxing) ���� ���� �̷������� �����ϰ� �ᵵ �ȴ�
	    
	    
	    
	    String str = "1"; //��ǻ�ʹ� 1�� ���ڿ��� �ν������� ����1�� �� �� �ְ� �ϴ¹���� �ִ�
	    
	    byte b=Byte.parseByte(str); //���ڿ��� ���ڷ� �ٲ��� �� �ִ�
	    short s=Short.parseShort(str); //str�κп� "2"�� �־ �ȴ�
	    int iVal=Integer.parseInt("3");
	    long l=Long.parseLong("4");
	    float f=Float.parseFloat("0.1");
	    double d=Double.parseDouble("0.2");
	    boolean bool=Boolean.parseBoolean("true");
	    
	    
	    //1(����) -> byte(����) �̷� ������ �ٲٰ� ���� ��쵵 �ִ�
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
