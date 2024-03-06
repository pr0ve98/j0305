package t5_application;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 절차식 예
		int no;
		String name;
		int age;
		boolean gender;
		String job;
		int choice;
		
		System.out.print("번호를 입력하세요. ");
		no = sc.nextInt();
		System.out.print("성명을 입력하세요. ");
		name = sc.next();
		System.out.print("나이를 입력하세요. ");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요.(1:남자, 2:여자) ");
		choice = sc.nextInt();
		if(choice == 1) gender = true;
		else gender = false;
		// 받은 숫자로 남자인지 여자인지 판별
		
		System.out.print("직업을 입력하세요. ");
		job = sc.next();
		
		StudentService service = new StudentService(); 
		service.print(no, name, age, gender, job);
		// 1. print 메소드에게 값을 받아 넘김
		
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}
}
