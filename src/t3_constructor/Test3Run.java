package t3_constructor;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t3_1 = new Test3();
		// 생성자가 많으면 이름 쓴 후 ctrl+space 선택
		Test3 t3_2 = new Test3(100);
		
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		
		t3_1.atom = 500;
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		
		t3_2.atom = 600;
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		System.out.println();
		
		Test3 t3_3 = new Test3(10, 20); // 가장 많이 쓰는 방법
		System.out.println("t3_3.atom : " +t3_3.atom);
		System.out.println("t3_3.atom : " +t3_3.atom2);
		
		t3_3.atom = -100;
		t3_3.atom2 = -200;
		System.out.println("t3_3.atom : " +t3_3.atom);
		System.out.println("t3_3.atom : " +t3_3.atom2);
		// 직접 값을 주는 것은 틀리진 않지만 네트워크 상에서는 사용하면 안됨
		
		Test3 t3_4 = new Test3(70, 3.14);
		System.out.println("t3_4.atom : " +t3_4.atom);
		System.out.println("t3_4.atom : " +t3_4.atom3);
		
	}
}
