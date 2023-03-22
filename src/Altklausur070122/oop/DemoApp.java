package Altklausur070122.oop;

import java.util.ArrayList;

public class DemoApp {
    public static void main(String[] args) {

        String sum = "summieren";
        String fact = "factorisieren";
        String aver = "durchschnitt";

        SummationOperation summationOperation = new SummationOperation(sum,4,5);
        summationOperation.doCalculation();
        summationOperation.printResult();

        FactorialOperation factorialOperation = new FactorialOperation(fact, 5);
        factorialOperation.doCalculation();
        factorialOperation.printResult();

        AverageOperation averageOperation = new AverageOperation(aver, new ArrayList<>());
        averageOperation.add(6);
        averageOperation.add(2);
        averageOperation.add(4);

        averageOperation.doCalculation();
        averageOperation.printResult();


    }
}
