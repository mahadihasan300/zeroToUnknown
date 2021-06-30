package PMSCS_OOP.Chapter4.QuestionNo06;

import java.util.Scanner;

public class QuestionNo06 {
    public static class TicketModel {

        private int soldNumber;
        private int price;

        public TicketModel() {
        }

        public TicketModel(int soldNumber, int price) {
            this.soldNumber = soldNumber;
            this.price = price;
        }

        public int getSoldNumber() {
            return soldNumber;
        }

        public void setSoldNumber(int soldNumber) {
            this.soldNumber = soldNumber;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {

        TicketModel typeA = new TicketModel();
        TicketModel typeB = new TicketModel();
        TicketModel typeC = new TicketModel();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sold ticket number for type A");
        typeA.setSoldNumber(scanner.nextInt());
        System.out.println("Enter the ticket price for type A");
        typeA.setPrice(scanner.nextInt());

        System.out.println("Enter the sold ticket number for type B");
        typeB.setSoldNumber(scanner.nextInt());
        System.out.println("Enter the ticket price for type B");
        typeB.setPrice(scanner.nextInt());

        System.out.println("Enter the sold ticket number for type C");
        typeC.setSoldNumber(scanner.nextInt());
        System.out.println("Enter the ticket price for type A");
        typeC.setPrice(scanner.nextInt());

        System.out.print("Total sales is : ");
        int totalSales = typeA.getSoldNumber() * typeA.getPrice() +
                typeB.getSoldNumber() * typeB.getPrice() +
                typeC.getSoldNumber() * typeC.getPrice();

        System.out.println(totalSales);

    }
}
