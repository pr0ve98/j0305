package t6_exam;

public class Test1Service_급여계산 {

	void print(Test1_급여계산VO vo) {
		if(vo.code.toLowerCase().equals("b")) {
			vo.code = "부장";
			vo.bonbong = 5000000;
		}
		else if(vo.code.toLowerCase().equals("k")) {
			vo.code = "과장";
			vo.bonbong = 4000000;
		}
		else if(vo.code.toLowerCase().equals("d")) {
			vo.code = "대리";
			vo.bonbong = 3000000;
		}
		else if(vo.code.toLowerCase().equals("s")) {
			vo.code = "사원";
			vo.bonbong = 2000000;
		}
		else {
			vo.code = "비사원";
			vo.bonbong = 0;
		}
		
		vo.sudang = vo.sudang * 25000;
		vo.gongje = (int) ((vo.bonbong + vo.sudang) * 0.1);
		vo.netpay = vo.bonbong + vo.sudang - vo.gongje;
		
		System.out.println(vo.no+"번 "+vo.name+"님의 직급은 "+vo.code+"이며, 실수령액은 "+vo.netpay+"입니다.");
		System.out.println();
	}
}
