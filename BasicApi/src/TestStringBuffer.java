
public class TestStringBuffer {
	
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer();
		
		
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		//���ڿ��� ���� �߰��Ǹ鼭 ������ �þ
		
		String str = sb.toString(); //sb�� StringBuffer������  toString�� �̿��� string���� �ٲ��ִ°�
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");  // ���� sb.append("hello");�� StringBuffer �����̴�
		
		if(sb2 == sb3) {
			System.out.println("�Ȱ���.");
		} //�޼ҵ带 ��� ������ٰ� �ؼ� �޼ҵ�ü���̶� �Ѵ�
		
		String strBuff = new StringBuffer().append("Hello").append(" ").append("KH").toString(); 
		//.append("���ڿ�")��� �޼ҵ尡 ����� StringBuffer��ü�̴�,���⼭ �������� toString���� ��ȯ���� String���� �ٲ��ش�
		System.out.println(strBuff);
		
		
		
		////////////////////////////////////////
		StringBuilder sbr = new StringBuilder();
		
		sbr.append("Hellloooo");
		sbr.append(" ");
		sbr.append("Woooorld");
		
		String sbrStr = sbr.toString();
		
//		System.out.println(sbr);
		System.out.println(sbrStr);
	}

}
