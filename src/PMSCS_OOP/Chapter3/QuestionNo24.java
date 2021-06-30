package PMSCS_OOP.Chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionNo24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat ds = new DecimalFormat("0.00");

        System.out.print("Enter the wight of bag : ");
        int weight = scanner.nextInt();
        System.out.print("Enter the number of bag : ");
        int numberOfBag = scanner.nextInt();

        double totalPrice = weight * numberOfBag * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;


        System.out.println("Number of bag sold: " + numberOfBag);
        System.out.println("Weignt per bag: " + weight + " lb");
        System.out.println("Price per pound: $" + totalPrice/(numberOfBag * weight));
        System.out.println("Sales tax: " + 7.25 + "%");
        System.out.println();
        System.out.println("Total price: $ " +ds.format(totalPriceWithTax));
    }
}
