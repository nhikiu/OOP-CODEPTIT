package codeptit.J05073_TINH_TOAN_GIA_BAN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05073_TINH_TOAN_GIA_BAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Item> items = new ArrayList<>();
        while (t-- > 0) {
            items.add(new Item(scanner.next(), scanner.nextInt(), scanner.nextInt()));
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

class Item{
    private String id;
    private int unitPrice;
    private int quantity;

    public Item(String id, int unitPrice, int quantity) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    private double getTariff(){
        double tariff = 0;
        char c = id.charAt(0);
        if (c == 'T') tariff = 0.29;
        else if (c == 'C') tariff = 0.1;
        else if (c == 'D') tariff = 0.08;
        else if (c == 'M') tariff = 0.02;
        if (id.endsWith("C")) tariff *= 0.95;
        return tariff;
    }

    private double getTransport(){
        char c = id.charAt(0);
        if (c == 'T') return 0.04;
        if (c == 'C') return 0.03;
        if (c == 'D') return 0.025;
        if (c == 'M') return 0.005;
        return 0;
    }

    public double getPrice(){
        return (double) unitPrice * (1 + getTariff() + getTransport()) * 1.2;
    }

    @Override
    public String toString() {
        return id + " " + String.format("%.2f",getPrice());
    }
}