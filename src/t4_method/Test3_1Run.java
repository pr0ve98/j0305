package t4_method;

public class Test3_1Run {
	public static void main(String[] args) {
		
		// 배열은 동질성의 자료를 넘길 때 사용하는 게 좋음
		int[] su = {90,80,100,70,60};
		
		Test3_1 t3 = new Test3_1();
		
		int res = t3.hap(su);
		System.out.println("총합 : "+ res);
		System.out.println();
		
		res = t3.sum(su);
		System.out.println("총합2 : "+ res);
		
		res = t3.hap(new int[] {1,2,3,4,5});
		System.out.println("총합3 : "+ res);
		
		res = t3.sum(new int[] {1,2,3,4,5});
		System.out.println("총합4 : "+ res);
		
		//res = t3.hap({1,2,3,4,5}); // 안됨
		//res = t3.hap(1,2,3,4,5); // 안됨 
		res = t3.sum(1,2,3,4,5); // 됨 
		System.out.println("총합5 : "+ res);
	}

	// static으로 올라오면 메소드영역에 올라간다
	// 자주 쓰는 것들을 메소드 영역에 올릴 때 사용
	// static 개체에서 메소드를 만들면 무조건 static을 붙인다
	
}
