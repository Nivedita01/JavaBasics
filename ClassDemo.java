package javaTutorial;

public class ClassDemo {

	public static void main(String[] args) {
		for(int i=0; i<args.length;i++)
			System.out.println("Arguments in the string are ::"+args[i]);
		
		System.out.println("*********************************");
		
		Car c1 = new Car();
		c1.model = "Corolla";
		c1.year = 2016;
		
		System.out.println("Model is :"+c1.model);
		System.out.println("Year is :"+c1.getYear());
	}

}

class Car{
	
	int year = 2010;
	String model;
	
	public int getYear(){
		return this.year;
	}
	}
}
