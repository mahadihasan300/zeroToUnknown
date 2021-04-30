package JavaBasic2;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> games = new Stack<>();
        games.add("Call of duity");
        games.add("COC");
        games.add("PUBG");

        System.out.println(games);

        System.out.println(games.pop());

        System.out.println(games.peek());

        System.out.println(games.contains("gaja"));
        System.out.println(games.get(0));
        System.out.println(games.size());

        System.out.println(games.set(1,"java"));


        foo(4);

    }
    static void foo(int i){
        if(i>1){
            foo(i/2);
            foo(i/2);
        }
        System.out.println("*");
    }
}
