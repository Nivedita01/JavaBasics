package javaTutorial;

public class ConstructorDemo {
	public static void main(String[] args) {
		CarClass c1 = new CarClass();
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		CarClass c2 = new CarClass(50,2);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}

}
