package t3_constructor;

public class Test5VO { //VO 필드는 private 를 붙여 접근을 못하게 해야한다.
	private String name;
	private String mid;
	private String password;
	private int age;
	private boolean gender;
	private String address;
	
	// getter setter의 활용
	// 값을 가져오거나 저장하는 게 가장 주된 활용
	// 가져오거나 저장할 때 유효성 검사도 해준다
	// 유효성검사: 예를 들어 음수값을 넣지 못하게 한다거나 미성년자는 가입할 수 없게 한다든가
	
	public Test5VO() {
		
	} // 기본 생성자 생성 단축키 ctrl+space+enter
	
	public Test5VO(String name, String mid, String password, int age, boolean gender, String address) {
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	} // 생성자 생성 단축키 alt, s, a, alt+a, alt+g
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
