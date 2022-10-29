package codeptit.J05046_BANG_KE_NHAP_KHO;

import java.util.ArrayList;
import java.util.Scanner;

public class J05046_BANG_KE_NHAP_KHO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        int t = scanner.nextInt();
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            products.add(new Product(scanner.nextLine(), scanner.nextInt(), scanner.nextInt()));
            int ind = name.indexOf(products.get(i).getId().substring(0,2));
            if (ind == -1) {
                products.get(i).setId(1);
            }
            else {
                products.get(i).setId(Integer.parseInt(products.get(name.lastIndexOf(products.get(i).getNameId())).getId().substring(2)) + 1);
            }
            name.add(products.get(i).getNameId());
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

}

class Product {
    private int id;
    private String name;
    private int quantity;
    private int unitPrice;

    public Product() {
    }

    public Product(String name, int quantity, int unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return getNameId() + String.format("%02d", id);
    }

    public String getNameId() {
        String[] tmp = name.split(" ");
        return (String.valueOf(tmp[0].charAt(0)) + tmp[1].charAt(0)).toUpperCase();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscount() {
        if (quantity > 10) return unitPrice * quantity * 5 / 100;
        if (quantity >= 8) return unitPrice * quantity * 2 / 100;
        if (quantity >= 5) return unitPrice * quantity / 100;
        return 0;
    }

    public int getAmount() {
        return unitPrice * quantity - getDiscount();
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + getDiscount() + " " + getAmount();
    }
}