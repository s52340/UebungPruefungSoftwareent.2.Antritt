package Uebung10Uebungsbeispiel1komplett.bsp3Payment;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> payments = new ArrayList<>();


    public void add(Payment p){
        payments.add(p);
    }

    public double totalTransactionCosts(){
        double totalTransCosts = 0.0;
        for (int i = 0; i < payments.size(); i++) {
            totalTransCosts = totalTransCosts + payments.get(i).calcTransactionCosts();
        }
        return totalTransCosts;
    }

    /*
    * Implementieren Sie eine Methode public HashMap<String, Double> getPaymentsPerCurrency(),
    * welche je Currency die Anzahl der Transaktionen zurückliefert.
    * */
    public HashMap<String, Double> getPaymentsPerCurrency(){
        HashMap<String, Double> paymentPerCurrency = new HashMap<>();
        Double count = 1.0;
        for (int i = 0; i < payments.size(); i++) {
            if (paymentPerCurrency.containsKey(payments.get(i).getCurrency())){
                paymentPerCurrency.clear();
                count = count + 1.0;
                paymentPerCurrency.put(payments.get(i).getCurrency(), count);
            }
            else {
                paymentPerCurrency.put(payments.get(i).getCurrency(), count);
            }

        }
        return paymentPerCurrency;
    }
}
