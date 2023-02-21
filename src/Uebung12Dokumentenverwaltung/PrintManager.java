package Uebung12Dokumentenverwaltung;

import java.util.ArrayList;

public class PrintManager {
    ArrayList<Document> documents = new ArrayList<>();

    public void addDocument(Document d){
        documents.add(d);
    }
    public void printAll(){
        for (int i = 0; i < documents.size(); i++) {
            documents.get(i).printDocument();
        }
    }

    public Document findDocument(String fileName){
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).fileName.equals(fileName)){
                return documents.get(i);
            }
        }
        return null;
    }
}
