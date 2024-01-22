package Functional_programming;

import java.util.Scanner;
import java.util.TreeMap;

public class SortingTreemapWithLambdaExpDynamically {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of key-value pairs in TreeMap: ");

        int numElements = sc.nextInt();

        TreeMap<Integer, String> t = new TreeMap<>();

        // Taking user input for TreeMap key-value pairs
        System.out.println("Enter the TreeMap Key value pairs:");
        for (int i = 0; i < numElements; i++) {
            int element = sc.nextInt();
            String str = sc.nextLine();
            t.put(element, str);
        }

        System.out.println("Before sorting/natural sorting: " + t);

        // Customized sorting in descending order using lambda expression
        TreeMap<Integer, String> customSortedMap = new TreeMap<Integer, String>((I1, I2) -> 
        Integer.compare(I2, I1));
        //(I1 > I2) ? -1 : (I1 < I2) ? +1 : 0 ); can also use this instead of compare method

        
        customSortedMap.putAll(t);

        // Displaying TreeMap elements after customized sorting
        System.out.println("After customized sort (descending order) with lambda: " + customSortedMap);

        sc.close();
    }
}
