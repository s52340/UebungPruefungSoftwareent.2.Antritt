package Uebung10Uebungsbeispiel1komplett.bsp3Payment;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String securityNumber;


    public CreditCardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }

    @Override
    public double calcTransactionCosts() {
        double transCosts = 0.0;
        if (!super.getCurrency().equals("EUR")){      // !=
            transCosts = 1.5 + exchangeToEUR() * 0.0275;
        }
        else if (getCurrency().equals("EUR")){
            transCosts = 0.5 + super.getAmount() * 0.011;
        }
        return transCosts;
    }


    @Override
    public String toString() {
        return "[CreditCardPayment, " +
                "CardNumber='" + cardNumber + '\'' +
                ", securityCode='" + securityNumber + '\'' +
                ", Amount= " + getAmount() + '\'' +
                ", Currency= " + getCurrency() + '\''+
                ", TransactionsCosts= " + calcTransactionCosts() +
                ']';
    }
}
