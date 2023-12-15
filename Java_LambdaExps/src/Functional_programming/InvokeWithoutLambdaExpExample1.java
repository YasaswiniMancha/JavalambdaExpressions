
package Functional_programming;

interface interface1{
	public void add(int a, int b);
}

class Demo1 implements interface1{
	public void add(int a, int b) {
		System.out.println("added a,b and got this: "+(a+b));
	}
	
}

public class InvokeWithoutLambdaExpExample1 {

	public static void main(String[] args) {
		 
		interface1 obj= new Demo1();
		obj.add(12,13);

	}

}

