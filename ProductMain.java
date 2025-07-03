package Task_2;

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

   
    Product(int id, double p, int q) {
        pid = id;
        price = p;
        quantity = q;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product ID, Price, Quantity for product " + (i + 1) + ":");
            int id = sc.nextInt();
            double p = sc.nextDouble();
            int q = sc.nextInt();

            products[i] = new Product(id, p, q);
        }

        
        Product max = products[0];
        for (int i = 1; i < 5; i++) {
            if (products[i].price > max.price) {
                max = products[i];
            }
        }
        System.out.println("Product with highest price has ID: " + max.pid);

        
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += products[i].price * products[i].quantity;
        }
        System.out.println("Total amount: " + total);

        sc.close();
    }
}
