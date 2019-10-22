package collection.list1.model.vo;

public class Student implements Comparable<Student> { //Student 기준으로 정렬(Comparable)
	
	private String name;
	private int score;
	
	public Student() { //기본생성자
	}
	
	//생성자는 필드의 멤버변수 초기화
	//매개변수 있는 생성자
	public Student(String name, int score) { //string,int 라는 값을 받아서 멤버변수(name, score)에 넣어주는것
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "name : " + name +", score : " + score;
	}
	
	@Override
	public boolean equals(Object obj) {
		//객체가 가지고 있는 필드값이 동일한 경우 같은 객체라 판단
		
		//obj는 Object 타입, Student로 형변환
		Student other = (Student)obj;
		
		if(name.equals(other.getName()) && score == other.getScore()) {
			return true;
		}
		return false;
		
	}

	//양수가 리턴되는 경우 넘어온 객체가 앞, 음수가 리턴되는 경우 넘어온 객체가 뒤, 0이 리턴되면 동일한 값으로 순서 유지
	@Override
	public int compareTo(Student otherStd) {
		// TODO Auto-generated method stub
		return name.compareTo(otherStd.getName()); //기존에 저장된 name 과 넘어온 otherStd를 계속 비교함
	}
}
