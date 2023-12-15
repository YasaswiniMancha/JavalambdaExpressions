package Functional_programming;

//FunctionalInterface WRT the inheritance
@FunctionalInterface
public interface ParentInterfaceWRTinheritance {
	
	public void m1();

}

//case1 of child1 inheriting parent in functional interface, child1 is also the FunctionalInterface

@FunctionalInterface
interface child1 extends ParentInterfaceWRTinheritance{
	
}

/*case2 of child2 inheriting parent in functional interface, child2 is also the FunctionalInterface since 
it overrides the same abstract method name of the parent*/

@FunctionalInterface
interface child2 extends ParentInterfaceWRTinheritance{
	
	public void m1();
}

/*Here in this case3 ,child3 is having 2 abstract methods so it is not FunctionalInterface we should not declare
 @FunctionalInterface above child3 interface , but the syntax is valid */


interface child3 extends ParentInterfaceWRTinheritance{
	
	public void m2();
}


