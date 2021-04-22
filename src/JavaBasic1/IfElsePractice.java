package JavaBasic1;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a grade :");

        int n = scan.nextInt();

        if(n>=90 && n<=100){
            System.out.println("A");
        }else if(n>=70){
            System.out.println("B");
        }else {
            System.out.println("THe number you inter is not in range");
        }
    }
}
