package collection.list1.view;

import java.util.ArrayList;
import java.util.Scanner;

import collection.list1.controller.StudentController;
import collection.list1.model.vo.Student;

public class StudentView {
	
	private Scanner sc;
	private StudentController stdContrl;
	
	public StudentView() {
		sc = new Scanner(System.in);
		stdContrl = new StudentController();
	}
	
	
	public void mainMenu() {
		
		int choice = 0;
		while(choice != 99) {
			
			System.out.println("==================");
			System.out.println("List Practice");
			System.out.println("1. arrayAdd()");
			System.out.println("2. add()");
			System.out.println("3. size()");
			System.out.println("4. get()");
			System.out.println("5. printList");
			System.out.println("6. add(중간에 추가하기)");
			System.out.println("7. remove");
			System.out.println("8. indexOf");
			System.out.println("9. 이름 오름차순");
			System.out.println("10. 이름 내림차순");
			System.out.println("99. exit");
			
			System.out.print("선택 >>");
			choice = sc.nextInt();
			
			System.out.println();
			
			switch(choice) {
			case 1 :
				break;
			case 2 :
				//add()메소드를 추가해서리스트에 저장
				//4개 Student 객체 저장
				
//			밑의 코드는
//			Student std = new Student("홍길동",14);
//			stdContrl.add(std); 와 같다
				
				stdContrl.add(new Student("홍길동",14));
				stdContrl.add(new Student("임꺽정",15));
				stdContrl.add(new Student("각시탈",16));
				stdContrl.add(new Student("강감찬",17));
				break;
			case 3 :
				System.out.println("현재 ArrayList의 크기 : " + stdContrl.size());
				break;
			case 4 :
				//원하는 인덱스 값 조회해서 출력
				System.out.println("조회하려는 인덱스의 값 >> ");
				System.out.println("해당 인덱스 값 : " + (stdContrl.get(sc.nextInt()).toString()));
				break;
			case 5 :
				//size(), get() 이용 , ArrayList 전체출력
				ArrayList<Student> stdList = stdContrl.printList();
				
				//1번
				for(int i=0; i< stdList.size(); i++) {
					System.out.println(stdList.get(i).toString());
				}
				//둘 중 하나 사용
				//2번
//				for(Student stdOne : stdList) {
//					System.out.println(stdOne.toString());
//				}
				break;
			case 6 :
				//add메소드 이용, ArrayList 중간에 추가하기
				stdContrl.add(2, new Student("김유신", 20));
				break;
			case 7 :
				//원하는 인덱스 값 제거
				System.out.print("삭제하려는 인덱스의 값 >> ");
				System.out.println("해당 인덱스 값 : " + stdContrl.remove(sc.nextInt()));
				break;
			case 8 :
				//해당 값 검색하기
				int index = stdContrl.indexOf(new Student("강감찬",17));
				if(index == -1) {
					System.out.println("해당하는 학생이 존재하지 않습니다.");
				} else {
					System.out.println(index + "번 인덱스에 존재!");
				}
				break;
			case 9 :
				//Collections.sort()이용하여 정렬
				stdContrl.sortName();
				break;
			case 10 :
				// 점수 내림차순 정렬
				break;
			case 99 :
				System.out.println("종료합니다."); 
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
	}

}
