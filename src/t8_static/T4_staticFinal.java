package t8_static;

public class T4_staticFinal {
	static final String NATION = "Korea";
	final String jumin;
	String name;
	
	T4_staticFinal(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return NATION;
	}
}
