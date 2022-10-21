package javahw_week6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9 {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase String: ");
        String uppercase = scanner.nextLine();
        Program9 obj = new Program9();
        obj.convertUppercaseToLowercase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowercase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }

}
