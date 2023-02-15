package ibanBsp;

public class IbanValidationService {
    private String iban;
    private int calculatedCheckSum;

    public IbanValidationService(String iban) {
        this.iban = iban;
        this.calculatedCheckSum = -1;
    }

    public String getCountryCode(){
        String laenderCode = iban.substring(0,2);  //substring Position 0,1 (exklusive end index)
        return laenderCode;
    }
    public int getCheckSum(){
        String checkSumString = iban.substring(2,4);
        int ceckSumInt = Integer.valueOf(checkSumString);
        return ceckSumInt;
    }
    public String getAccountNumber(){
        String accountNumberString = iban.substring(4);
        return accountNumberString;
    }
}
