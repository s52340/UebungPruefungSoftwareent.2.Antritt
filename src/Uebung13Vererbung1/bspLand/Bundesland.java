package Uebung13Vererbung1.bspLand;

public class Bundesland extends Land {
    private double bruttoSozialProdukt;

    public Bundesland(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    @Override
    public double getBruttoSozialProduct() {
        return bruttoSozialProdukt;
    }
}
