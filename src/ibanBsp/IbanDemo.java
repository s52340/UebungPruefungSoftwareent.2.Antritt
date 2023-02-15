package ibanBsp;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class IbanDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputIban = scanner.next();

        // BSP IBAN: AT611904300234573201
         IbanValidationService ibanVal;
         ibanVal = new IbanValidationService(inputIban);

        System.out.println("Ländercode: " + ibanVal.getCountryCode());
        System.out.println("Prüfsumme: " + ibanVal.getCheckSum());
        System.out.println("Kontonummer: " + ibanVal.getAccountNumber());
        System.out.println(ibanVal.getCountyCodeNumber());
        System.out.println("Prüfzahl: " + ibanVal.getFullCode());
        System.out.println();
        System.out.println(Arrays.toString(ibanVal.buildArray()));
    }
}
