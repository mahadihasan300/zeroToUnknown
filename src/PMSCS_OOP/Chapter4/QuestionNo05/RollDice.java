package PMSCS_OOP.Chapter4.QuestionNo05;

public class RollDice {

    public static void main(String[] args) {

        Die one;
        one = new Die( );

        one.roll();
        one.roll();
        one.roll();

        System.out.println("Results are " + one.getNumber( ) + " " +
                one.getNumber( ) + " " +
                one.getNumber());
    }

}
