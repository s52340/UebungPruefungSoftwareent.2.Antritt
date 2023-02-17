package Uebung8Collektions.Pegel_Verwaltung;

import java.util.ArrayList;

public class WasserstandManager {
    private  ArrayList<Wasserstand> wasserstaende = new ArrayList<>();

    public void add(Wasserstand wasserstand){
        wasserstaende.add(wasserstand);
    }
    
    public Wasserstand findById(int id){
        for (int i = 0; i < wasserstaende.size(); i++) {
            if (wasserstaende.get(i).getId() == id){
                return wasserstaende.get(i);
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewasser(String gewaesser){
        ArrayList<Wasserstand> allGewaesser = new ArrayList<>();
        for (int i = 0; i < wasserstaende.size(); i++) {
            if (wasserstaende.get(i).getGewaesserName().equals(gewaesser)){
                allGewaesser.add(wasserstaende.get(i));
            }
        }
        return allGewaesser;
    }


    public Wasserstand findLastWasserstand(String gewaesserName){
        ArrayList<Wasserstand> lastWasserstand = new ArrayList<>();
        for (int i = 0; i < wasserstaende.size(); i++) {
            if (wasserstaende.get(i).getGewaesserName() == gewaesserName){
                lastWasserstand.add(wasserstaende.get(i));
                if (wasserstaende.get(i).getZeitpunkt() > lastWasserstand.get(0).getZeitpunkt()){
                    lastWasserstand.clear();
                    lastWasserstand.add(wasserstaende.get(i));
                }
            }

        }
        return lastWasserstand.get(0);
    }

    public ArrayList<Wasserstand> findForAlarmierung(){
     ArrayList<Wasserstand> alarmierung = new ArrayList<>();
        for (int i = 0; i < wasserstaende.size(); i++) {
            if (wasserstaende.get(i).getMessWert() >= wasserstaende.get(i).getMessWertFuerAlarmierung()){
                alarmierung.add(wasserstaende.get(i));
            }
        }
        return alarmierung;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort){
        double wasserstandDouble = 0;
        int count = 0;
        for (int i = 0; i < wasserstaende.size(); i++) {
            if (wasserstaende.get(i).getGewaesserName().equals(gewaesserName) &&
                    wasserstaende.get(i).getOrt().equals(ort)){
                count += 1;
               wasserstandDouble += wasserstaende.get(i).getMessWert();
            }
        }
        wasserstandDouble = wasserstandDouble / count;
        return wasserstandDouble;
    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaesserName, String ort){
        ArrayList<Wasserstand> wasserstandZeitpunkt = new ArrayList<>();
        for (int i = 0; i < wasserstaende.size(); i++) {
            if (wasserstaende.get(i).getGewaesserName().equals(gewaesserName) &&
            wasserstaende.get(i).getOrt().equals(ort) &&
                    wasserstaende.get(i).getZeitpunkt() >= von &&
            wasserstaende.get(i).getZeitpunkt() <= bis){
                wasserstandZeitpunkt.add(wasserstaende.get(i));
            }
        }
        return wasserstandZeitpunkt;
    }
}
