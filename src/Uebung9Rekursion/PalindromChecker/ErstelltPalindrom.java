package Uebung9Rekursion.PalindromChecker;

public class ErstelltPalindrom {

    public static void main(String[] args) {
        System.out.println(erstelltPalindrom("ren"));

    }

    // Ren    ner
    public static String erstelltPalindrom(String a){    // ren      // en   //n
        //Abbruchbestimmung
        if (a.length() == 1){      // 3     // 2  //1
            return a + a;                         //n+n
        }
        else {
            Character c = a.charAt(0);    //r                 // e
            a = a.substring(1); // en              //n
            String kleineresPalindrom = erstelltPalindrom(a);          //1.Aufruf enne           2.Aufruf // nn
            // return c[xxx...xxx]c
            return c + kleineresPalindrom + c;                         // renner            //enne
        }

    } //Zeile 6    // Zeile 19  // Zeile 19
}
