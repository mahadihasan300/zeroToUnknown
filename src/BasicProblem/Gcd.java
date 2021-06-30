package BasicProblem;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(calculateGcd(16,44));

        String s= "Kolkata".replace('k','a');

        System.out.println(s);
        byte b = 127;
        b++;
        b++;
        System.out.println(b);

    }

    public static int calculateGcd(int m, int n){
        int r = n % m;
        while (r !=0){
            n = m;
            m = r;

            r = n % m;
        }
        return m;
    }

}
