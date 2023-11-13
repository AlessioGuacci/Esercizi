package Exercise7;

public class Triangolo extends Forma{

    private double height;
    private double base;

    Triangolo(double height, double base){
        this.height= height;
        this.base= base;
    }

    @Override
    double calcolaArea() {
        return ((height*base)/2);
    }
}
