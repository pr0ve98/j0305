package t4_method;

public class Test1 {
	int su1;
	double su2;
	String name = "홍길동";
	
	public Test1() {} 
	// 기본생성자를 안 만들었을 때는 ctrl+space 누르면 제일 첫번째에 나옴
	
	Test1(int su1){
		this.su1 = su1;
	}
	
	// 클래스 > 생성자 > 메소드
	// 메소드는 클래스명과 같은 이름을 사용할 수 없음
	// 메소드도 오버로딩을 사용할 수 있다(매개변수의 타입, 개수, 순서)
	void mod1() {
	}
	
	void mod1(int su1) {
		this.su1=su1;
	}
	
	void mod1(int su1, double su2) { 
		// 받는 타입이 작으면 에러
		this.su1=su1;
		this.su2=su2;
	}
	
	void mod2() {
		System.out.println("안녕하세요...");
	}
	
	void mod3() {
		//System.out.println(this.name + "님 안녕하세요...");
		System.out.println(name + "님 안녕하세요...");
		// this를 붙이지 않았어도 매개변수에서 언급하지 않으면 필드를 사용
		// 필드에 값이 없으면 null, 0, 0.0
	}
	void mod3(String name) {
		System.out.println(name + "님 안녕하세요...");
	}
	void mod4(String name) {
		System.out.println(this.name + "님 안녕하세요...");
		System.out.println(name + "님 안녕하세요...");
	}
	void mod5(int i) {
		System.out.println(i + "안녕하세요...");
	}
	
	// 3의 배수가 되면 메소드 종료처리하세요.
	void mod6() {
		int i = 0;
		while(i<5) {
			i++;
			System.out.println(i + "안녕하세요...");
			if(i % 3 == 0) break;
			// 작업끝~~~~까지 출력
			//if(i % 3 == 0) return;
			// 작업끝~~~~ 출력 X , return 은 바로 탈출
			System.out.println("작업중...");	
		}
		System.out.println("작업끝~~~~");
	}
}
