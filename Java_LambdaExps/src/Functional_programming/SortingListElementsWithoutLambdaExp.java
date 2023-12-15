package Functional_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingListElementsWithoutLambdaExp {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer> ();
		l.add(10);
		l.add(9);
		l.add(30);
		l.add(6);
		System.out.println("Before sorting : "+l);

		Collections.sort(l, new MyComparator());
		
		System.out.println("After Customised sorting [so used comparator] : "+l);

	}

}


class MyComparator implements Comparator<Integer>{
	public int compare(Integer I1,Integer I2){
		/*if(I1>I2) {
			return -1;
		}
		else if(I1<I2) {
			return +1;
		}
		else {
			return 0;
		} */
		return(I1>I2)?-1:(I1<I2)?+1:0   ;   //we can  use this condition instead all that conditions
	}
}
