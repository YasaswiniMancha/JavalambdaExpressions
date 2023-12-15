package Functional_programming;

 interface interf{
	public void m1();
}

public class InvokeWithoutLambdaExp {

	public static void main(String[] args) {
		 
		interf obj= new Demo();
		obj.m1();

	}

}

 class Demo implements interf{
	public void m1() {
		System.out.println("Implementation of the m1() method");
	}
	
}