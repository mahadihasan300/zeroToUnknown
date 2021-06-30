package BasicProblem;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int x = n;

        int r, s = 0;

        while (n > 0){
            r = n%10;
            n = n/10;
            s = s*10 + r;
        }

        System.out.println(s);
    }
}
