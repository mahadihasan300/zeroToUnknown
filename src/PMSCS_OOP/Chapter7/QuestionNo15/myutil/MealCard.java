package PMSCS_OOP.Chapter7.QuestionNo15.myutil;

public class MealCard {

    private String name;
    private double initialPoint;
    private double currentPoint;
    private double point;

    public MealCard() {
        currentPoint = 0.0;
        initialPoint = 100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialPoint() {
        return initialPoint;
    }

    public void setInitialPoint(double initialPoint) {
        this.initialPoint = initialPoint;
    }

    public double getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(double currentPoint) {
        this.currentPoint = currentPoint;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double purchasePoint(double a){
        currentPoint = initialPoint + a;
        return currentPoint;
    }

    public double foodPurchase (double cost){
        if(currentPoint <= 0){
            System.out.println("Insufficient point");
        }else if (currentPoint - cost < 0){
            System.out.println("Insufficient point");
        }else {
            currentPoint = currentPoint - cost;
            System.out.println("Purchase Successful");
        }
        System.out.print("Current available point is : ");
        return currentPoint;

    }
}
