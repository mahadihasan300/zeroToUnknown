package PMSCS_OOP.Chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionNo17 {
    public static void main(String[] args) {

        // Generating distinct random number

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        // getting input numbers
        int first, secound, third;

        Scanner scanner = new Scanner(System.in);

        first = scanner.nextInt();
        secound = scanner.nextInt();
        third = scanner.nextInt();

        System.out.println(first + " " + secound + " " + third);

        if (list.get(0) == first && list.get(1) == secound && list.get(2) == third) {
            words.add("Fermi");
            words.add("Fermi");
            words.add("Fermi");

            System.out.println(words);
        } else if (list.get(0) != first && list.get(1) != secound && list.get(2) != third) {
            words.add("Nano");
            words.add("Nano");
            words.add("Nano");
            System.out.println(words);
        } else if ((list.get(0) != first && list.get(1) != secound && list.get(2) != third) && (list.get(0) == secound || list.get(0) == third)) {
            words.add("Pico");
            words.add("Nano");
            words.add("Nano");

        } else if ((list.get(0) != first && list.get(1) != secound && list.get(2) != third) && (list.get(1) == secound || list.get(1) == third)) {
            words.add("Nano");
            words.add("Pico");
            words.add("Nano");


        }
        else if ((list.get(0) != first && list.get(1) != secound && list.get(2) != third) && (list.get(3) == secound || list.get(3) == first)) {
            words.add("Nano");
            words.add("Nano");
            words.add("Pico");


        }
    }

}
