package Uebung12Dokumentenverwaltung;

import java.util.ArrayList;

public class DocumentDemo {
    public static void main(String[] args) {

        ArrayList<String> linien = new ArrayList<>();

        TextDocument textDoc = new TextDocument("Note.txt", "Lorem ipsum dolor");
        ImageDocument imageDoc = new ImageDocument("Picture.img", 20,15,"blue");
        CsvDocument csvDoc = new CsvDocument("NoIdea.csv", linien);

        csvDoc.addLine("Linie1");
        csvDoc.addLine("Linie2");


        textDoc.printDocument();
        imageDoc.printDocument();
        csvDoc.printDocument();

        PrintManager printManager = new PrintManager();
        printManager.addDocument(textDoc);
        printManager.addDocument(imageDoc);
        printManager.addDocument(csvDoc);

        System.out.println();
        printManager.printAll();
        System.out.println();
        printManager.findDocument("Picture.img").printDocument();
        printManager.findDocument("NoIdea.csv").printDocument();
    }
}
