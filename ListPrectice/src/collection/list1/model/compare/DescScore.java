package collection.list1.model.compare;

import java.util.Comparator;

import collection.list1.model.vo.Student;

public class DescScore implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// ���ڰ� �ƴ� �ٸ� ���� ���� ���� return 01.compareTo(o2);
		// return o1.getScore() - o2.getScore(); �� ��������
		return o2.getScore() - o1.getScore(); // ��������
		//return (o2.getScore() - o1.getScore()) * -1; �� ��������
	}

}
