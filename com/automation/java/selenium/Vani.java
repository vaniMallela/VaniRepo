package com.automation.java.selenium;


public class Vani {
	
	//To store values
	String voiceMessage;
	int b = 10; // instance variable
	static int c = 50; // Static Variable
	
	  // Types of Variables
	//  Local Variables
	//  Instance Variables 
	//  Static Variables
	
	public void sayHello()
	{
		int a = 10; //local variable
		System.out.println(voiceMessage);
		System.out.println(b);
	}

	public void sayHello1()
	{
		int a = 10; //local variable
		System.out.println(voiceMessage);
		System.out.println(b);
	}
	
	  public static void main(String[] args) 
	  {
		  System.out.println(" program execution");
		  Vani vaniObj = new Vani();
		  vaniObj.sayHello();
		  System.out.println("Hello");
		//  System.out.println(b);
	  }
	  
	  // Data types
	  
	  Primitive  and non primitive
	  Boolean  Numeric
 	  boolean Chacater  Integers
 	  			char	integer					floating-point
 	  					byte, short, int long	float double
	  
 	  					byte - 1byte
 	  					short - 2byte
 	  					int  4 bytes
 	  					long 8 byte
 	  					float 4 bytes
 	  					double 8 bytes
 	  					chat - 2 bytes
 	  					boolean - 1 byte (true/false)
 	  					
default values 

Int a; - 0
short 0
byte 0
long - 0L
float - 0.0f
double - 0.0d
bolean - false
char - '\u000'


Few things remembers

numberic variable can be assigned (+/-)
the size of the data types is same on all the platforms


Type casting




	  
}
