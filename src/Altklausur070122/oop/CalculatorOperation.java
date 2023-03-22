package Altklausur070122.oop;

public abstract class CalculatorOperation {
    protected String name;

    public CalculatorOperation(String name) {
        this.name = name;
    }

    public abstract void doCalculation();

    public abstract void printResult();
}
