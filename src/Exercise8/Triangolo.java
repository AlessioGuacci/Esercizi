package Exercise8;

public class Triangolo implements Forma{

    public double height;
    public double base;


    @Override
    public double calcolaArea(double height, double base) {
        this.height=height;
        this.base=base;
        return ((height*base)/2);

    }
}
