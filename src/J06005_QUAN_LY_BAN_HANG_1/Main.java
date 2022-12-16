package J06005_QUAN_LY_BAN_HANG_1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> customers;
    static ArrayList<Product> products;
    static ArrayList<Receipt> receipts;
    public static void inputCustomer() {
        customers = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++){
            customers.add(new Customer(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
    }

    public static void inputProduct() {
        int t = Integer.parseInt(sc.nextLine());
        products = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            products.add(new Product(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        }
    }

    public static void inputReceipt() {
        receipts = new ArrayList<>();
        Customer customer = null;
        Product product = null;
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String idCustomer = sc.next();
            for (Customer c : customers) {
                if (idCustomer.equals(c.getId())) {
                    customer = c;
                }
            }
            String idProduct = sc.next();
            for (Product p : products) {
                if (idProduct.equals(p.getId())) {
                    product = p;
                }
            }
            int quantity = sc.nextInt();
            receipts.add(new Receipt(i, customer, product, quantity));
        }
    }

    public static void output() {
        receipts.forEach(System.out::println);
    }

    public static void main(String[] args) {
        inputCustomer();
        inputProduct();
        inputReceipt();
        output();
    }
}