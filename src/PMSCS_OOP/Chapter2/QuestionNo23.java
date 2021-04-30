/*
Display the current time in the title of a frame window using this format:
12:45:43 PM. Refer to Table 2.1 for the necessary designator symbols
 */

package PMSCS_OOP.Chapter2;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuestionNo23 {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        String title = dateFormat.format(date);

        JFrame myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}
