import java.util.StringTokenizer;

public class TestStringTokenizer {
	
	public static void main(String[]args) {
		
		String str = "AA,BB,CC";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
	} //ù��° ��ū �� üũ ���� ������ true, �ι�° ��ū �� üũ ���� ������ true, ����° ��ū, �׹�° ��ū ..... true�� ���, ���� ������ while�� ����
		
		
	//StringTokenizer�� ����, split
	//���������� ū �����͸� �����Ҷ� ��Ģ���� ������ �ִ� ��� ���ϴ�� ���ڿ��� �ڸ��� ������ �� �� �ִ� ��� ����Ѵ�
	String [] testStr = str.split(","); //,�� �������� ���ڿ��� �ڸ��� �迭�� �����Ѵٴ� �ǹ�	
	
	for(int i=0; i<testStr.length; i++) { //�� �迭�� �ִ� ���� ���
		System.out.println(testStr[i]);
	}
		
	}

}
