package Uebung10Uebungsbeispiel1komplett.bsp3Payment;

public class PayDemo {
    public static void main(String[] args) {

        PaymentJournal paymentJournal = new PaymentJournal();

        CreditCardPayment creditCardPOne = new CreditCardPayment(22.4, "USD", "1234", "232");
        CashPayment cashPOneMitName = new CashPayment("Nadine", 30.5, "USD");
        CashPayment cashPTwoOhneName = new CashPayment(15.7,"USD");
        MaestroPayment maestroPOne = new MaestroPayment("6789", 45.6, "USD");
        MaestroPayment maestroPTwo = new MaestroPayment("4567", 56.7, "GBP");

        paymentJournal.add(creditCardPOne);
        paymentJournal.add(cashPOneMitName);
        paymentJournal.add(cashPTwoOhneName);
        paymentJournal.add(maestroPOne);
        paymentJournal.add(maestroPTwo);

        System.out.println(paymentJournal.totalTransactionCosts());
        System.out.println(paymentJournal.getPaymentsPerCurrency());

    }
}
