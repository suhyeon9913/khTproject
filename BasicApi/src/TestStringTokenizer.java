import java.util.StringTokenizer;

public class TestStringTokenizer {
	
	public static void main(String[]args) {
		
		String str = "AA,BB,CC";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
	} //첫번째 토큰 값 체크 이후 있으면 true, 두번째 토큰 값 체크 이후 있으면 true, 세번째 토큰, 네번째 토큰 ..... true면 출력, 값이 없으면 while문 나옴
		
		
	//StringTokenizer와 유사, split
	//여러가지의 큰 데이터를 전송할때 규칙적인 패턴이 있는 경우 패턴대로 문자열을 자르고 가져다 쓸 수 있는 경우 사용한다
	String [] testStr = str.split(","); //,를 기준으로 문자열을 자르고 배열에 저장한다는 의미	
	
	for(int i=0; i<testStr.length; i++) { //각 배열에 있는 값을 출력
		System.out.println(testStr[i]);
	}
		
	}

}
