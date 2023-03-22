package Altklausur070122.stackUndAnalyse.products;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int categoryID;
    private String colour;


    public Product(String name, double price, int categoryID, String colour) {
        this.name = name;
        this.price = price;
        this.categoryID = categoryID;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && categoryID == product.categoryID && Objects.equals(name, product.name) && Objects.equals(colour, product.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categoryID, colour);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryID=" + categoryID +
                ", colour='" + colour + '\'' +
                '}';
    }
}
