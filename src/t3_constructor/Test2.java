package t3_constructor;

public class Test2 {
	// 기본생성자(내용이 없음)
	Test2() {}
	// 사용자가 하나라도 생성자를 정의하면 기본생성자 생성 X
	
	Test2(int su1) {} // 오버로딩
	
	Test2(int su1, int su2) {}
	
	Test2(int su1, double su2) {}
	
	Test2(double su2, int su1) {}
	
	// 타입 개수 순서가 모두 다르므로 모두 사용가능
	
	// 변수명은 관계가 없다
	// Test2(int atom1, int atom2){} 는 10번라인에 이미 int, int가 있으므로 사용X
}
