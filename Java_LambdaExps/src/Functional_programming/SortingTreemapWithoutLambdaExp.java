package Functional_programming;

import java.util.Comparator;
import java.util.TreeMap;

public class SortingTreemapWithoutLambdaExp {

	public static void main(String[] args) {
	
		TreeMap<Integer,String> t= new TreeMap<Integer,String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer I1, Integer I2) {
                return (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0;
            }
        });
		
		t.put(10001, "Yash");
		
		t.put(10002, "Yash");
		
		t.put(10001, "Yasaswini");  //last added is the priority
		
		t.put(10003, "Yashu");
		
	    System.out.println("After customised sorting order (descending) : "+t);
	    
	    
		

	}

}
