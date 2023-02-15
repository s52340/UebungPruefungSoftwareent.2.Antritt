package ibanBsp;

import java.io.InputStream;
import java.util.Scanner;

public class IbanDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputIban = scanner.next();

         IbanValidationService ibanVal;
         ibanVal = new IbanValidationService(inputIban);

        System.out.println(ibanVal.getCountryCode());
        System.out.println(ibanVal.getCheckSum());
        System.out.println( ibanVal.getAccountNumber());


    }
}
