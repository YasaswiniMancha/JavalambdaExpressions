package Functional_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortOurOwnClassObjectsWithLambdaExpDynamically {

    public static void main(String[] args) {
        ArrayList<Employee_obj> employees = new ArrayList<Employee_obj>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employee objects: ");
        int no_of_objs = sc.nextInt();

        for (int i = 0; i < no_of_objs; i++) {
            System.out.println("Enter details for Employees " );
            System.out.print("Enter Employee number: ");
            int e_no = sc.nextInt();
            System.out.print("Enter Employee name: ");
            String e_name = sc.next();
            employees.add(new Employee_obj(e_no, e_name));
        }
        
        sc.close();

        System.out.println("Before sorting");
        System.out.println(employees);

        Collections.sort(employees, (e1, e2) -> (e1.e_no > e2.e_no) ? -1 : (e1.e_no < e2.e_no) ? +1 : 0);
       // Collections.sort(employees, (e2,e1) -> Integer.compare(e1.getE_no(), e2.getE_no()));

        System.out.println("After customised sorting: ");
        System.out.println(employees);
    }
   
}

class Employee_obj {
    int e_no;
    String e_name;

    public Employee_obj(int e_no, String e_name) {
        this.e_no = e_no;
        this.e_name = e_name;
    }

    @Override
    public String toString() {
        return "Employee [e_no=" + e_no + ", e_name=" + e_name + "]";
    }

	public int getE_no() {
		return e_no;
	}

	public void setE_no(int e_no) {
		this.e_no = e_no;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
    
    
}
