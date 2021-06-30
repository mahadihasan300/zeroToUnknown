package PMSCS_OOP.Chapter6;

import java.util.Scanner;

public class QuestionNo14 {
    public static void main(String[] args) {
        int start = 2;
        int count = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the last number : ");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("Total count : " + count);
        int estimetedNumber = (int) (end/(end/Math.log(end)));
        System.out.println("Tottal estinate count : " + estimetedNumber);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
