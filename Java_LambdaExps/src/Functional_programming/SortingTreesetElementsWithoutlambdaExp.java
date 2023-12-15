package Functional_programming;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingTreesetElementsWithoutlambdaExp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for TreeSet elements
        System.out.print("Enter the number of elements in TreeSet: ");
        int numElements = scanner.nextInt();

        TreeSet<Integer> t = new TreeSet<Integer>();

        // Taking user input for TreeSet elements
        System.out.println("Enter the TreeSet elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            t.add(element);
        }

        // Displaying TreeSet elements before customized sorting
        System.out.println("Before customized sort: " + t);

        // Using an anonymous inner class for the comparator
        TreeSet<Integer> customSortedSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer I1, Integer I2) {
                return (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0;
            }
        });

        // Adding elements to TreeSet with customized sorting
        customSortedSet.addAll(t);

        // Displaying TreeSet elements after customized sorting
        System.out.println("After customized sort (descending order) without lambda: " + customSortedSet);

        scanner.close();
    }
}
