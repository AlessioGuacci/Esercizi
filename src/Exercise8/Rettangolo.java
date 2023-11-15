package Exercise8;

public class Rettangolo implements Forma {

    public double length;
    public double width;

    @Override
    public double calcolaArea(double length, double width) {
    this.length= length;
    this.width= width;
        return length*width;
    }
}
