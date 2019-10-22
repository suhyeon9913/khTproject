
public class TestStringBuffer {
	
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer();
		
		
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		//문자열이 점점 추가되면서 공간이 늘어남
		
		String str = sb.toString(); //sb는 StringBuffer이지만  toString을 이용해 string으로 바꿔주는것
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");  // 현재 sb.append("hello");는 StringBuffer 상태이다
		
		if(sb2 == sb3) {
			System.out.println("똑같다.");
		} //메소드를 계속 엮어나간다고 해서 메소드체인이라 한다
		
		String strBuff = new StringBuffer().append("Hello").append(" ").append("KH").toString(); 
		//.append("문자열")라는 메소드가 적용된 StringBuffer객체이다,여기서 마지막에 toString으로 반환형을 String으로 바꿔준다
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
