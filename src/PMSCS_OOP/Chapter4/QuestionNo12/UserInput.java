package PMSCS_OOP.Chapter4.QuestionNo12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat ds = new DecimalFormat("0.00");

        System.out.print("Enter age: ");
        int userAge = scanner.nextInt();

        System.out.print("Enter height in cm: ");
        double userHeight = scanner.nextDouble();

        Height height = new Height();

        height.calculate(userAge, userHeight);

        System.out.println("Recomended weight is: " + ds.format(height.getrecommendedWeight()));
    }
}
