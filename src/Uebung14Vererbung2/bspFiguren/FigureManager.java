package Uebung14Vererbung2.bspFiguren;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    ArrayList<Figure> figures = new ArrayList<>();

    public void addFigure(Figure a){
        figures.add(a);
    }

    public double getMaxPerimeter(){
        double gesammtMaxPerimeter = 0.0;
        for (int i = 0; i < figures.size(); i++) {
              if (figures.get(i).getPerimeter() > gesammtMaxPerimeter){
                  gesammtMaxPerimeter = figures.get(i).getPerimeter();
              }
        }
        return gesammtMaxPerimeter;
    }

    public double getAverageAreaSize(){
        double gesammtAverageAS = 0.0;
        int count = 0;
        for (int i = 0; i < figures.size(); i++) {
            gesammtAverageAS += figures.get(i).getArea();
            count += 1;
        }
        gesammtAverageAS = gesammtAverageAS / count;  // oder dividiert durch figures.size()
        return gesammtAverageAS;
    }


    /* Kategorien:
    Klein: < 1000
    Mittel: 1000 – 4999
    Groß: >= 5000
     */
    // a; b; c; d;


    public HashMap<String,Double> getAreaBySizeCategories(){
        HashMap<String,Double> hashMapcategories = new HashMap<>();
        double areaKlein = 0.0;
        double areaMittel = 0.0;
        double areaGross = 0.0;
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getArea() < 1000){
                areaKlein += figures.get(i).getArea();
            } else if (figures.get(i).getArea() >= 5000){
                areaGross += figures.get(i).getArea();
            } else {
                areaMittel += figures.get(i).getArea();
            }
        }
        hashMapcategories.put("Klein", areaKlein);
        hashMapcategories.put("Mittel", areaMittel);
        hashMapcategories.put("Gross", areaGross);
        return hashMapcategories;
    }

    /*  funktioniert NICHT - Versuch andere Möglichkeit für obere Methode;
    public HashMap<String,Double> getAreaBySizeCategories(){
        HashMap<String,Double> hashMapcategories = new HashMap<>();
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getArea() < 1000){
                Double klein = 0.0;
                hashMapcategories.put("Klein", klein + figures.get(i).getArea());
            } else if (figures.get(i).getArea() >= 5000){
                Double gross = hashMapcategories.get("Gross");
                hashMapcategories.put("Gross", gross + figures.get(i).getArea());
            } else {
                double mittel = hashMapcategories.get("Mittel");
                hashMapcategories.put("Mittel", mittel + figures.get(i).getArea());
            }
        }

        return hashMapcategories;
    }
     */
}
