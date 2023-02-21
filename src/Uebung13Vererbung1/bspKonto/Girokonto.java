package Uebung13Vererbung1.bspKonto;

public class Girokonto extends Konto{
    private double limit;

    public Girokonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void auszahlen(double wert) {
        if ( getKontostand() - wert < 0 - limit){
            System.out.println("Der Wert übersteigt das Limit - Auszahlung ist nicht möglich");
        }
        else {
        super.auszahlen(wert);
        }
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }
}
