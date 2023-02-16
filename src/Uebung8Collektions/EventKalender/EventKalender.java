package Uebung8Collektions.EventKalender;

import java.util.ArrayList;
import java.util.List;

public class EventKalender {

    private ArrayList<Event> events = new ArrayList();

   public void add( Event event){
       events.add(event);
   }

   public Event getByTitle(String title){
       for (int i = 0; i < events.size(); i++) {
           if (title == events.get(i).getTitle()){
               return events.get(i);
           }
       }
       return null;
   }

   public ArrayList<Event> getByOrt(String ort){
       ArrayList<Event> eventsByOrt = new ArrayList<>();
       for (int i = 0; i < events.size(); i++) {
           if (ort == events.get(i).getOrt())
               eventsByOrt.add(events.get(i));
       }
       return eventsByOrt;
   }

   public ArrayList<Event> getByEintrittsPreis(double min, double max){
       ArrayList<Event> eventsByEintritt = new ArrayList<>();
       for (int i = 0; i < events.size(); i++) {
           if (events.get(i).getEintrittspreis() == max ||
           events.get(i).getEintrittspreis() == min ||
           events.get(i).getEintrittspreis() < max && events.get(i).getEintrittspreis() > min){
               eventsByEintritt.add(events.get(i));
           }
       }
       return eventsByEintritt;
   }

   public ArrayList<Event> getMostExpensiveByOrt(String ort){
       ArrayList<Event> eventsMostExpensive = new ArrayList<>();
       for (int i = 0; i < events.size(); i++) {
           if (events.get(i).getOrt() == ort){
               eventsMostExpensive.add(events.get(i));
           }
       }
       for (int i = 0; i < eventsMostExpensive.size() - 1;) {
           if (eventsMostExpensive.get(i).getEintrittspreis() < eventsMostExpensive.get(i + 1).getEintrittspreis()){
            eventsMostExpensive.remove(eventsMostExpensive.get(i));
           } else {
               eventsMostExpensive.remove(eventsMostExpensive.get(i + 1));
           }
       }
       return eventsMostExpensive;
   }

   public double getAvgPreisByOrt(String ort){
       double avgPreis = 0.0;
       ArrayList<Event> eventsByOrt = new ArrayList<>();
       for (int i = 0; i < events.size(); i++) {
           if (events.get(i).getOrt() == ort){
              avgPreis += events.get(i).getEintrittspreis();
              eventsByOrt.add(events.get(i));
           }
       }
       double anzahlVeranstaltungenProOrt = eventsByOrt.size();
       avgPreis = avgPreis / anzahlVeranstaltungenProOrt;
       return avgPreis;
   }
}

