package Exercise9;

public class Rettangolo extends Forma{


    public Rettangolo() {
        super(TipoForma.RETTANGOLO);
    }

    @Override
    double calcolaArea(double length, double width) {
        return length*width;
    }
}
