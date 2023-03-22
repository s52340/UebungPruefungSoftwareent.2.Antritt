package Altklausur070122.oop;

public class SummationOperation extends CalculatorOperation{
    private int value1;
    private int value2;
    private int result;


    public SummationOperation(String name, int value1, int value2) {
        super(name);
        this.value1 = value1;
        this.value2 = value2;
        //this.result = result;
    }

    @Override
    public void doCalculation() {
        if (value1 < 0){
            value1 = value1 * (-1);
        }
        if (value2 < 0){
            value2 = value2 * (-1);
        }
        result = value1 + value2;
    }

    @Override
    public void printResult() {
        System.out.println("Das Ergebnis von " + value1 + " + " + value2 + " lautet " + result);
    }
}
