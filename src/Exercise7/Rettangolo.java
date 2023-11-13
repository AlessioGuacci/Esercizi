package Exercise7;

public class Rettangolo extends Forma{


    private double length;
    private double width;

    Rettangolo(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double calcolaArea() {
    return length*width;
    }
}
