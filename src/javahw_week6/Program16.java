package javahw_week6;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
public class Program16 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two binary numbers");
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first binary number: ");
        String first = scanner.nextLine();
        System.out.print("Please enter the second binary number: ");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary numbers is: " + addition);
        //Closing the scanner object
        scanner.close();
    }

    //Adding two binary numbers
    public static String addTwoBinaryNumbers(String a, String b){
        int b1= Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b,2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }


}
