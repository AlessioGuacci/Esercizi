package Exercise6;

import Esercizio5.Forma;

public class Triangolo extends Forma {
    private double height;
    private double base;

    void calcolaArea(double height, double base){
        double area = ((height * base)/2);
        System.out.println(area);
    }
}
