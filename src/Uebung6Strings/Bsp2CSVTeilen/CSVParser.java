package Uebung6Strings.Bsp2CSVTeilen;

public class CSVParser {
    private String csvline;


    public CSVParser(String csvline) { this.csvline = csvline;}

    public int countComma(){
        int anzahlBeistriche = 0;
        for (int i = 0; i < this.csvline.length(); i++) {
            char c = csvline.charAt(i);
            if (c == ','){
                anzahlBeistriche += 1;
            }
        }
        return anzahlBeistriche;
    }
    //Sp1,Sp2,Sp3,  0, 1, 2
    public String[] parse(){
        String parsed = "";
        String[] arr = new String[countComma() + 1];
        int counter = 0;
        for (int i = 0; i < csvline.length(); i++) {
            char c = csvline.charAt(i);
            parsed = parsed + c ;
            if (csvline.charAt(i) == ','){
                counter ++;
                parsed = "";
            }
            arr[counter] = parsed;
        }
        return arr;
    }

}
