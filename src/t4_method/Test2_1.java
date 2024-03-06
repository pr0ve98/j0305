package t4_method;

public class Test2_1 {
	void mod1() {
		System.out.println("안녕");
	}
	
	int mod2(int su1) {
		//return 10; = 여기서 10, su1는 리턴값이고
		return su1; // 리턴타입과 리턴값의 타입만 같으면 에러나지 않음
	}
	
	int mod1(int su1) {
		return su1;
	}
	
//	void mod1(int su1) { // 리턴타입은 오버로딩과 관계 없음
//		return 10;
//	}
	int add(int su1, int su2) {
		return su1 + su2;
	}
	
	// 빼기 (sub)
	int sub(int su1, int su2) {
		return su1 - su2;
	}
	
	// 곱하기 (mul)
	int mul(int su1, int su2) {
		return su1 * su2;
	}
	
	// 나누기 (div)
	double div(int su1, int su2) {
		return (double)su1 / su2;
	}
}
