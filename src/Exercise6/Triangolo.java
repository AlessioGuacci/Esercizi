package Exercise6;

public class Triangolo extends Forma {
    void calcolaArea(){
        double base = 7;
        double altezza= 8;
        double area = (base * altezza)/2;
        System.out.println("the area of the triangle is " + area);
    }
}
