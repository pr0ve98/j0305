package t10_Getter_Setter;

public class Test2VO {
	private String name;
	private String address;
	private int age;
	private boolean gender;
	
	// 추가로 만든 필드
	private String strGender;
	
	// getter setter에 조건을 넣는 것을 유효성검사
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address.equals("0")) this.address = "외국인";
		else this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 15 && age < 70) this.age = age;
		else System.out.println("나이의 범위를 벗어났습니다.");
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getStrGender() {
		return strGender;
	}
	public void setStrGender(String strGender) {
		this.strGender = strGender;
	}
	
	
}
