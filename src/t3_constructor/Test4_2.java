package t3_constructor;

public class Test4_2 {
	
	String model;
	String color = "블랙";
	int speed;
	
	Test4_2(String model) {
		this(model, "흰색", 250);
	}
	Test4_2(String model, String color) {
		this(model, color, 250);
		// this()는 현재 클래스의 생성자
		// string string int를 가진 생성자를 찾는 것
	}
	Test4_2(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
