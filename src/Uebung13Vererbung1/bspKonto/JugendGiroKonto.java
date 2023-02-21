package Uebung13Vererbung1.bspKonto;

public class JugendGiroKonto extends Girokonto{

    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public void auszahlen(double wert) {
        if (wert > buchungslimit){
            System.out.println("Der Wert übersteigt das Buchungslimit - Auszahlung nicht möglich");
        }
        else {
            super.auszahlen(wert);
        }
    }
}
