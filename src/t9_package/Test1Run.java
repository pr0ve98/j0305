package t9_package;

//import t4_method.Calculator; // 패키지명.클래스명
//import t4_method.Test2_1;
//import t4_method.Test3_1;

import t4_method.*; // 패키지명.* : 패키지 안에 있는 모든 걸 참조하겠다
// 가능하면 직접 적어주는 게 좋다

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		// getter setter를 쓰는 이유: 필드를 private로 지정해서
		System.out.println("1.번호 : "+t1.getNo());
		System.out.println("1.성명 : "+t1.getName());
		
		t1.setNo(10);
		t1.setName("홍길동");
		System.out.println("2.번호 : "+t1.getNo());
		System.out.println("2.성명 : "+t1.getName());
		
		// 다른 패키지 필드 불러오기
		System.out.println("t8_static.T1의 PI : "+t8_static.T1.pi);
		// 접근제한자 때문에 값을 불러올 수 없음
		// 접근제한자 private: 자기 클래스 안에서만 사용 가능
		// 접근제한자 public: 전부 허용
		// 접근제한자를 안 쓰면 default: 같은 패키지 안에서 사용 가능
		
		t7_instance.Test1 t7 = new t7_instance.Test1();
		// 패키지가 달라서 클래스 앞에 패키지 명도 붙여줘야 함
		// System.out.println("t7.instance.Test1의 PI : "+t7.instance.Test1.pi);
		// 인스턴스 필드여서 생성을 해줘야 함
		System.out.println("t7.instance.Test1의 PI : "+t7.pi);
		
		// 다른 패키지 임포트 하기
		new Calculator();
		new Test2_1();
		new Test3_1();
	}
}
