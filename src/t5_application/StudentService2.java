package t5_application;

public class StudentService2 {
	
	void print(int no, String name, int age, boolean gender, String job) {
		String genderOK = genderCheck(gender);
		
		String ageOK;
		if(ageCheck(age)) ageOK = "성인";
		else ageOK = "미성년";
		
		System.out.println("번호:"+no+", 성명:"+name+", 나이:"+age+", 성별:"+genderOK+", 직업:"+job+", 비고:"+ageOK);
	}
	
	String genderCheck(boolean gender) {
		String res = "";
		if(gender) res = "남자"; // = gender == true
		//if(!gender) = gender == false
		else res = "여자";
		return res;
	}
	
	boolean ageCheck(int age) {
		if(age >= 20) return true;
		else return false;
	}

	public void print(StudentVO vo) {
		String genderOK = genderCheck(vo.isGender());
		
		String ageOK;
		if(ageCheck(vo.getAge())) ageOK = "성인";
		else ageOK = "미성년";
		
		System.out.println("번호:"+vo.getNo()+", 성명:"+vo.getName()+", 나이:"+vo.getAge()+", 성별:"+genderOK+", 직업:"+vo.getJob()+", 비고:"+ageOK);
	}
	
}
