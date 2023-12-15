package Functional_programming;

@FunctionalInterface
 interface FuncInterface{
	public void m1();
}

public class InvokeLambdaExpUsingFuncInteface {

	public static void main(String[] args) {
		FuncInterface obj=()->	System.out.println("Implementation of the m1() method");
		obj.m1();

	}

}

 
	
