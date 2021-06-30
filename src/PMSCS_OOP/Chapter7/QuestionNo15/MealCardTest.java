package PMSCS_OOP.Chapter7.QuestionNo15;

import PMSCS_OOP.Chapter7.QuestionNo15.myutil.MealCard;

public class MealCardTest {
    public static void main(String[] args) {
        MealCard m1 = new MealCard();

        System.out.println(m1.getInitialPoint());
        System.out.println(m1.purchasePoint(50));

        System.out.println(m1.getCurrentPoint());

        System.out.println(m1.foodPurchase(100));

        System.out.println(m1.foodPurchase(100));
    }
}
