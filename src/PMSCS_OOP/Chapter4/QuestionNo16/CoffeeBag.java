package PMSCS_OOP.Chapter4.QuestionNo16;

public class CoffeeBag {

    public static final double pricePerPound = 5.99;
    public static final double taxRate = 7.25;


    private double totalPrice;
    private double totalPriceWithTax;

    public double totalPriceCalculate(int bagWeight, int numberOfBagSold){
        return totalPrice = bagWeight * numberOfBagSold * pricePerPound;

    }

    public double totalPriceWithTaxCalculate(double totalPrice){
        return totalPriceWithTax = totalPrice + (totalPrice * (taxRate/100));

    }


}
