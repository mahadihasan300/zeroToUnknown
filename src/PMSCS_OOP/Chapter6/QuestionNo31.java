package PMSCS_OOP.Chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionNo31 {
    public static void main(String[] args) {

        int t = 1;
        double x ,y ,V , alfaDegree;
        double g = 9.8;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat ds = new DecimalFormat("0.00");

        System.out.print("Enter the velocity : ");
        V = scanner.nextDouble();
        System.out.print("Enter initial angel (in Radian) :" );
        alfaDegree = scanner.nextDouble();

        double alfaRadian = Math.toRadians(alfaDegree);

        do {
            x = V * Math.cos(alfaRadian) * t;
            y = V * Math.sin(alfaRadian) * t * ((g * t * t)/2);
            if(y <=0){
                break;
            }
            System.out.println("(x,y) at " + t + " second is : " + "("+ ds.format(x) +"," + ds.format(y) + ")");
            t++;

            if(t == 5)
                break;


        }while (y >= 0);


    }
}
