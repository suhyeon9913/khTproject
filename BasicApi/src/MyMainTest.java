
public class MyMainTest {
	
	public static void main(String[]args) { 
		//public (�����Ǿ��ְ�) static (�������ڸ��� �޸𸮿� �Ҵ�Ǿ��ִ�) void(��ȯ���� ����) string(�Ű������� string�� �迭�̴�)
		
		if(args.length>0) {
			for(int i=0; i<args.length; i++) {
				System.out.println(args[i]);
			}
		}else {
			System.out.println("1�� �̻��� �Ű������� �Է��ϼ���");
			return;
		}
		
	}

}
