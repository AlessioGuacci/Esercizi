package Esercizio5;

public class main {
    public static void main (String[] args){
        Rettangolo rettangolo= new Rettangolo();
        Forma forma = new Forma();

        System.out.println(forma.calcolaArea(2,6));
        System.out.println(rettangolo.calcolaArea(7,8));
    }
}
//potrebbe essere piu pulito ma devo andare avanti