package Uebung13Vererbung1.bspLand;

public class LandDemo {
    public static void main(String[] args) {
      Bundesland stmk = new Bundesland(51.7);
      Bundesland wien = new Bundesland( 102.6);
      Bundesland ooe = new Bundesland(65.85);

      Bundesstaat oesterrich = new Bundesstaat();
      oesterrich.addLand(stmk);
      oesterrich.addLand(wien);
      oesterrich.addLand(ooe);

        System.out.println(oesterrich.getBruttoSozialProduct());

    }
}
