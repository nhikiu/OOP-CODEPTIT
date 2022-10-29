package codeptit.J07050_SAP_XEP_MAT_HANG;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07050_SAP_XEP_MAT_HANG {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(scanner.nextLine());
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            items.add(new Item(i + 1, scanner.nextLine(), scanner.nextLine(),
                    Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }
        Collections.sort(items);
        items.forEach(System.out::println);
    }
}

class Item implements Comparable<Item>{
    private int id;
    private String name;
    private String group;
    private double inPrice;
    private double outPrice;

    public Item(int id, String name, String group, double inPrice, double outPrice) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.inPrice = inPrice;
        this.outPrice = outPrice;
    }

    public String getId() {
        return String.format("MH%02d", id);
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getInPrice() {
        return inPrice;
    }

    public void setInPrice(double inPrice) {
        this.inPrice = inPrice;
    }

    public double getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(double outPrice) {
        this.outPrice = outPrice;
    }

    public double getProfit() {
        return outPrice - inPrice;
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + group + " " + String.format("%.2f", getProfit());
    }

    @Override
    public int compareTo(Item o) {
        return this.getProfit() < o.getProfit() ? 1 : -1;
    }
}