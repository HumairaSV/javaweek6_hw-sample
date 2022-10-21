package javahw_week6;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18 {
    public static void main(String[] args) {
        //Scanner declaration to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int second = scanner.nextInt();
        Program18 obj = new Program18();
        obj.printTheOperation(first, second);
        //Closing the scanner object
        scanner.close();

    }
    //Print all the operations
    public void printTheOperation(int a, int b){
        System.out.println("The sum of " + a + " and " + b + " = " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " = " + (a - b));
        System.out.println("The product of " + a + " and " + b + " = " + (a * b));
        System.out.println("The division of " + a + " and " + b + " = " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " = " + (a % b));
    }
}
