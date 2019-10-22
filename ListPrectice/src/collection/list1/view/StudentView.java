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
			System.out.println("6. add(�߰��� �߰��ϱ�)");
			System.out.println("7. remove");
			System.out.println("8. indexOf");
			System.out.println("9. �̸� ��������");
			System.out.println("10. �̸� ��������");
			System.out.println("99. exit");
			
			System.out.print("���� >>");
			choice = sc.nextInt();
			
			System.out.println();
			
			switch(choice) {
			case 1 :
				break;
			case 2 :
				//add()�޼ҵ带 �߰��ؼ�����Ʈ�� ����
				//4�� Student ��ü ����
				
//			���� �ڵ��
//			Student std = new Student("ȫ�浿",14);
//			stdContrl.add(std); �� ����
				
				stdContrl.add(new Student("ȫ�浿",14));
				stdContrl.add(new Student("�Ӳ���",15));
				stdContrl.add(new Student("����Ż",16));
				stdContrl.add(new Student("������",17));
				break;
			case 3 :
				System.out.println("���� ArrayList�� ũ�� : " + stdContrl.size());
				break;
			case 4 :
				//���ϴ� �ε��� �� ��ȸ�ؼ� ���
				System.out.println("��ȸ�Ϸ��� �ε����� �� >> ");
				System.out.println("�ش� �ε��� �� : " + (stdContrl.get(sc.nextInt()).toString()));
				break;
			case 5 :
				//size(), get() �̿� , ArrayList ��ü���
				ArrayList<Student> stdList = stdContrl.printList();
				
				//1��
				for(int i=0; i< stdList.size(); i++) {
					System.out.println(stdList.get(i).toString());
				}
				//�� �� �ϳ� ���
				//2��
//				for(Student stdOne : stdList) {
//					System.out.println(stdOne.toString());
//				}
				break;
			case 6 :
				//add�޼ҵ� �̿�, ArrayList �߰��� �߰��ϱ�
				stdContrl.add(2, new Student("������", 20));
				break;
			case 7 :
				//���ϴ� �ε��� �� ����
				System.out.print("�����Ϸ��� �ε����� �� >> ");
				System.out.println("�ش� �ε��� �� : " + stdContrl.remove(sc.nextInt()));
				break;
			case 8 :
				//�ش� �� �˻��ϱ�
				int index = stdContrl.indexOf(new Student("������",17));
				if(index == -1) {
					System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println(index + "�� �ε����� ����!");
				}
				break;
			case 9 :
				//Collections.sort()�̿��Ͽ� ����
				stdContrl.sortName();
				break;
			case 10 :
				// ���� �������� ����
				break;
			case 99 :
				System.out.println("�����մϴ�."); 
				break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
		
	}

}
