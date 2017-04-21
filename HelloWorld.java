package javaTutorial;

public class HelloWorld {
	
	int myGlobal = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		
		/*Byte = -128 to 127*/
		byte myByte = 100;
		System.out.println("My byte is ::"+myByte);

	
		/* short */
		short myShort = 10000;
		System.out.println("My short is ::"+myShort);
	
	
		/* int */
		int myInt = 10000000;
		System.out.println("My int is ::"+myInt);
		
		
		/* Long */
		long myLong = 100000000;
		System.out.println("My long is ::"+myLong);
		
		
		/* float (Not used in banking/financial transactions)*/
		float myFloat = 20.54f;
		System.out.println("My float is ::"+myFloat);
		
		
		/* double */
		double myDouble = 90.3;
		System.out.println("My double is ::"+myDouble);
		
		
		/* boolean = true or false*/
		boolean myBoolean = true;
		System.out.println("My boolean is ::"+myBoolean);
		
		
		/* char = 0 to 65535*/
		char myChar = 'D';
		System.out.println("My char is ::"+myChar);
	}
	
	public void test(){
		myGlobal = 200;
	}

}
