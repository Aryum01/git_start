package java_Advanced.esempi.checkpoint.prova4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Product implements Discountable {
    private String name;
    private double price;
    private OffsetDateTime dateOfProduction;

    public String getName() {
        return name;
    }

    public Product(String name, double price, OffsetDateTime dateOfProduction) {
        this.name = name;
        this.price = price;
        this.dateOfProduction = dateOfProduction;
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

    public OffsetDateTime getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(OffsetDateTime dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price +
                ", dateOfProduction=" + dateOfProduction.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
                + "]";
    }

    @Override
    public void applyDiscount(double discount) {
       this.price -= this.price * discount;
    }
}
