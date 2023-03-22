package Altklausur070122.oop;

import java.util.ArrayList;

public class AverageOperation extends CalculatorOperation{
    private ArrayList<Integer> listOfValue = new ArrayList<>();
    private double result;

    public AverageOperation(String name, ArrayList<Integer> listOfValue) {
        super(name);
        this.listOfValue = listOfValue;
    }

    public void add(int value){
        listOfValue.add(value);
    }

    @Override
    public void doCalculation() {
        int anzahlZahlen = 0;
        int summe = 0;
        for (int i = 0; i < listOfValue.size(); i++) {
            summe = summe + listOfValue.get(i);
            anzahlZahlen ++;
        }
        result = summe / anzahlZahlen;
    }

    @Override
    public void printResult() {
        System.out.println("Der Durchschnitt beträgt" + result);
    }
}
