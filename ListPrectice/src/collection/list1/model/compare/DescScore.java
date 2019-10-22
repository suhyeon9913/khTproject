package collection.list1.model.compare;

import java.util.Comparator;

import collection.list1.model.vo.Student;

public class DescScore implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// 숫자가 아닌 다른 값을 비교할 때는 return 01.compareTo(o2);
		// return o1.getScore() - o2.getScore(); 는 오름차순
		return o2.getScore() - o1.getScore(); // 내림차순
		//return (o2.getScore() - o1.getScore()) * -1; 은 오름차순
	}

}
