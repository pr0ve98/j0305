package t3_constructor;

public class Test3 {
	// 기본생성자(내용이 없음)
	Test3() {} //#1
	// 사용자가 하나라도 생성자를 정의하면 기본생성자 생성 X
	
	int atom; // 필드
	int atom2;
	double atom3;
	
	Test3(int su1) { // 오버로딩 //#2
	System.out.println("su1 : "+su1);
	}
	// 여기서 출력하는 경우는 많지 않다
	
	Test3(int su1, int su2) { //#3
		atom = su1;
		atom2 = su2;
		// 직접 값을 주는 것은 틀리진 않지만 네트워크 상에서는 사용하면 안됨
	}
	
	Test3(int atom, double atom3) { //#4
		this.atom = atom; // 필드 atom = 매개변수 atom
		//atom = atom; 
		// 매개변수 atom = 매개변수 atom이 되어버림
		this.atom3 = atom3;
	}
	
	Test3(double su2, int su1) {}
	
	// 타입 개수 순서가 모두 다르므로 모두 사용가능
	
	// 변수명은 관계가 없다
	// Test2(int atom1, int atom2){} 는 10번라인에 이미 int, int가 있으므로 사용X
}
