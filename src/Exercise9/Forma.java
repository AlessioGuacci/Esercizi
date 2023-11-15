package Exercise9;


enum TipoForma{TRIANGOLO, RETTANGOLO;}
public class Forma {

    private TipoForma tipo;

    public Forma (TipoForma tipo){
        this.tipo=tipo;
    }

    public TipoForma getTipo() {
        return tipo;
    }
    double calcolaArea(double a, double b){
        return 0;
    }
}
