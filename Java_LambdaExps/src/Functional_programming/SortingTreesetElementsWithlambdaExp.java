package Functional_programming;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingTreesetElementsWithlambdaExp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for TreeSet elements
        System.out.print("Enter the number of elements in TreeSet: ");
        int numElements = sc.nextInt();

        TreeSet<Integer> t = new TreeSet<>();

        // Taking user input for TreeSet elements
        System.out.println("Enter the TreeSet elements:");
        for (int i = 0; i < numElements; i++) {
            int element = sc.nextInt();
            t.add(element);
        }

        // Displaying TreeSet elements before customized sorting
        System.out.println("Before customized sort /natural sort order of set: " + t);

        // Using lambda expression for the comparator
        TreeSet<Integer> customSortedSet = new TreeSet<Integer>((I1, I2) ->
        Integer.compare(I2, I1));
        //(I1 > I2) ? -1 : (I1 < I2) ? +1 : 0 ); can also use this instead of compare method
        
        // Adding elements to TreeSet with customized sorting
        customSortedSet.addAll(t);

        // Displaying TreeSet elements after customized sorting
        System.out.println("After customized sort (descending order) with lambda: " + customSortedSet);

        sc.close();
    }
}
