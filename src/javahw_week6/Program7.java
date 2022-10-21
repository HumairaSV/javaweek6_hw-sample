package javahw_week6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        float temp =  scanner.nextFloat();
        //Object creation
        Program7 t = new Program7();
        t.convertTempToDegreeCelsius(temp);


    }
    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp -32)*5/9);
        System.out.println("The temperature" + temp + " fahrenheit is equal to " + c + "degree celsius");
    }

}
