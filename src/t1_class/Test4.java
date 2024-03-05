package t1_class;
// 같은 패키지 안에서는 같은 클래스 이름을 붙일 수 없다.

public class Test4 {
	public static void main(String[] args) {
		// new를 사용해 생성해서 Test1을 메모리 힙에 올린다
		Test1 t1 = new Test1(); 
		// 변수 t1을 만들면서 스택에 주소가 올라간다
		
		Test1 t2 = new Test1(); // 같은 설계도로 만들었을뿐, 다른 객체
		
		if(t1 == t2) { // 스택에 만들어진 값(주소) 비교
			System.out.println("t1객체와 t2객체는 같은 객체입니다.");
		}
		else {
		System.out.println("t1객체와 t2객체는 다른 객체입니다.");
		}
		
		Test1 t3;
		t3 = t1; // t1이 가진 주소값을 t3에게 줬다 (얕은 복사)
		if(t1 == t3) {
			System.out.println("t1객체와 t3객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t3객체는 다른 객체입니다.");
		}
		
		Test1 t4 = null;
		if(t1 == t4) { // t1 == null 이 아니므로 다른 객체
			System.out.println("t1객체와 t4객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t4객체는 다른 객체입니다.");
		}
		
		if(t4 == null) {
			System.out.println("t4는 null입니다.");
		}
		else {
			System.out.println("t4는 null이 아닙니다.");
		}
		// null을 비교할 때는 주소개념으로 비교해야 함( == /  != )
		// !!아래는 실행 오류 발생!!
		
//		if(t4.equals(null)) { 
//			System.out.println("t4는 null입니다.");
//		}
//		else {
//			System.out.println("t4는 null이 아닙니다.");
//		}
	}	
}
