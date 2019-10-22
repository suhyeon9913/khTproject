package collection.list1.controller;

import java.util.ArrayList;
import java.util.Collections;

import collection.list1.model.compare.DescScore;
import collection.list1.model.vo.Student;

public class StudentController {
	
	//�޼ҵ��
	
	//add-ArrayList�� �߰�
	
	//size-ArrayList ũ�ⱸ�ϱ�
	
	//get-ArrayList���� �ε��� �� ��������
	
	//printList-ArrayList ��ü���
	
	//add -�߰��� �� �߰��ϱ�
	
	//remove-���ϴ� �ε��� �� ����
	
	//indexOf-�ش� �� �˻��ϱ�
	
	//sortName-�̸� �������� ����
	
	//sortScore-�̸� �������� ����
	
	ArrayList<Student> stdList;
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	
	//add-ArrayList�� �߰�
	public boolean add(Student studentOne) {
		stdList.add(studentOne);
		return true;
	}
	
	//size-ArrayList ũ�ⱸ�ϱ�
	public int size() {
		return stdList.size();
	}
	
	//get-ArrayList���� �ε��� �� ��������
	public Student get(int index) {
		
		//get�޼ҵ带 �̿��ؼ� Student��ü�� ������
		return stdList.get(index);
	}
	
	//printList-ArrayList ��ü���
	
	public ArrayList<Student> printList(){
		return stdList;
	}
	
	//add -�߰��� �� �߰��ϱ�
	public void add(int index, Student stdOne) {
		stdList.add(index,stdOne);
	}
	
	//remove-���ϴ� �ε��� �� ����
	public Student remove(int index) {
		return stdList.remove(index);
	}
	
	//indexOf-�ش� �� �˻��ϱ�
	public int indexOf(Student stdOne) {
		return stdList.indexOf(stdOne);
	}
		
	//sortName-�̸� �������� ����
	public void sortName() {
		Collections.sort(stdList);
	}
		
	//sortScore-�̸� �������� ����
	public void sortScore() {
		Collections.sort(stdList, new DescScore());
	}
}


