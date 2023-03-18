package Uebung15GemischtesUebungsblatt.CovidImpfstoffAuswahl;

public class VaccinationAppointment {

    public static int calculateRiskClass(int age, boolean majorIllness, boolean contactOfPregnantPerson,
                                         boolean workingInHealthSector, boolean workingInEducationS,
                                         boolean baseRiskfaktor){

        int calcutatedRisk =0;

        int berechnetesAlter = age /10;

        calcutatedRisk += berechnetesAlter;

        if (majorIllness == true){
            calcutatedRisk += 3;
        }
        if (contactOfPregnantPerson){
            calcutatedRisk += 2;
        }
        if (workingInHealthSector){
            calcutatedRisk += 2;
        }
        if (workingInEducationS){
            calcutatedRisk += 1;
        }
        if (baseRiskfaktor){
            calcutatedRisk +=1;
        }

        return calcutatedRisk;
    }

    public String[] calculateMonthAndVaccine(int age, int riskClass){
        // Spalte0 = Monat Spalte1 = Impfstoff
        String[] monthVacc = new String[2];


        if (riskClass >= 10){
            monthVacc[0] = "January";
        }
        else if (riskClass == 9){
            monthVacc[0] = "Feb";
        }
        else if (riskClass == 7 || riskClass == 8){
            monthVacc[0] = "March";
        }
        else if (riskClass == 6){
            monthVacc[0] = "April";
        }
        else if (riskClass == 4 || riskClass== 5){
            monthVacc[0] = "Mai";
        }
        else if (riskClass == 2 || riskClass == 3){
            monthVacc[0] = "Juni";
        }
       else {
           monthVacc[0] = "Juli";
        }

        if (age >= 65){
            monthVacc[1] = "Pfizer";
        } else if (age >= 50) {
            monthVacc[1] = "Moderna";
        } else if (age >= 18){
            monthVacc[1] = "AstraZeneca";
        }
        else {
            monthVacc[1] = "Pfizer";
        }

        return monthVacc;
    }


}
