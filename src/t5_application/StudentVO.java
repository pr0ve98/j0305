package t5_application;

// VO 객체 (Value Object) 
// DTO 객체 (Data Transfer Object) 
// 두 객체를 들고 왔다갔다 할 수 있음

// 인터넷에 VO와 DTO의 차이점을 보고 이해한 점 카페에 적어보기

public class StudentVO {
	private int no;
	String name;
	int age;
	boolean gender;
	String job;
	
	// 저장만 하는 거면 리턴이 없음(set, 자바 용어: setter)
	// 읽어올 거면 리턴이 있어야 함(get, 자바 용어: getter)
	// 규칙(set+앞글자 대문자 변수)
	// boolean 타입인 경우는 get (x) is (o)
	// getter setter 단축키
	// alt, s, r, alt+A, alt+r
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	
	
}
