package Uebung13Vererbung1.bspKonto;

public class Konto {
    private String inhaber;
    private double kontostand;


    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public void einzahlen(double wert){
        kontostand = kontostand + wert;
    }
    public void auszahlen(double wert){
            kontostand = kontostand - wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }
}
