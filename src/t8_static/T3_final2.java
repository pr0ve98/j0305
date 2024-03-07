package t8_static;

public class T3_final2 {
	final String nation = "Korea";
	final String jumin;
	String name;
	
	//public T3_final2() {}
	// final을 선언하면 생성자로 값을 줘야 하는데 값을 주지 않아 error
	
	T3_final2(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return nation;
	}
}
