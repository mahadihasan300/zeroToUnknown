package PMSCS_OOP.Chapter5.QuestionNo11;

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

        System.out.print("Enter your weight: ");
        double userInputWeight = scanner.nextDouble();

        if(userHeight >= 140 && userHeight <= 230){
            Height height = new Height();

            double w = height.calculate(userAge, userHeight);

            if(userInputWeight > w + 10){
                System.out.println("You should exercise more");

            }

            if(userInputWeight < w - 20){
                System.out.println(" You need more nourishment");

            }

            System.out.println("Recomended weight is: " + ds.format(w));
        }else {
            System.out.println("Height must be between 140cm and 230cm");
        }


    }
}
