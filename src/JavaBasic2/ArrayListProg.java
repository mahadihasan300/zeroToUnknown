package JavaBasic2;

import java.util.ArrayList;

public class ArrayListProg {
    public static void main(String[] args) {
        ArrayList fruitList = new ArrayList();
        fruitList.add("mango");
        fruitList.add("banana");

        fruitList.remove("banana");

        fruitList.clear();
        fruitList.contains("mango");

        System.out.println(fruitList);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.get(0);
        System.out.println(list);
    }
}
