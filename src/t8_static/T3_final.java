package t8_static;

public class T3_final {
	final String nation = "Korea";
	String jumin;
	String name;
	
	public T3_final() {}
	
//	T3_final(String nation) {
//		this.nation = nation;
//	} error!
	
	T3_final(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return nation;
	}
}
