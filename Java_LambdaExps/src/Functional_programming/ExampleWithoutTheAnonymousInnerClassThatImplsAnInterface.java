package Functional_programming;


	// A class that implements the Runnable interface
	class MyRunnable1 implements Runnable {
	    // run() method for the thread
	    public void run() {
	        // Print statement when run() is invoked
	        System.out.println("Child Thread");
	    }
	}

	// Main class
	public class ExampleWithoutTheAnonymousInnerClassThatImplsAnInterface {
	    // Main driver method
	    public static void main(String[] args) {
	        // Creating an instance of the MyRunnable class
	        MyRunnable1 myRunnable = new MyRunnable1();

	        // Creating thread in main() using Thread class
	        Thread t = new Thread(myRunnable);

	        // Starting the thread using start() method
	        // which invokes run() method automatically
	        t.start();

	        // Print statement only
	        System.out.println("Main Thread");
	    }
	}
