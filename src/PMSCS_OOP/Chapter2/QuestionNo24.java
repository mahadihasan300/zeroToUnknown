/*
Write a Java program that displays a frame window 300 pixels wide and
200 pixels high with the title My First Frame. Place the frame so that its top
left corner is at a position 50 pixels from the top of the screen and 100 pixels
from the left of the screen. To position a window at a specified location, you
use the setLocation method, as in
 */

package PMSCS_OOP.Chapter2;

import javax.swing.*;

public class QuestionNo24 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle(" My First Frame");
        myWindow.setVisible(true);
        myWindow.setLocation( 100, 50 );
    }
}
