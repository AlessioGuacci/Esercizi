package Exercise6;

import Esercizio5.Forma;

public class Triangolo extends Forma {
    private double height;
    private double base;

    public double calcolaArea(double height, double base){
        double area = ((height * base)/2);
        return area;
    }
}
