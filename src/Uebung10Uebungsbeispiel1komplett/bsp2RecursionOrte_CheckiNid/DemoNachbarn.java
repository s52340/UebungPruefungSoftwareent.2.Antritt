package Uebung10Uebungsbeispiel1komplett.bsp2RecursionOrte_CheckiNid;

public class DemoNachbarn {
    public static void main(String[] args) {

        Ort graz = new Ort("graz");
        Ort wien = new Ort("wien");
        Ort marbur = new Ort("marburg");
        Ort linz = new Ort("linz");

        Ort rotti = new Ort("rotti");

        graz.addNachbar(marbur);
        graz.addNachbar(wien);

        wien.addNachbar(linz);

        linz.addNachbar(graz);
        marbur.addNachbar(graz);
        wien.addNachbar(graz);
        linz.addNachbar(wien);

        rotti.addNachbar(graz);
        linz.addNachbar(rotti);


        System.out.println("hasCircle(graz) = " + hasCircle(marbur));
        /*    Code von Lehrer - geht nicht mit einem zusätzlichem Ort.
        rotti.addNachbar(graz);
        linz.addNachbar(rotti);
        System.out.println(hasCircle(rotti));
        */
    }

    public static boolean hasCircle(Ort ort){
       return hasCircle(ort, ort, null);
    }
    public static boolean hasCircle(Ort start, Ort current, Ort previous) {

        for (Ort n : current.getNachbarn()) {
            if (n == previous) {
                return false;
            }

            if (n == start) {
                // Ich bin hier wieder am Startknoten
                return true;
            }
            else {
                /*boolean result = hasCircle(start, n, current);
                if (result)
                    return true;
                */
                if (hasCircle(start, n, current))
                    return true;
            }
        }
        return false;
    }

}
