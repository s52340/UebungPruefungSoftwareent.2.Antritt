package Uebung13Vererbung1.bspKonto;

public class KontoDemo {
    public static void main(String[] args) {
        Konto konto = new Konto("Andi");
        konto.auszahlen(1400);
        konto.einzahlen(100);
        System.out.println("Kontostand "+ konto.getInhaber()+ ": " + konto.getKontostand());

        Girokonto girokonto = new Girokonto("Bianca", 100);
        girokonto.einzahlen(30);
        System.out.println(girokonto.getKontostand());
        girokonto.auszahlen(70);
        girokonto.auszahlen(70);
        System.out.println(girokonto.getKontostand());
        girokonto.einzahlen(200);
        girokonto.auszahlen(260);
        System.out.println("Konotostand "+ girokonto.getInhaber() + ": "+ girokonto.getKontostand());


        JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("Lukas", 100, 50);
        jugendGiroKonto.einzahlen(10);
        System.out.println(jugendGiroKonto.getKontostand());
        jugendGiroKonto.auszahlen(50);
        jugendGiroKonto.auszahlen(50);
        jugendGiroKonto.auszahlen(30);
        System.out.println("Kontostand " + jugendGiroKonto.getInhaber()+ ": " + jugendGiroKonto.getKontostand());

        Sparkonto sparkonto = new Sparkonto("Theresa");
        sparkonto.einzahlen(100);
        sparkonto.auszahlen(103);
        System.out.println(sparkonto.getInhaber() + ": "+ sparkonto.getKontostand());

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        /**
         * Testen Sie folgenden Use Case:
         * Erstellen Sie ein Objekt vom JugendGiroKonto und casten Sie dieses in ein Konto.
         * Rufen die Methoden einzahlen(…) und auszahlen(…) auf.
         * Casten Se dieses Objekt nun in ein GiroKonto und testen Sie wieder beide Methoden.
         */
        JugendGiroKonto ju = new JugendGiroKonto("Verena", 100, 50);
        Konto ko = ju;
        ko.einzahlen(10);
        System.out.println("Konto ko: " + ko.getKontostand());
        ko.auszahlen(50);
        ko.auszahlen(50);
        ko.auszahlen(50);
        System.out.println("Konto ko: " + ko.getKontostand());
        System.out.println(ko.getClass());

        System.out.println("--gk--");

        Girokonto gk = (Girokonto) ko;
        gk.einzahlen(90);
        System.out.println("Konto gk: " + gk.getKontostand());
        gk.auszahlen(50);
        gk.auszahlen(40);
        gk.auszahlen(30);
        System.out.println("Konto gk: " + gk.getKontostand());

    }
}
