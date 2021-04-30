package JavaBasic2;

public class TryCatchProg {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        try {
            System.out.println(a[5]);
        }catch (Exception e){
            System.out.println("Error");
        }


    }
}
