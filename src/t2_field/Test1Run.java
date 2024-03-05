package t2_field;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println(t1.su1); // 필드는 초기값을 안 줘도 된다 참조타입임!
		System.out.println(t1.su2);
		System.out.println(t1.d1);
		System.out.println(t1.d2);
		System.out.println(t1.l1);
		System.out.println(t1.l2);
		System.out.println();
		
		Test2 t2 = new Test2();
		System.out.println("t2 : "+t2.name);
		
		Test2 t3 = new Test2();
		System.out.println("t3 : "+t3.name);
		t3.name = "김말숙";
		System.out.println("t3 : "+t3.name);
		// t2 와 t3 는 다른 객체임을 증명
	}
}
