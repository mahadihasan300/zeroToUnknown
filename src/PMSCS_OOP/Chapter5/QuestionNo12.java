package PMSCS_OOP.Chapter5;

import java.util.Scanner;

public class QuestionNo12 {
    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextInt();

        if(input % 2 == 0 && input  % 100 != 0){
            System.out.println(input + " Leap year");
        }else if (input % 4 ==0 && input % 100 == 0){
            System.out.println(input + " is Leap Year");
        }else {
            System.out.println(input + " is not leap year");
        }

    }
}
