/*
Write a program that computes the area of a circular region (the shaded area
in the diagram), given the radii of the inner and the outer circles, ri and ro,
respectively
 */

package PMSCS_OOP.Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionNo09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the inner radious: ");
        double innerRadious = scanner.nextDouble();
        System.out.print("Enter the outter radious: ");
        double outterRadious = scanner.nextDouble();


        DecimalFormat ds = new DecimalFormat("0.00");
        double areaOfCircularRegion = Math.PI * ((outterRadious - innerRadious)*2);
        System.out.println("Area of circular region is " + ds.format(areaOfCircularRegion));


    }
}
