package Functional_programming;

//Java Program to Demonstrate Anonymous inner class that implements an interface

//Interface 
interface Age1 { 
	int x = 21; 
	void getAge(); 
} 

//Main class 
class ExampleWithAnonymousInnerClassThatImplsAnInterface { 
	
	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Myclass is hidden inner class of Age interface 
		// whose name is not written but an object to it 
		// is created. 
		Age1 oj1 = new Age1() { 
			
			@Override public void getAge() 
			{ 
				// printing age 
				System.out.print("Age is " + x); 
			} 
		}; 
		
		oj1.getAge(); 
	} 
}
