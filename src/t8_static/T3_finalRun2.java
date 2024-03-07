package t8_static;

public class T3_finalRun2 {
	public static void main(String[] args) {
		
		T3_final2 t3_2 = new T3_final2("1234-1234");
		System.out.println("t3_2.jumin : "+t3_2.jumin);
		System.out.println("1.name : "+t3_2.name);
		
//		t3_2.jumin = "2222-2222";
//		값을 한번 이미 줘서 바꿀 수 없다 기회 1번!
		t3_2.name = "홍길동";
		System.out.println("2.name : "+t3_2.name);
		t3_2.name = "홍길창";
		System.out.println("3.name : "+t3_2.name);
		
	}
}
