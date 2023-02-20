package Uebung10Uebungsbeispiel1komplett.bsp3Payment;

public class CashPayment extends  Payment{

    private String name;

    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }

    //2.Konstruktor  ??? wozu?
    public CashPayment(String name, double amount, String currency) {
        super(amount, currency);
        this.name = name;
    }

    @Override
    public double calcTransactionCosts() {
        double transCostsCash = 0.0;
        if (CashPayment.this.name == name){             // sehr warscheinlich Falsch??
            transCostsCash = getAmount();
        }
        else {
            transCostsCash = getAmount() - 2;  //minus 2 Euro - vorher umwandlen? keine Transaktionskosten
        }
        return transCostsCash;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                ", Amount=  " + getAmount() +
                ", Currency= " + getCurrency() +
                ", TransactionCosts= " + calcTransactionCosts() +
                '}';
    }
}
