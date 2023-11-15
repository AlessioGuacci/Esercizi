package Exercise9;

public class Triangolo extends Forma {

    public Triangolo() {
        super(TipoForma.TRIANGOLO);
    }

    @Override
    double calcolaArea(double base, double height) {
        return (base*height)/2;
    }
}
