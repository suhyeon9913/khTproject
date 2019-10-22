package collection.list1.controller;

import java.util.ArrayList;
import java.util.Collections;

import collection.list1.model.compare.DescScore;
import collection.list1.model.vo.Student;

public class StudentController {
	
	//메소드명
	
	//add-ArrayList에 추가
	
	//size-ArrayList 크기구하기
	
	//get-ArrayList에서 인덱스 값 가져오기
	
	//printList-ArrayList 전체출력
	
	//add -중간에 값 추가하기
	
	//remove-원하는 인덱스 값 제거
	
	//indexOf-해당 값 검색하기
	
	//sortName-이름 오름차순 정렬
	
	//sortScore-이름 내림차순 정렬
	
	ArrayList<Student> stdList;
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	
	//add-ArrayList에 추가
	public boolean add(Student studentOne) {
		stdList.add(studentOne);
		return true;
	}
	
	//size-ArrayList 크기구하기
	public int size() {
		return stdList.size();
	}
	
	//get-ArrayList에서 인덱스 값 가져오기
	public Student get(int index) {
		
		//get메소드를 이용해서 Student객체를 가져옴
		return stdList.get(index);
	}
	
	//printList-ArrayList 전체출력
	
	public ArrayList<Student> printList(){
		return stdList;
	}
	
	//add -중간에 값 추가하기
	public void add(int index, Student stdOne) {
		stdList.add(index,stdOne);
	}
	
	//remove-원하는 인덱스 값 제거
	public Student remove(int index) {
		return stdList.remove(index);
	}
	
	//indexOf-해당 값 검색하기
	public int indexOf(Student stdOne) {
		return stdList.indexOf(stdOne);
	}
		
	//sortName-이름 오름차순 정렬
	public void sortName() {
		Collections.sort(stdList);
	}
		
	//sortScore-이름 내림차순 정렬
	public void sortScore() {
		Collections.sort(stdList, new DescScore());
	}
}


