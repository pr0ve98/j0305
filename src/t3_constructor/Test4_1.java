package t3_constructor;

public class Test4_1 {
	
	String model;
	String color = "블랙";
	int speed;
	
	Test4_1(String model) {
		this.model = model;
		this.color = "화이트";
		this.speed = 250;
	}
	Test4_1(String model, String color) {
		this.model = model;
		this.color = color;
		this.speed = 250;
	}
	Test4_1(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
