package JavaBasic1;

public class ConditionalOperatorPractice {
    public static void main(String[] args) {
        int a = (7 > 3) ? 7 : 3;
        System.out.println(a);

        //Equal to

        if (7>3){
            a=7;
        }else {
            a=3;
        }

        String b = "hellow";
        double result = b.equals("helllo") ? 0.5 : 0.25;

        System.out.println(result);
    }
}
