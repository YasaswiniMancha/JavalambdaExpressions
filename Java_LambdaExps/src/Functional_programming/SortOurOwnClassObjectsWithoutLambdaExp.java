package Functional_programming;

public class SortOurOwnClassObjectsWithoutLambdaExp {

	public static void main(String[] args) {

		EmployeeWithoutLambda e1 = new EmployeeWithoutLambda(100,"yash");
		
		System.out.println(e1);
		
		
	}

}

class EmployeeWithoutLambda{
	 
	int e_no;
	String e_name;
	
	public EmployeeWithoutLambda(int e_no, String e_name) {
		super();
		this.e_no = e_no;
		this.e_name = e_name;
	}

	@Override
	public String toString() {
		return "EmployeeWithoutLambda [e_no=" + e_no + ", e_name=" + e_name + "]";
	}
	
	
}