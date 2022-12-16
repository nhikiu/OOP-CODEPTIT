package codeptit.J06002_SAP_XEP_HOA_DON_BAN_QUAN_AO;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            items.add(new Item(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String inp = sc.nextLine();
            String[] tmp = inp.split(" ");
            bills.add(new Bill(i, tmp[0], Integer.parseInt(tmp[1])));
        }
        for (Bill bill : bills) {
            for (Item item : items) {
                if (bill.getId().substring(0,2).equals(item.getId())) {
                    bill.setItem(item);
                }
            }
        }
        bills.sort((o1, o2) -> o1.getAmount() < o2.getAmount() ? 1 : -1);
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }
}

class Item {
    private String id;
    private String name;
    private long unitPrice1, unitPrice2;

    public Item(String id, String name, long unitPrice1, long unitPrice2) {
        this.id = id;
        this.name = name;
        this.unitPrice1 = unitPrice1;
        this.unitPrice2 = unitPrice2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getUnitPrice1() {
        return unitPrice1;
    }

    public long getUnitPrice2() {
        return unitPrice2;
    }
}

class Bill {
    private String id;
    private int quantity;
    private Item item;

    public Bill(int t, String id, int quantity) {
        this.id = id + "-" + String.format("%03d", t);
        this.quantity = quantity;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public long getDiscount() {
        long tmp = item.getUnitPrice1();
        if (id.charAt(2) == '2') {
            tmp = item.getUnitPrice2();
        }
        if (quantity >= 150) return quantity * tmp * 50 / 100;
        if (quantity >= 100) return quantity * tmp * 30 / 100;
        if (quantity >= 50) return quantity * tmp * 15 / 100;
        return 0;
    }

    public long getAmount() {
        long tmp = item.getUnitPrice1();
        if (id.charAt(2) == '2') {
            tmp = item.getUnitPrice2();
        }
        return quantity * tmp - getDiscount();
    }

    @Override
    public String toString() {
        return id + " " + item.getName() + " " + getDiscount() + " " + getAmount();
    }
}