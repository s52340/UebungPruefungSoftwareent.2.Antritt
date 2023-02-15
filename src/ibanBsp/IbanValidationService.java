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
    public String getCountyCodeNumber(){  //A =10 - T=29 +00
    char charOne = iban.charAt(0);
    int charO = Integer.valueOf(charOne);
    charO -= 55;
    char charTwo = iban.charAt(1);
    int charT = Integer.valueOf(charTwo);
    charT -= 55;
    String countryCodeNumber = "" + charO + "" + charT + "00";
    return countryCodeNumber;
    }
    public String getFullCode(){
        String part1 = getAccountNumber();
        String part2 = getCountyCodeNumber();
        String part3 = part1 + part2;
        return part3;
    }
    public int[] buildArray(){
        int[] array = new int[getFullCode().length()];
        for (int i = 0; i < getFullCode().length(); i++) {
            char chari = getFullCode().charAt(i);
            int charI = chari - '0';
            array[i] = charI;
        }
            return array;
    }

}

