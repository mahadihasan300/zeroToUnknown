package JavaBasic2;

public class BreakStatment {
    public static void main(String[] args) {
        int[] num = {10 ,23, 30, 56, 45};

        for(int i=0; i< num.length; i++){
            if (num[i] == 30){
                break;
            }
            System.out.println(num[i]);
        }
    }
}
