/*
Write a program to convert centimeters (input) to feet and inches (output)
 */

package PMSCS_OOP.Chapter3;

import java.util.Scanner;

public class QuestionNo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in centimeter : ");
        double centimeter = scanner.nextDouble();

        double inch, feet;
        inch = 0.3937 * centimeter;
        feet = 0.0328 * centimeter;
        System.out.println("In feet : " + feet);
        System.out.println("In inch : " + inch);

    }
}
