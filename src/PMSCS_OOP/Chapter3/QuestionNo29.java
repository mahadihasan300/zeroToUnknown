package PMSCS_OOP.Chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionNo29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Enter the number of bag : ");

        int numberOfBag = scanner.nextInt();
        double coffeeCost = numberOfBag * 5.50;

        int largeBag = 0;
        int mediumBag = 0;
        int smallBag = 0;

        if((numberOfBag % 20) > 0){
            largeBag = numberOfBag/20;

        }

        if(((numberOfBag % 20) %10) > 0){
            mediumBag = ((numberOfBag % 20) /10);
            if( ((numberOfBag % 20) %10) <=5){
                smallBag = 1;
            }

        }

        double totalCost = coffeeCost + (largeBag *  1.8) + (mediumBag * 1.00) + (smallBag * 0.60);

        System.out.println(largeBag + " Large  - $" +  df.format(largeBag *  1.8));
        System.out.println(mediumBag + " Medium - $" + df.format(mediumBag * 1.00));
        System.out.println(smallBag + " Small  - $" + df.format(smallBag * 0.60) );

        System.out.println("Your total cost is: $ " + df.format(totalCost));


    }
}
