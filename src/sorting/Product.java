package sorting;

import java.util.Arrays;

public class Product implements Comparable<Product> {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 1200.99),
            new Product("Smartphone", 799.49),
            new Product("Tablet", 399.99),
            new Product("Smartwatch", 199.99),
            new Product("Headphones", 99.99)
        };

        Arrays.sort(products);

        System.out.println("Products sorted by price:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
