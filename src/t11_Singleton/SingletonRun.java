package t11_Singleton;

public class SingletonRun {
	public static void main(String[] args) {
		// new Singleton(); 생성 안 됨
		
		Singleton.getInstance();
	}
}
