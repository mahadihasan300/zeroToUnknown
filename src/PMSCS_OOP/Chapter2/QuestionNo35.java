/*
Problem Statement: Write a program that asks the user for her or his
full name in the format
first middle last
and replies with the name in the format
last , first middle-initial.
where the last name is followed by comma and the middle initial is followed
by period.
For example, if the input is
Decafe Chai Latte
then the output is
Latte, Decafe C.
 */


package PMSCS_OOP.Chapter2;

import java.util.Scanner;

public class QuestionNo35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println(lastName+ ", " + firstName + " " + middleName.charAt(0) + ".");

    }
}
