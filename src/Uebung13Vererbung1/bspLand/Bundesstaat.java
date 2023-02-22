package Uebung13Vererbung1.bspLand;


import java.util.ArrayList;

public class Bundesstaat extends Land{

    private ArrayList<Land> laender = new ArrayList<>();

    public Bundesstaat() {
    }

    public void addLand(Land a){
        laender.add(a);
    }

    @Override
    public double getBruttoSozialProduct() {
        double gesammtBSP = 0.0;
        for (int i = 0; i < laender.size(); i++) {
           gesammtBSP = gesammtBSP + laender.get(i).getBruttoSozialProduct();
        }
        return gesammtBSP;
    }
}
