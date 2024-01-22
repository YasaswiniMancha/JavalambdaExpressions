package Functional_programming;

import java.util.ArrayList;
import java.util.Collections;

public class SortOurOwnClassObjectsWithLambdaExp {

	public static void main(String[] args) {
		
	ArrayList<Employee> l = new ArrayList<Employee>();
	l.add(new Employee(200 ,"jack"));
	l.add(new Employee(500 ,"mathew"));
	l.add(new Employee(456 ,"harley"));
	l.add(new Employee(66 ,"candie"));
	l.add(new Employee(12 ,"kat"));
     System.out.println("Before sorting");
     System.out.println(l);
     Collections.sort(l,(e1,e2) -> (e1.e_no>e2.e_no) ? -1 : (e1.e_no<e2.e_no)? +1 : 0); //customised sorting 
     System.out.println("After customised  sorting : ");
     System.out.println(l);

		
	}

}

class Employee{
	
	int e_no;
	String e_name;
	
	public Employee(int e_no, String e_name) {
		super();
		this.e_no = e_no;
		this.e_name = e_name;
	}

	@Override
	public String toString() {
		return "Employee [e_no=" + e_no + ", e_name=" + e_name + "]";
	}
	
	
	
	
}
