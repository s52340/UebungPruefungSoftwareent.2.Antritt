package Uebung14Vererbung2.bspFiguren;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeterCircle = 2 * radius * Math.PI;
        return perimeterCircle;
    }

    @Override
    public double getArea() {
        double areaCircle = (radius * radius) * Math.PI;
        return areaCircle;
    }
}
