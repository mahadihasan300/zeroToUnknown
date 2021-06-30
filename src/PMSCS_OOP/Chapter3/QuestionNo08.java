/*
Write a program that inputs temperature in degrees Celsius and prints out the
temperature in degrees Fahrenheit.
 */

package PMSCS_OOP.Chapter3;

import java.util.Scanner;

public class QuestionNo08 {
    public static void main(String[] args) {

        System.out.print("Enter the temperature in celsius : ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit =  1.8 * celsius + 32;

        System.out.println("Temperature in fahrenheit is : " + fahrenheit);
    }
}
