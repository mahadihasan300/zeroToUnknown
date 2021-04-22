package JavaBasic2;

public class ReturnStatement {
    public static void main(String[] args) {

        printMssg();
        int sum = add(4,6);
        System.out.println(sum);

        String c = caps("mahadi");
        System.out.println(c);

        int[] awsomArray = arrayFromInt(2,4,5);
        System.out.println(awsomArray[0]);
        System.out.println(awsomArray[1]);
        System.out.println(awsomArray[2]);

    }
    public static void printMssg(){
        System.out.println("This is our 1st method");
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static String caps(String s){
        return s.toUpperCase();
    }

    public static int[] arrayFromInt(int a, int b, int c){
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        return array;
    }
}
