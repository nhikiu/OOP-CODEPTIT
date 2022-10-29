package codeptit.J07048_DANH_SACH_SAN_PHAM_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07048_DANH_SACH_SAN_PHAM_2  {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(scanner.nextLine());

        List<Product> products = new ArrayList<>();
        while (t-- > 0) {
            products.add(new Product(scanner.nextLine(), scanner.nextLine(),
                    Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.getPrice() < o2.getPrice() ? 1 : -1;
            }
        });

        products.forEach(System.out::println);
    }
}

class Product {
    private String id;
    private String name;
    private int price;
    private int warrantyPeriod;

    public Product(String id, String name, int price, int warrantyPeriod) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + warrantyPeriod;
    }
}