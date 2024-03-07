package t6_exam;

public class Test_format {
	public static void main(String[] args) {
		int su = 1234000;
		double su2 = 1234000.123;
		String su3 = "1234000"; // 문자 형식의 숫자
		System.out.printf("금액 : %,d\n", su); //출력하면 1,234,000
		System.out.printf("금액 : %,10d\n", su);
		System.out.printf("금액 : %,15.2f\n", su2);
		System.out.println(String.format("%,15d", su));
		System.out.println(String.format("%,15d", Integer.parseInt(su3))); // 래퍼클래스 이용방법, 현재 예시: 문자 형식의 숫자를 숫자로 형변환
	}
}
