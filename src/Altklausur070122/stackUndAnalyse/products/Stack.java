package Altklausur070122.stackUndAnalyse.products;

import java.util.ArrayList;
import java.util.Arrays;


//Zum Üben mit Array und List versucht aber für letzte Methode in DemoApp teils wieer entfernt
public class Stack {  //Stapel für Produkte
    int counter = -1;
    Product[] products = new Product[5];
    ArrayList<Product> productArrayList = new ArrayList<>();

    public Stack(Product[] products) {
        this.products = products;
        this.productArrayList = productArrayList;
    }


    public Product popArray(){

        Product poped=  products[counter];
        if (counter == 0){
            System.out.println("Stack ist nun leer");
        }
        counter --;

        return poped;
    }

    public Product popList(){
        Product removedProduct = productArrayList.get(productArrayList.size()-1);
        productArrayList.remove(removedProduct);
        System.out.println("Liste ist nun leer");
        return removedProduct;
    }

    public void pushArray(Product p){
        counter++;
       products[counter] = p;
       if (counter == products.length - 1 ){
           System.out.println("Stack ist schon voll");
       }
    }

    public void pushList(Product p){
        productArrayList.add(p);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "counter=" + counter +
                ", products=" + Arrays.toString(products) +
                ", productArrayList=" + productArrayList +
                '}';
    }

    public boolean isEmpty(){
        if (counter == -1){
            return true;
        }
        else return false;
    }

    public int getCounter() {
        return counter;
    }

    public Product[] getProducts() {
        return products;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }
}
