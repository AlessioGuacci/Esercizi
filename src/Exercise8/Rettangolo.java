package Exercise8;

public class Rettangolo implements Forma {

    public double length;
    public double width;

    @Override
    public void calcolaArea(double length, double width) {
    this.length= length;
    this.width= width;
    double area= length*width;
        System.out.println(area);
    }
}
