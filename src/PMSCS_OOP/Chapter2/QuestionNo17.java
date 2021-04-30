/*
Write a program that displays a frame window 800 pixels wide and 600 pixels
high. Set the title of the frame to Welcome to Java.
 */

package PMSCS_OOP.Chapter2;

import javax.swing.*;

public class QuestionNo17 {
    public static void main(String[] args) {

        JFrame myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle(" Welcome to Java");
        myWindow.setVisible(true);
    }
    }

