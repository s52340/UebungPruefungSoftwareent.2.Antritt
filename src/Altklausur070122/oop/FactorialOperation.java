package Altklausur070122.oop;

public class FactorialOperation extends CalculatorOperation{
    private int value;
    private int result;

    public FactorialOperation(String name, int value) {
        super(name);
        this.value = value;
    }



    @Override
    public void doCalculation() {
        int wert = 1;
        for (int i = 1; i <= value; i++) {
            wert = wert * i;
        }
        result = wert;
    }

    @Override
    public void printResult() {
        System.out.println("Die Fakultät für " + value + " lautet " + result);
    }
}
