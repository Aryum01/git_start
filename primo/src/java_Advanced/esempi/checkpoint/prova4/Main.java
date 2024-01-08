package java_Advanced.esempi.checkpoint.prova4;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        Product product1 = new Product("pc", 1000.99, OffsetDateTime.of(2024, 01, 03, 15, 50, 34, 0, ZoneOffset.UTC));
        Product product2 = new Product("Tablet", 450.50,
                OffsetDateTime.of(2024, 02, 04, 16, 51, 33, 1, ZoneOffset.UTC));

        productList.addProduct(product1);
        productList.addProduct(product2);

        System.out.println("All product : \n");
        productList.printListOfProduct();

        System.out.println("total price : \n");
        System.out.println(productList.totalPrice());

        productList.removeProduct(product2);

        System.out.println("-1 product : \n");
        productList.printListOfProduct();

        System.out.println("total price : \n");
        System.out.println(productList.totalPrice());

        productList.calculateDiscountToAllProduct(0.10);
        System.out.println("total price with discount : \n");
        productList.printListOfProduct();

    }
}
