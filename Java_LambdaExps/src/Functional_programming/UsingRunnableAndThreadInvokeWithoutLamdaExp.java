package Functional_programming;

public class UsingRunnableAndThreadInvokeWithoutLamdaExp {

	public static void main(String[] args) {
		
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<8;i++) {
			System.out.println("main thread :"+i);
		}

	}

}

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread :"+i);
		}
	}
}
