package t8_static;

public class T1 {
	// 인스턴스 필드
	//	double pi = 3.141592;
	
	// 정적 필드(메소드 영역에 올라감, 객체 생성 X)
	public static double pi = Math.PI;
	
	// 정적 메소드
	static double cicleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}
