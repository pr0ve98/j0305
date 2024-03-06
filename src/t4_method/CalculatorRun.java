package t4_method;

import java.util.Scanner;

// 두수와 연산자를 입력하면 해당결과를 출력하는 프로그램
public class CalculatorRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 수를 입력하세요. ");
			int su1 = sc.nextInt();
			System.out.print("연산자를 입력하세요. ");
			String operator = sc.next();
			System.out.print("두번째 수를 입력하세요. ");
			int su2 = sc.nextInt();
			
			Calculator calc = new Calculator();
			calc.calc(su1, su2, operator);
			
			System.out.print("계속 하시겠습니까?(Y/N) "); // Yes
			String ans = sc.next();
			
			//1번방법 if(ans.charAt(0) == 'N' || ans.charAt(0) == 'n') break;
			// charAt(0) = 0번째 인덱스를 꺼내주세요
			// char 타입으로 반환이라 '' 사용
			//2번방법 if(ans.equals("N") || ans.equals("n")) break;
			//3번방법 if(ans.toUpperCase().equals("N")) break;
			// toUpperCase() = 전부 대문자로 바뀌는 메소드
			if(ans.toLowerCase().equals("n")) break;
			// toLowerCase() = 전부 소문자로 바뀌는 메소드
		}
		System.out.println("작업 끝!");
		
		sc.close();
	}
}
