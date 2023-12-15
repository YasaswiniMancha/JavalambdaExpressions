package Functional_programming;
import java.util.Scanner;

@FunctionalInterface
interface Interface2_1 {
    int getLength(String str);
}

@FunctionalInterface
interface Interface2_2 {
    void getSquareRoot(int i);
}

public class InvokeLambdaExpUsingFuncIntefaceExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Interface2_1 obj = str -> str.length();
        Interface2_2 obj1 = i -> System.out.println("Square root of '" + i + "' is: " + Math.sqrt(i));

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter an integer: ");
        int inputInteger = scanner.nextInt();
        
        System.out.println("Length of the given String '" + inputString + "' is: " + obj.getLength(inputString));


        obj1.getSquareRoot(inputInteger);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
