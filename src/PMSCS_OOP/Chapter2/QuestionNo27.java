/*
Write a program that accepts a string input and outputs the number of
characters in the string and the first and last character in separate lines. For
80 Chapter 2 Getting Started with Java
wu23305_ch02.qxd 2/16/09 3:57 PM Page 80example, if the input is I like Java then the output would be
11
I
a
 */
package PMSCS_OOP.Chapter2;

import java.util.Scanner;

public class QuestionNo27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input.length());
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length()-1));
    }
}
