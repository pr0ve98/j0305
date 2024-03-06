package t6_exam;

import java.util.Scanner;

/*
 	사원코드(no), 사원명(name), 직급코드(code)와 초과시간(overTime)을 입력받아서 실수령액(netpay)을 계산하시오.
	직급코드: 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s
	1시간당 초과수당(sndang)은 25000원이다.
	공제액(gongje)은 (본봉(bonbong)+수당)의 10%로 한다.
	본봉: 부장-5000000, 과장-4000000, 대리-3000000, 사원-2000000
	실수령액 = 본봉 + 수당 - 공제액
	계산부는 비즈니스 로직으로 처리(서비스객체 사용)
 */


public class Test1Run_급여계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test1_급여계산VO vo = new Test1_급여계산VO();
		
		while(true) {
			System.out.print("직급코드를 입력하세요. (부장-B, 과장-K, 대리-D, 사원-S): ");
			vo.setCode(sc.next());
			System.out.print("초과근무 시간을 입력하세요. ");
			vo.setSudang(sc.nextInt());
			sc.close();
		}
		
	}
}
