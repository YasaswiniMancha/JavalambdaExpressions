package Functional_programming;

import java.util.TreeMap;

public class SortingTreemapWithLambdaExp {

	public static void main(String[] args) {
	
		TreeMap<Integer,String> t= new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I2>I1)?+1:0);
		
		t.put(10001, "Yash");
		
		t.put(10002, "Yash");
		
		t.put(10001, "Yasaswini");  //last added is the priority
		
		t.put(10003, "Yashu");
		
	    System.out.println("After customised sorting order (descending) : "+t);
		

	}

}
