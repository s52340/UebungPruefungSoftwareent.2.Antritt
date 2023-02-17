package Uebung8Collektions.Pegel_Verwaltung;

import java.util.ArrayList;

public class PegelDemo {
    public static void main(String[] args) {


        Wasserstand w1 = new Wasserstand(1, "Mur", 2.3, 5.5, 123, "Graz");
        Wasserstand w2 = new Wasserstand(2, "Donau", 6.2, 6.0, 123, "Wien");
        Wasserstand w3 = new Wasserstand(3, "Mur", 4.5, 5.5, 234, "Graz");
        Wasserstand w4 = new Wasserstand(4, "Mur", 4.2, 5.5, 345, "Graz");
        Wasserstand w5 = new Wasserstand(5, "Mur", 4.0, 5.5, 234, "Leibnitz");
        Wasserstand w6 = new Wasserstand(6, "Mur", 5.5, 5.5, 129, "Graz");

        System.out.println(w3);
        System.out.println(w3.toString());


        WasserstandManager wasserstandManager = new WasserstandManager();
        wasserstandManager.add(w1);
        wasserstandManager.add(w2);
        wasserstandManager.add(w3);
        wasserstandManager.add(w4);
        wasserstandManager.add(w5);
        wasserstandManager.add(w6);

        System.out.println();
        System.out.println(wasserstandManager.findById(2));
        System.out.println(wasserstandManager.findAllByGewasser("Mur"));
        System.out.println(wasserstandManager.findLastWasserstand("Mur"));
        System.out.println(wasserstandManager.findForAlarmierung());
        System.out.println();
        System.out.println(wasserstandManager.calcMittlererWasserstand("Mur","Graz"));
        System.out.println(wasserstandManager.findByZeitpunkt(123, 234, "Mur", "Graz"));






    }
}
