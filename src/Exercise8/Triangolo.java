package Exercise8;

public class Triangolo implements Forma{

    public double height;
    public double base;


    @Override
    public void calcolaArea(double height, double base) {
        this.height=height;
        this.base=base;
        double area = ((height*base)/2);
        System.out.println(area);

    }
}
