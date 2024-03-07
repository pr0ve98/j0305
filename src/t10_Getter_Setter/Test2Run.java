package t10_Getter_Setter;

import java.util.Scanner;

/*
 * '성명/나이/지역/성별'을 입력받아서 정보를 '저장/출력' 하고자 한다.
 * 나이는 15세 이상 70세 미만인 사람만 가입할 수 있고,
 * 주소 입력시 '외국인'은 0으로 입력된다.
 * 성별은 남자는 '1,3' '여자는 '2,4'로 입력처리후, 저장은 '남자/여자'로 저장한다.
 */
public class Test2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2VO vo = new Test2VO();
		
		System.out.print("성명을 입력하세요> ");
		vo.setName(sc.next());
		System.out.print("나이를 입력하세요> ");
		vo.setAge(sc.nextInt());
		System.out.print("주소를 입력하세요(외국인은 0)> ");
		vo.setAddress(sc.next());
		
		Test2Service service = new Test2Service();
		System.out.print("성별을 입력하세요.(남자는 1,3 여자는 2,4)> ");
		int sex = sc.nextInt();
		
		// 남자인지 여자인지 서비스객체에서 받아온 후 다시 vo에 넣기
		vo.setStrGender(service.setGenderCheck(sex));
		
		System.out.println("==>> 등록된 신상정보입니다.");
		System.out.println("성명 : " +vo.getName());
		System.out.println("나이 : " +vo.getAge());
		System.out.println("주소 : " +vo.getAddress());
		System.out.println("주소 : " +vo.getStrGender());
		
		
		sc.close();
	}
}
