package t4_method;

public class Test3_1 {

	public int hap(int[] su) {
		int hap = 0;
		for(int i=0; i<su.length; i++) {
			hap += su[i];
		}
		return hap;
	}

	public int sum(int ... su) { // 여러개의 값이 넘어갈 때 연산자 <...>
		// <...> 연산자는 크기를 안 줘도 된다
		int sum = 0;
		for(int i=0; i<su.length; i++) {
			sum += su[i];
		}
		return sum;
	}

}
