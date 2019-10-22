package collection.list1.model.vo;

public class Student implements Comparable<Student> { //Student �������� ����(Comparable)
	
	private String name;
	private int score;
	
	public Student() { //�⺻������
	}
	
	//�����ڴ� �ʵ��� ������� �ʱ�ȭ
	//�Ű����� �ִ� ������
	public Student(String name, int score) { //string,int ��� ���� �޾Ƽ� �������(name, score)�� �־��ִ°�
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
		//��ü�� ������ �ִ� �ʵ尪�� ������ ��� ���� ��ü�� �Ǵ�
		
		//obj�� Object Ÿ��, Student�� ����ȯ
		Student other = (Student)obj;
		
		if(name.equals(other.getName()) && score == other.getScore()) {
			return true;
		}
		return false;
		
	}

	//����� ���ϵǴ� ��� �Ѿ�� ��ü�� ��, ������ ���ϵǴ� ��� �Ѿ�� ��ü�� ��, 0�� ���ϵǸ� ������ ������ ���� ����
	@Override
	public int compareTo(Student otherStd) {
		// TODO Auto-generated method stub
		return name.compareTo(otherStd.getName()); //������ ����� name �� �Ѿ�� otherStd�� ��� ����
	}
}
