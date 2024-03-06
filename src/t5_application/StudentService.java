package t5_application;

public class StudentService {
	
	void print(int no, String name, int age, boolean gender, String job) {
		// 2. print 메소드: Run에서 받아온 값을 저장
		String genderOK = genderCheck(gender);
		// 3. print 메소드에서 판별된 성별을 가져옴
		// 5. genderOK 변수에 res로 반환된 값을 넣음
		
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
		// 4. gender 값에 남자 or 여자를 res 값에 넣음, res 값을 반환
	}
	
	boolean ageCheck(int age) {
		if(age >= 20) return true;
		else return false;
	}
	
}
