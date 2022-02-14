package task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> allProducts = new ArrayList<>();
    private int totalSum;

    public void addPayments(List<Product> products) {
        int sum = 0;
        for (Product product : products) {
            sum += product.price;
        }

        this.allProducts = products;
        this.totalSum = sum;
    }

    @Override
    public String toString() {
        return "Payment{" +
                ", allProducts=" + allProducts +
                ", totalSum=" + totalSum +
                '}';
    }

    public class Product {
        private final String productName;
        private final int price;

        public Product(String productName, int price) {
            this.productName = productName;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
