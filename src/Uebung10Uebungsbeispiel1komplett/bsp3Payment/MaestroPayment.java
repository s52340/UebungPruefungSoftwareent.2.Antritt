package Uebung10Uebungsbeispiel1komplett.bsp3Payment;

public class MaestroPayment extends Payment {

    private String cardNumber;


    public MaestroPayment(String cardNumber, double amount, String currency) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public double calcTransactionCosts() {
        double transCostsMeastro = 0.0;
        transCostsMeastro = transCostsMeastro + super.getAmount();
        transCostsMeastro = super.exchangeToEUR();
        transCostsMeastro = transCostsMeastro * 0.0075;
        if (transCostsMeastro < 0.95){
            transCostsMeastro = 0.95;
        }
        return transCostsMeastro;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "cardNumber='" + cardNumber + '\'' +
                ", Amount= " + getAmount() +
                ", Currency= " + getCurrency() +
                ", TransactionCosts= " + calcTransactionCosts() +
                '}';
    }
}

