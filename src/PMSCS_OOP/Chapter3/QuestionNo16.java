/*
Your weight is actually the amount of gravitational attraction exerted on
you by the Earth. Since the Moon’s gravity is only one-sixth of the Earth’s
gravity, on the Moon you would weigh only one-sixth of what you weigh on
Earth. Write a program that inputs the user’s Earth weight and outputs her or
his weight on Mercury, Venus, Jupiter, and Saturn.
 */
package PMSCS_OOP.Chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionNo16 {
    public static void main(String[] args) {

        System.out.print("Please enter the weight in earth : ");
        Scanner scanner = new Scanner(System.in);
        DecimalFormat ds = new DecimalFormat("0.00");

        double weightOnEarth = scanner.nextDouble();

        double weightOnMerchury = weightOnEarth * 0.4;
        double weightOnVenus = weightOnEarth * 0.9;
        double weightOnJupiter = weightOnEarth * 2.5;
        double weightSatrun = weightOnEarth * 1.1;

        System.out.println("Weight on Mercury is : " + ds.format(weightOnMerchury));
        System.out.println("Weight on Venus is : " + ds.format(weightOnVenus));
        System.out.println("Weight on Jupiter is : " + ds.format(weightOnJupiter));
        System.out.println("Weight on Satrun is : " + ds.format(weightSatrun));
    }
}
