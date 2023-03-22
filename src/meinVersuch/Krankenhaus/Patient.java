package meinVersuch.Krankenhaus;

public class Patient extends Person{

    public static int nextValue = 0;
    private int patientenID;


    public Patient(String name, int age, char gender, String eyeColor, int patientenID) {
        super(name, age, gender, eyeColor);
        this.patientenID = patientenID;
    }

    @Override
    public void doSomehting() {
        System.out.println("Patient schläft");
    }


}
