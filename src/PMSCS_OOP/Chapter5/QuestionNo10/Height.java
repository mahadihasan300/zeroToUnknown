package PMSCS_OOP.Chapter5.QuestionNo10;

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
