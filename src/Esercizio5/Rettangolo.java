package Esercizio5;

public class Rettangolo extends Forma {

    private double length;
    private double width;
    @Override
    void calcolaArea(double length, double width){
        this.length=length;
        this.width=width;
        double area= length * width;
        System.out.println(area);
    }
}
