package Esercizio5;

public class Forma {

    //onestamente non so che valori dare alla forma e quindi visto che il metodo tradizionale
    //per trovare larea e questa la lascio cosi. potevo anche stampare una frase per dimostrae meglio il overdirve
     double length;
     double width;
    public double calcolaArea(double length, double width){
        this.length= length;
        this.width= width;
        double area= length * width;
        return area;
    }
}
