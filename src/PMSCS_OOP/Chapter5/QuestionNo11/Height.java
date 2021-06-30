package PMSCS_OOP.Chapter5.QuestionNo11;

public class Height {
    private int age;
    private double height;
    private double recommendedWeight;

    public double calculate(int age, double height){
        recommendedWeight = (height - 100 + age / 10) * 0.90;

        return recommendedWeight;
    }

    public double getrecommendedWeight (){
        return recommendedWeight;
    }
}
