package com.automation.java.selenium;

public class StringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] hello = {'R', 'U','B','Y'}; //
		
		for(int i=0; i<hello.length; i++)
		{
			System.out.println("Character Array - " + hello[i]);
		}
		String strExmaple = new String (hello);
		System.out.println("String is - " + strExmaple);

		
		String str1 = "Rock"; //
		str1 = "Hello";
		
		String str2 = "Pepper"; //
		
		String str3 = str1.concat(str2);
		System.out.println("String 3 value -- " + str3);
		
		String str4 = str1 + str2;
		System.out.println("String 4 value -- " + str4);
		System.out.println("String length -- " + str4.length());
		System.out.println("String length -- " + str4.charAt(1));
		System.out.println("String length -- " + str4.indexOf('P'));
		
		//Example 
		
		
	}

}
