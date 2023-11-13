package Exercise7;

public class Main {
    public static void main (String [] Args) {
        Rettangolo rettangolo = new Rettangolo(7, 4);
        System.out.println("the area of the Rettangolo is " + rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(12, 6);
        System.out.println("the area of the Triangolo is "+ triangolo.calcolaArea());
    }
}
