package Uebung10Uebungsbeispiel1komplett.bsp3Payment;

public abstract class Payment {
    private double amount;   //Betrag
    private String currency;  //Währung


    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract double calcTransactionCosts();

    public double exchangeToEUR(){
        // 1.1 $ = 1€
        switch (currency){
            case "USD":
                 amount = amount / 1.1;
                 break;
            case "GBP":
                amount = amount / 0.85;
                break;
            case "SEK":
                 amount = amount/ 9.5;                   // oder?? return amount / 9.5; ohne break?
                break;
            case "HUF":
                amount= amount/ 310;
                break;
            default: return amount/ 2;

        }
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
