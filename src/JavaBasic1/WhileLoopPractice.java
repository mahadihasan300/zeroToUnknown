package JavaBasic1;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        int a = 0;
        while (a<10){
            System.out.println("A is less then 10" + a);
            a++;
        }

        do {
            System.out.println(a);
        }while (a == 1);

        String scentnce = "to the principle";
        Scanner scan = new Scanner(scentnce);

        ArrayList<String > words = new ArrayList<String>();
        while(scan.hasNext()){
            words.add(scan.next());
        }
        System.out.println(words);
    }
}
