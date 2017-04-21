package javaTutorial;

public class CarClass {
	private String make;
	int speed;
	int gear;
	
	public CarClass(){
		//intialize default values to variables
		this(20,4); // no effect since speed and gear are set after this call
		this.speed = 0;
		this.gear = 0;
		System.out.println("Inside constructor");
	}
	
	public CarClass(int speed, int gear){
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with 2 arguments");
	}
	
	public void setMake(String carMake){
		//this keyword refers to the instance of this class(object)
		this.make = carMake;
	}
	
	public String getMake(){
		return this.make;
	}

}
