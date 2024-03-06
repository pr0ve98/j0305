package t4_method;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1_1 = new Test1(); 
		//Test1에서 생성자를 안 만들었기 때문에 컴파일러가 기본생성자 생성
		System.out.println("t1_1.su1 : "+t1_1.su1);
		System.out.println("t1_1.su2 : "+t1_1.su2);
		System.out.println();
		
		Test1 t1_2 = new Test1(100);
		//사용자가 생성자를 만들면 기본생성자를 만들지 않음
		System.out.println("t1_1.su1 : "+t1_2.su1);
		System.out.println("t1_1.su2 : "+t1_2.su2);
		System.out.println();
		
		t1_2.mod1(500);
		t1_2.mod1(500, 600);
		System.out.println("t1_1.su1 : "+t1_2.su1);
		System.out.println("t1_1.su2 : "+t1_2.su2);
		System.out.println();
		
		t1_1.mod2(); // t1_1과 t1_2는
		t1_2.mod2(); // 생성자는 다르지만 같은 메소드를 사용할 수 있다
		t1_2.mod3();
		t1_2.mod3("김말숙");
		t1_2.mod4("이기자");
		System.out.println();
		
		for(int i=0; i<5; i++) {
			t1_2.mod2();
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			t1_2.mod5(i+1);
		}
		System.out.println();
		
		t1_2.mod6();
	}
}
