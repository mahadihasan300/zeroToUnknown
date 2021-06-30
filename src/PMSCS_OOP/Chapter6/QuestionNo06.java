package PMSCS_OOP.Chapter6;

import java.util.Scanner;

public class QuestionNo06 {
    public static void main(String[] args) {

        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        j = scanner.nextInt();

        for(int i = 10; i < j; i++){
            if(i%10 == 9){
                System.out.print(i);
                System.out.println();
                continue;
            }
            System.out.print(i + "\t");
        }


    }
}
