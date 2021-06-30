package BasicProblem;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0, a = 1, b = 1;

        System.out.print("1 1 ");

        while (k<=n){
            k = a+b;
            System.out.print(k + " ");
            a=b;
            b=k;
        }
    }
}
