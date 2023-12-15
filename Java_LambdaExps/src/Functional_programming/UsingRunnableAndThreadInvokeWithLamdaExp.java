package Functional_programming;

//using the pre-defined interface Runnable(which is also a Functional interface)
public class UsingRunnableAndThreadInvokeWithLamdaExp {
	
	public static void main(String args[]) {
		
		Runnable r = ()->{
			for(int i=0;i<5;i++) {
				System.out.println("Lambda child thread :"+i);
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<8;i++) {
			System.out.println("Lambda main thread :"+i);
		}
	}

}
