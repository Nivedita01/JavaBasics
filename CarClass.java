package javaTutorial;

public class CarClass {
	private String make;
	
	public void setMake(String carMake){
		//this keyword refers to the instance of this class(object)
		this.make = carMake;
	}
	
	public String getMake(){
		return this.make;
	}

}
