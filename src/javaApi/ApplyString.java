package javaApi;
//String is an object by born or before born; It has own separate class; 
// String is mutabel only using the buffer class (buffer)
public class ApplyString {
	static String fname = "Mariam";
	
 static	String mname = "Shopna";
	static char ch[] ={'S','h','o','p','n','a'};
	static String str = new String(ch);
	static String str1 = "Suppose your team has come up with some interesting ideas";
	 static String str2 = "The String class is immutable, so that once it is created a String object cannot be changed.";
	public static void main(String[] args) {
	int length = str1.length();
	System.out.println("String length is: " + length);
	System.out.println(str1);
	String str3 = str1.concat(str2);
	System.out.println(str3);
	System.out.println(str1.toLowerCase());
	System.out.println(str2.toUpperCase());
	System.out.println(str1.charAt(5));
	String substring = str3.substring(0,20);
	System.out.println(substring);
	System.out.println(str2.charAt(4));
	System.out.println(str1.compareTo(str2));
	System.out.println(fname);
	System.out.println(ch);
	System.out.println();
	System.out.println();
	System.out.println();
	
	}
}
	
 
	
	
	


	
	


