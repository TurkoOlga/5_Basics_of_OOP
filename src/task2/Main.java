package task2;
/*
Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println(payment);

        Payment.Product milk = payment.new Product("milk", 1);
        Payment.Product bread = payment.new Product("bread", 2);
        Payment.Product juice = payment.new Product("juice", 3);

        payment.addPayments(List.of(milk, bread, juice));
        System.out.println(payment);
    }
}
