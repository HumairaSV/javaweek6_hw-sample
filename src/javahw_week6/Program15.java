package javahw_week6;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program15 {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first variable value: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value: ");
        int second = scanner.nextInt();
        Program15 obj = new Program15();
        obj.swapTheValue(first, second);
        //closing the scanner object
        scanner.close();
    }

    //Swapping the value of variables
    public void swapTheValue(int a, int b){
     int c;
        System.out.println("Before swapping, the value of first variable is: " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping, the value of first variable is: " + a + " and second variable is : " + b);
    }
}
