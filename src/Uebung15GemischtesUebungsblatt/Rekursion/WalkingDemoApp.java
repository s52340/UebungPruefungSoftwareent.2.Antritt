package Uebung15GemischtesUebungsblatt.Rekursion;

public class WalkingDemoApp {

    public static void main(String[] args) {

        int count = 5;
        int current = 1;

        walk(count,current);


    }


    public static void walk(int countSteps, int currentStep){
        if (currentStep >= countSteps){
            System.out.println("Step forward: " + currentStep);
            return;
        }
        System.out.println("Step forward: " + currentStep);
        walk( countSteps, currentStep+ 1);

        System.out.println("Step backward: " + currentStep);

    }

}
