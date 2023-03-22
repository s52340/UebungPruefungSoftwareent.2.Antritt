package Altklausur070122.stackUndAnalyse.products;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoStackApp
{
    public static void main(String[] args) {
        Product tisch = new Product("Tisch", 10.11, 1, "braun");
        Product kleid = new Product("Kleid", 12.12, 2,"rot");
        Product lampe = new Product("Lampe", 5.09,1, "blau");

        Product[] products = new Product[4];
        ArrayList<Product> productArrayList = new ArrayList<>();
        Stack produktsStack = new Stack(products);
        produktsStack.pushArray(tisch);
        produktsStack.pushList(tisch);

        System.out.println(produktsStack);
        System.out.println(produktsStack.getProductArrayList().get(0) + "  " + produktsStack.getProductArrayList().size());

        //System.out.println(produktsStack.popArray() + " " + produktsStack.getProducts().length );
        //produktsStack.popList();


        System.out.println(getCategoryName(1));

        produktsStack.pushArray(kleid);
        produktsStack.pushArray(lampe);
        System.out.println(countItemsByCategoryName(produktsStack));

    }

    public static String getCategoryName(int categoryID){
        switch (categoryID){
            case 1: return "Möbel";
            case 2: return "Kleidung";
            case 3: return "Sprtartikel";
            case 4: return "Nahrungsmittel";
            default: return "Divers";
        }
    }
        // [0][1][2]
    public static HashMap<String, Integer> countItemsByCategoryName(Stack products){
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < products.getProducts().length; i++) {
            Product[] prodArray = products.getProducts();
            if (prodArray[i] == null){
                return map;
            }

            String key = getCategoryName(prodArray[i].getCategoryID());
             if (!map.containsKey(getCategoryName(prodArray[i].getCategoryID()))){
                 map.put(key,1);
             }
             else {
                 int anzahl = map.get(key);
                 map.put(key, anzahl + 1);
             }
        }

        return map;
    }

}
