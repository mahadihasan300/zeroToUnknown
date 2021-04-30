/*
Write a program that displays a frame window W pixels wide and H pixels
high. Use the Scanner to enter the values for W and H. The title of the frame
is also entered by the user.
 */

package PMSCS_OOP.Chapter2;

import javax.swing.*;
import java.util.Scanner;

public class QuestionNo22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wide = scanner.nextInt();
        scanner.nextLine();
        int height = scanner.nextInt();
        scanner.nextLine();
        String title = scanner.nextLine();

        scanner.close();

        JFrame myWindow = new JFrame();
        myWindow.setSize(wide,height);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}
