package codeptit.J07056_TINH_TIEN_DIEN;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String name = sc.nextLine();
            String[] tmp = sc.nextLine().split("\\s+");
            customers.add(new Customer(i, name, tmp[0], Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2])));
        }
        customers.sort((o1, o2) -> {
            return o1.getAmount() < o2.getAmount() ? 1 : -1;
        });
        customers.forEach(System.out::println);
    }
}

class Customer {
    private String id;
    private String name;
    private String type;
    private int oldValue, newValue;

    public Customer(int id, String name, String type, int oldValue, int newValue) {
        this.id = String.format("KH%02d", id);
        setName(name);
        this.type = type;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] tmp = name.trim().split("\\s+");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        this.name = name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOldValue() {
        return oldValue;
    }

    public void setOldValue(int oldValue) {
        this.oldValue = oldValue;
    }

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
    }

    private int getValue() {
        return newValue - oldValue;
    }

    private int getNorm() {
        if (type.equals("A")) return 100;
        if (type.equals("B")) return 500;
        if (type.equals("C")) return 200;
        return 0;
    }

    public int getNormAmount() {
        if (getValue() <= getNorm()) {
            return getValue() * 450;
        }
        return getNorm() * 450;
    }

    public int getOverNormAmount() {
        if (getValue() > getNorm()) {
            return (getValue() - getNorm()) * 1000;
        }
        return 0;
    }

    public int getVAT() {
        if (getValue() > getNorm()) {
            return getOverNormAmount() / 20;
        }
        return 0;
    }

    public int getAmount() {
        return getNormAmount() + getOverNormAmount() + getVAT();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getNormAmount() + " " + getOverNormAmount() + " " + getVAT() + " " + getAmount();
    }
}