package PMSCS_OOP.Chapter4.QuestionNo16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesCalculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat ds = new DecimalFormat("0.00");
        CoffeeBag coffeeBag = new CoffeeBag();

        System.out.print("Enter the number of bag sold: ");
        int numberOfBagSold = scanner.nextInt();
        System.out.print("Enter the bag weight: ");
        int bagWeight = scanner.nextInt();

        double totalPriceCalculat = coffeeBag.totalPriceCalculate(bagWeight, numberOfBagSold);

        System.out.println("Number of bags sold: " + numberOfBagSold + "\n" +
                "Weight per bag: " + bagWeight+ " lb" + "\n" +
                "Price per pound: $"+CoffeeBag.pricePerPound + "\n" +
                "Sales tax: " + CoffeeBag.taxRate + "%" + "\n" + "\n" +
                "Total price: $ " + ds.format(coffeeBag.totalPriceWithTaxCalculate(totalPriceCalculat))
                );

    }
}
