package PMSCS_OOP.Chapter5.QuestionNo10;

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

        if(userHeight >= 140 && userHeight <= 230){
            Height height = new Height();

            height.calculate(userAge, userHeight);

            System.out.println("Recomended weight is: " + ds.format(height.getrecommendedWeight()));
        }else {
            System.out.println("Height must be between 140cm and 230cm");
        }


    }
}
