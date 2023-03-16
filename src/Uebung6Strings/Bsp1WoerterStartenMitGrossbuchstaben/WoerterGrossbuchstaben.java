package Uebung6Strings.Bsp1WoerterStartenMitGrossbuchstaben;

import java.util.Arrays;

import static java.lang.Character.isLetter;

public class WoerterGrossbuchstaben {

    public static void main(String[] args) {
        /*
         *Ausgangssituation: „Wörter starten mit Großbuchstaben“
         *Ergebnis: „Wörter Starten Mit Großbuchstaben“
         * */

        String ausgangssituation = " wörter starten mit großbuchstaben";


        System.out.println(wordsStartingWithUpperLetter(ausgangssituation));

        System.out.println();

        wordsStartWithUpperLettersPerArray(ausgangssituation);



    }

    //BESTE Lösung:
    public static String wordsStartingWithUpperLetter(String anfang) {
        String ergebnis = "";

        for (int i = 0; i < anfang.length(); i++) {
            char c = anfang.charAt(i);
            if (i == 0 || anfang.charAt(i -1) == ' '){
                c = Character.toUpperCase(c);
            }
            ergebnis = ergebnis + c;
        }

        return ergebnis;
    }

    //Lösung über Array - funktioniert aber schlecht:
    private static void wordsStartWithUpperLettersPerArray(String ausgangssituation) {
        Character[] characters = new Character[ausgangssituation.length()];
        for (int i = 0; i < ausgangssituation.length(); i++) {

            characters[i] = ausgangssituation.charAt(i);
        }
        System.out.println(Arrays.toString(characters));

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ' '){
                characters[i +1] = Character.toUpperCase(characters[i+1]);
            }
        }

        System.out.println(Arrays.toString(characters));

        String ende = "";
        for (int i = 0; i < characters.length; i++) {
            ende = ende + characters[i].charValue();
        }
        System.out.println(ende);
    }


    //Überarbeiten, funktioniert noch nicht
    private static String wordsUpperLetter(String anfang) {
        String ende = anfang;
        for (int i = 0; i < anfang.length()-1; i++) {
            char l = ' ';
            if (anfang.charAt(i) == l){
               //char a= anfang.charAt(i+1);
               //Character.toUpperCase(a);
               //Character.toUpperCase(a);
               // ende.charAt(i + 1) = a;
              //  anfang.charAt(i +1 ) = Character.toUpperCase(anfang.charAt(i+1));
            }
        }
        return anfang;
    }

}
