package Esercizio5;

public class Rettangolo extends Forma {

    private double length;
    private double width;
    @Override
    public double calcolaArea(double length, double width){
        this.length=length;
        this.width=width;
        double area= length * width;
        return area;
    }
}
