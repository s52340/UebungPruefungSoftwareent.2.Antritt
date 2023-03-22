package meinVersuch.Krankenhaus;

public class Krankenschwester extends Person{

    private int lohn;

    public Krankenschwester(String name, int age, char gender, String eyeColor, int lohn) {
        super(name, age, gender, eyeColor);
        this.lohn = lohn;
    }


    @Override
    public void doSomehting() {
        System.out.println("Krankenschwester arbeitet");
    }

    public int getAge(){
        return getAge();
    }


    public int getLohn() {
        return lohn;
    }

    public void setLohn(int lohn) {
        this.lohn = lohn;
    }
}
