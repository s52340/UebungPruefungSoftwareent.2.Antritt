package ibanBsp;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class IbanDemo {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie Ihren IBAN ein (ohne Leerzeichen):");
        Scanner scanner = new Scanner(System.in);
        String inputIban = scanner.next();

        // BSP IBAN: AT611904300234573201,  AT022050302101023600
         IbanValidationService ibanVal;
         ibanVal = new IbanValidationService(inputIban);

        System.out.println("Ländercode: " + ibanVal.getCountryCode());
        System.out.println("Prüfsumme: " + ibanVal.getCheckSum());
        System.out.println("Kontonummer: " + ibanVal.getAccountNumber());
        System.out.println("Ländercodenummer: " + ibanVal.getCountyCodeNumber());
        System.out.println("Prüfzahl: " + ibanVal.getFullCode());
        System.out.println();
        System.out.println(Arrays.toString(ibanVal.buildArray()));
        System.out.println("Prüfsumme berechnet: " + ibanVal.calcCheckSum());
        System.out.println();
        System.out.println("Ist der IBAN korrekt: " + ibanVal.isIbanCorrect());
    }
}
