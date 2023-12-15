package Functional_programming;

import java.util.Scanner;

interface Interface2 {
    void getLength(String str);
}

interface Interface2_3 {
    void getSquareRoot(int i);
}

class Demo2 implements Interface2, Interface2_3 {
    public void getLength(String str) {
        System.out.println("Length of the given String '" + str + "' is: " + str.length());
    }

    public void getSquareRoot(int i) {
        System.out.println("Square root of '" + i + "' is: " + Math.sqrt(i));
    }
}

public class InvokeWithoutLambdaExpExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter an integer for square root calculation: ");
        int inputInt = scanner.nextInt();

        Demo2 obj = new Demo2();
        obj.getLength(inputString);
        obj.getSquareRoot(inputInt);

        scanner.close();
    }
}
