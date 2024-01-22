package Functional_programming;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class SortingTreemapWithoutLambdaExpDynamically {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for TreeSet elements
        System.out.print("Enter the number of elements in TreeSet: ");
        int numElements = scanner.nextInt();

        TreeMap<Integer,String> t = new TreeMap<Integer,String>();

        // Taking user input for TreeSet elements
        System.out.println("Enter the TreeSet elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            String str= scanner.nextLine();
            t.put(element,str);
        }

        // Displaying TreeSet elements before customized sorting
        System.out.println("Before customized sort/natural and default sorting order: " + t);

        // Using an anonymous inner class for the comparator
        TreeMap<Integer, String> customSortedMap = new TreeMap<Integer,String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer I1, Integer I2) {
               // (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0 ); //can also use this instead of compare method
            	return Integer.compare(I2, I1);
            }
        });

        // Adding elements to TreeSet with customized sorting
        customSortedMap.putAll(t);

        // Displaying TreeSet elements after customized sorting
        System.out.println("After customized sort (descending order) without lambda: " + customSortedMap);

        scanner.close();
    }
}

