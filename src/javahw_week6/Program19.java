package javahw_week6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19 {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence in uppercase: ");
        String uppercase = scanner.nextLine();
        Program19 obj = new Program19();
        obj.convertStringTolowerCase(uppercase);
        //Closing the scanner object
        scanner.close();
    }

    //Convert string to lowercase
    public void convertStringTolowerCase(String a){
        System.out.println("The Lowercase of the string is = " + a.toLowerCase());
    }
}
