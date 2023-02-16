package Uebung8Collektions.EventKalender;

public class EventDemo {
    public static void main(String[] args) {

        Event w_ball = new Event("Weihnachtsball", "Graz", 20.05);
        Event o_ball = new Event("Opernball", "Wien", 2100.21);
        Event m_ball = new Event("Maturaball", "Liezen", 16.90);
        Event f_ball = new Event("Faschingsball", "Liezen", 5.55);
        Event h_ball = new Event("Halloweenball", "Liezen", 29.99);

        EventKalender eventKalender = new EventKalender();
        eventKalender.add(w_ball);
        eventKalender.add(o_ball);
        eventKalender.add(m_ball);
        eventKalender.add(f_ball);
        eventKalender.add(h_ball);

        System.out.println(eventKalender.getByTitle("Opernball"));
        System.out.println(eventKalender.getByTitle("Weihnachtsball"));
        //System.out.println(eventKalender.getByTitle("Osterball"));
        System.out.println(eventKalender.getByOrt("Liezen"));
        System.out.println(eventKalender.getByOrt("Wien"));
        //System.out.println(eventKalender.getByOrt("Rottenmann"));

        System.out.println();
        System.out.println("Events mit Eintrittspreise von 5.55 bis 22.00€ sind: " + eventKalender.getByEintrittsPreis(5.55, 22.00));

        System.out.println("Die Teuerste Veranstaltung in Liezen ist: " +
                eventKalender.getMostExpensiveByOrt("Liezen"));
        System.out.println("Der Durchschnittspreis der Veranstaltungen in Liezen beträgt: " +
                eventKalender.getAvgPreisByOrt("Liezen"));



    }
}
