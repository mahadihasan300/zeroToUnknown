package PMSCS_OOP.Chapter5;

import java.util.Scanner;

public class QuestionNo09 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the power of 10 : ");
        input = scanner.nextInt();

        switch (input){
            case 6:
                System.out.println("Million");
                break;
            case 9:
                System.out.println("Billion");
                break;
            case 12:
                System.out.println("Trillion");
                break;
            case 15:
                System.out.println("Quadrillion");
                break;
            case 18:
                System.out.println("Quintillion");
                break;
            case 21:
                System.out.println("Sextillion");
                break;
            case 30:
                System.out.println("Nonillion");
                break;
            case 100:
                System.out.println("Googol");
                break;
            default:
                System.out.println("No Corresponding word found on given Input");

        }
    }
}
