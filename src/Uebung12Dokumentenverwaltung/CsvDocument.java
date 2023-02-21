package Uebung12Dokumentenverwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document{
    private ArrayList<String> lines;

    public CsvDocument(String fileName, ArrayList<String> lines) {
        super(fileName);
        this.lines = lines;
    }

    @Override
    public void printDocument() {
        System.out.println("CsvDocument: " + fileName + " ->> " +lines.size() + " " + lines );
    }

    public void addLine(String line){
        lines.add(line);
    }
}
