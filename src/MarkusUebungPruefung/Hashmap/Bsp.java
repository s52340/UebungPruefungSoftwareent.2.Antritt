package MarkusUebungPruefung.Hashmap;

import java.util.HashMap;

public class Bsp {
    public static void main(String[] args) {

        HashMap<String, Integer> objektCounter = new HashMap<>();
        objektCounter.put("Bälle", 3);
        objektCounter.put("Schlüssel",2);
        objektCounter.put("Münzen",137);

        Integer baelle = objektCounter.get("Bälle");
        objektCounter.put("Bälle", baelle + 1);



    }
}
