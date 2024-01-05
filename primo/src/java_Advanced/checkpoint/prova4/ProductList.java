package java_Advanced.checkpoint.prova4;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printListOfProduct() {
        for (Product product2 : products) {
            System.out.println(product2);
        }
    }

    public double totalPrice() {
        double result = 0;
        for (Product product2 : products) {
            result += product2.getPrice();
        }
        return result;
    }

    public void calculateDiscountToAllProduct(double discount) {
        for (Product product : products) {
            product.applyDiscount(discount);
        }
    }
}
