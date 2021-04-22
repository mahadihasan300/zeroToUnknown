package JavaBasic2;

import java.util.ArrayList;

public class ExceptionInJava {
    public static void main(String[] args) {

        String[] pets = {"dog", "cat"};
        System.out.println(pets[2]);

        ArrayList<String> list = new ArrayList<String>();
        list.get(0);
    }
}
