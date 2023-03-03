package Uebung14Vererbung2.bspFiguren;

public class FigurenDemo {
    public static void main(String[] args) {
        Rectangle rectangleKlein = new Rectangle(2.0,3.0);
        Rectangle rectangleMittel= new Rectangle(10, 200);
        Rectangle rectangleGross = new Rectangle(200, 300);
        Circle circleKlein = new Circle(2.0);
        Circle circleGross = new Circle(50.0);

        System.out.println(circleKlein.getArea());
        System.out.println(circleGross.getArea());

        FigureManager figureManager = new FigureManager();
        figureManager.addFigure(rectangleKlein);
        figureManager.addFigure(rectangleMittel);
        figureManager.addFigure(rectangleGross);
        figureManager.addFigure(circleKlein);
        figureManager.addFigure(circleGross);


        System.out.println("Der groesste Umfang ist: " + figureManager.getMaxPerimeter());
        System.out.println("Die durchschnittliche Fläche Beträgt: " + figureManager.getAverageAreaSize());
        System.out.println(figureManager.getAreaBySizeCategories());

    }
}
