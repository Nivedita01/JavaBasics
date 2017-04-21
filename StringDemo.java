package javaTutorial;

public class StringDemo {

	public static void main(String[] args) {
		//String is a reference object in Java, it is not a primitive data type.
		
		//String Literal - String Constant Pool
		String str1 = "Hello"; // str1 is reference to "Hello" object.
		
		String str3 = "Hello";
		
		//String Object - Heap (Use only if needed)
		String str2 = new String("World");
		
		String str4 = new String("World");
		
		//Strings are immutable
		str1 = "New Hello"; //changes the reference of the "Hello" object to "New Hello" object. "Hello is still present in the memory, gc dump will erase if not used. " 

	}

}
