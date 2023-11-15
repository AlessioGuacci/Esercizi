package Exercise9;

public class Main {

    public static void main (String [] Args){

        Rettangolo rettangolo = new Rettangolo();
        System.out.println(rettangolo.calcolaArea(7,9));
        System.out.println(rettangolo.getTipo());

        Triangolo triangolo = new Triangolo();
        System.out.println(triangolo.calcolaArea(10,12));
        System.out.println(triangolo.getTipo());

    }
}


