package com.automation.java.selenium;

import java.util.ArrayList; // import another class

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a generic Arraylist
		
		ArrayList<String> strings = new ArrayList<String> ();
		//size of the Array List
		System.out.println("Size of the array list during creation : " + strings.size());
		
		//Add some elements
		strings.add("Mango");
		strings.add("Banana");
		strings.add("Grapes");
		
		System.out.println("Size of the array list after adding elements : " + strings.size());
		
		//Print elements of an arraylist
		System.out.println("List of elements in arraylist - " + strings);
		
		//Remove some element
		strings.remove("Mango");
		System.out.println("List of elements after removing mango - " + strings);
		
		//Remove element by Index
		strings.remove(0);
		System.out.println("List of elements after removing index 1 - " + strings);
				
	}

}
