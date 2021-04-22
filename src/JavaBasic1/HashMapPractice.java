package JavaBasic1;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        System.out.println("hi");
        HashMap <String, Integer>happy = new HashMap <String, Integer>();

        happy.put("a",1);
        happy.put("b", 33);

        System.out.println(happy);
        System.out.println(happy.get("b"));

        happy.remove("b");

        System.out.println( happy.containsKey("a"));

        System.out.println(happy.replace("a",99));

        System.out.println(happy);

        System.out.println(happy.values());

        System.out.println(happy.keySet());

        System.out.println(happy.size());


    }

}
