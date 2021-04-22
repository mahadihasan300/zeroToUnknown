package JavaBasic1;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "1213";
        System.out.println(s+4);


        System.out.println( Integer.parseInt(s) + 4);

        int a = 5;
        System.out.println(Integer.toString(a)+2);

        String b = "age: 47";

        b = b.replaceAll("\\D+","");
        System.out.println(b);
    }
}
