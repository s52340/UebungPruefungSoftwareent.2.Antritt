package Uebung14Vererbung2.bspFiguren;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double perimeterRectangle = 2 * length + 2 * width;
        return perimeterRectangle;
    }

    @Override
    public double getArea() {
        double areaRectangle = length * width;
        return areaRectangle;
    }
}
