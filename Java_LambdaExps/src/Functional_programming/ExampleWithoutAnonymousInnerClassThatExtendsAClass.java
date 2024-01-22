package Functional_programming;

public class ExampleWithoutAnonymousInnerClassThatExtendsAClass {

	// Java program to illustrate creating an immediate thread 

	// Main class 
		
		// Main driver method 
		public static void main(String[] args) 
		{ 
			// Here a Thread class 
			MyThread t = new MyThread();

			// Starting the thread 
			t.start(); 

			// Displaying main thread only for readability 
			System.out.println("Main Thread"); 
		} 
	}


class MyThread extends Thread{
	
	public void run() 
	{ 
		// Print statement for child thread 
		// execution 
		System.out.println("Child Thread"); 
	} 
	
}