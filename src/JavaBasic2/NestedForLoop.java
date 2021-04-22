package JavaBasic2;

public class NestedForLoop {
    public static void main(String[] args) {
        String[][] color ={
                {"Red", "Green", "Blue"},
                {"Cyan", "Megenda", "Purple"}
    };
        for (int row = 0; row< 2 ; row++){
            for(int column=0; column< 3 ;column++){
                System.out.println(color[row][column]);
            }
        }

    }
}
