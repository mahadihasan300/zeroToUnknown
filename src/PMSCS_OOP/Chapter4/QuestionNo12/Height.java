package PMSCS_OOP.Chapter4.QuestionNo12;

public class Height {
    private int age;
    private double height;
    private double recommendedWeight;

    public void calculate(int age, double height){
        recommendedWeight = (height - 100 + age / 10) * 0.90;

    }

    public double getrecommendedWeight (){
        return recommendedWeight;
    }
}
