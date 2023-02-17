package Uebung8Collektions.Pegel_Verwaltung;

public class Wasserstand {
    private int id;
    private String gewaesserName;
    private double messWert;
    private double messWertFuerAlarmierung;
    private int zeitpunkt; //Sekunden seit 1.1.1970

    private String ort;

    public Wasserstand(int id, String gewaesserName, double messWert, double messWertFuerAlarmierung, int zeitpunkt, String ort) {
        this.id = id;
        this.gewaesserName = gewaesserName;
        this.messWert = messWert;
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
        this.zeitpunkt = zeitpunkt;
        this.ort = ort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarmierung() {
        return messWertFuerAlarmierung;
    }

    public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarmierung=" + messWertFuerAlarmierung +
                ", zeitpunkt=" + zeitpunkt +
                ", ort='" + ort + '\'' +
                '}';
    }
}
