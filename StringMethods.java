package javaTutorial;

public class StringMethods {

	public static void main(String[] args) {
		String str = "This is the test string";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "          trim me      ";
		String str6 = "Hello";
		
		
		System.out.println("Length of str is :"+str.length());
		System.out.println("character at index=2 in str is :"+str.charAt(2));
		System.out.println(" adding with :"+str.concat(" This will be appended to me"));
		System.out.println("str contains is :"+str.contains("is"));
		System.out.println("str contains si :"+str.contains("si"));
		System.out.println("str starts with This :"+str.startsWith("This"));
		System.out.println("str starts with is :"+str.startsWith("is"));
		System.out.println("str ends with string :"+str.endsWith("string"));
		System.out.println("str ends with test :"+str.endsWith("test"));
		
		
		System.out.println("str1 and str2 are equal :"+str1.equals(str2));
		System.out.println("str1 and str3 are equal :"+str1.equals(str3));
		System.out.println("index of 'h' in str is :"+str.indexOf('h'));
		System.out.println(("is str empty :"+str.isEmpty()));
		System.out.println("is str4 empty :"+str4.isEmpty());
		System.out.println("trim str5 on both sides :"+str5.trim());
		System.out.println("replace e with a in str6 :"+str6.replace('e', 'a'));
		System.out.println("substring of str starting from 5th position :"+str.substring(5));
		
		
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++)
			System.out.println("Index "+i+" is "+charArray[i]);
		
		System.out.println("Everything is lowercase: "+str.toLowerCase());
		System.out.println("Everything is uppercase: "+str.toUpperCase());
	}

}
