
package Functional_programming;

@FunctionalInterface
 interface FuncInterface1{
	public void add(int a, int b);
}

public class InvokeLambdaExpUsingFuncIntefaceExample1 {

	public static void main(String[] args) {
		FuncInterface1 obj=(a,b)->	System.out.println("added a,b and got this: "+(a+b));
		obj.add(12,13);

	}

}

 
	

