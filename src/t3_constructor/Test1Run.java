package t3_constructor;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("t1 : "+ t1); // toString()이 생략되어 있음
		// 출력하면 t1 :  t3_constructor.Test1@15db9742
		//                 패키지이름    클래스이름 메모리주소
		// 메모리 주소는 16진수
		System.out.println("t1 : "+ t1.toString());
		// 위와 아래는 출력이 같다
	}
}
