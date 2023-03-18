package Uebung15GemischtesUebungsblatt.CovidImpfstoffAuswahl;

import java.util.Arrays;

public class DemoImpfung {
    public static void main(String[] args) {
        VaccinationAppointment vaccinationAppointment = new VaccinationAppointment();
        int calcRiskClass = VaccinationAppointment.calculateRiskClass(67,true,true, true,true,true);
        System.out.println("calcRiskClass = " + calcRiskClass);
        
        String[] calcMonthVacc =vaccinationAppointment.calculateMonthAndVaccine(7, 9);
        System.out.println("calcMonthVacc = " + Arrays.toString(calcMonthVacc));
    }
}
