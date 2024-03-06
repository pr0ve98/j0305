package t4_method;

import java.util.Scanner;

public class Test2_1Run {
	public static void main(String[] args) {
		Test2_1 t2 = new Test2_1();
		int res;
		
		t2.mod1();
		//t2.mod2(50); // 작업은 했지만 출력을 하지 않아서 눈에 보이는 결과는 X
		res = t2.mod2(50);
		System.out.println("res : "+res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요. ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요. ");
		int su2 = sc.nextInt();
		
		res = t2.add(su1, su2);
		System.out.println(su1+"+"+su2+" : "+res);
		
		// 뺄셈
		res = t2.sub(su1, su2);
		System.out.println(su1+"-"+su2+" :"+res);
		
		// 곱셈
		res = t2.mul(su1, su2);
		System.out.println(su1+"*"+su2+" :"+res);
		
		// 나눗셈
		double res2 = t2.div(su1, su2);
		System.out.printf("%d / %d = %.1f",su1,su2,res2);
		
		
		sc.close();
	}
}
