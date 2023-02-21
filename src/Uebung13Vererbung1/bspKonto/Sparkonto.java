package Uebung13Vererbung1.bspKonto;

public class Sparkonto extends Konto {
    public Sparkonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public void auszahlen(double wert) {
        if (wert > getKontostand()){
            System.out.println("Diese Auszahlung ist nicht möglich da es Ihren Kontostand übersteigt!");
        }
        else {
            super.auszahlen(wert);
        }
    }
}
