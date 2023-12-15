package Functional_programming;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListElementsWithLambdaExp {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer> ();
		l.add(10);
		l.add(9);
		l.add(30);
		l.add(6);
		System.out.println("Before sorting : "+l);
		Collections.sort(l, (I1,I2)-> (I1>I2)? -1 :(I1<I2)? +1 :0); //lambda exp
		System.out.println("After Customised sorting using Lambda expression [so used comparator] : "+l);
	}

}
