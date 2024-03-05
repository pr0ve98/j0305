package t2_field;

public class Test_val {
	int su3 = 10; // 필드(완벽한 전역변수)
	public void atom() { // void는 메소드에만 쓸 수 있음
		int su1 = 100; // 전역변수
		
		for(int i=0; i<5; i++) { // 블럭 안에서 사용하는 변수를 지역변수라고 함
			int su2 = 200 * i;
			System.out.println(su1 + su2);
		}
		
		su3 += su1;
		System.out.println("su3:"+su3);
		// 안 찍히는 이유 메인 메소드가 없어서
	}
	
	
}
