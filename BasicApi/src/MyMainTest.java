
public class MyMainTest {
	
	public static void main(String[]args) { 
		//public (공개되어있고) static (시작하자마자 메모리에 할당되어있다) void(반환형이 없다) string(매개변수가 string의 배열이다)
		
		if(args.length>0) {
			for(int i=0; i<args.length; i++) {
				System.out.println(args[i]);
			}
		}else {
			System.out.println("1개 이상의 매개변수를 입력하세요");
			return;
		}
		
	}

}
