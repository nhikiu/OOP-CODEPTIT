package codeptit.J05068_SAP_XEP_BANG_GIA_XANG_DAU;

import java.text.ParseException;
import java.util.*;

public class J05068_SAP_XEP_BANG_GIA_XANG_DAU {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Item> items = new ArrayList<>();
        while (t-- > 0){
            items.add(new Item(scanner.next(), scanner.nextLong()));
        }

        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getAmount() < o2.getAmount() ? 1 : -1;
            }
        });

        for (Item item : items){
            System.out.println(item);
        }
    }
}

class Item{
    private String id;
    private long quantity;

    public Item(String id, long quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public String getName(){
        String name = id.substring(3,5);
        switch (name){
            case "BP":
                return "British Petro";
            case "ES":
                return "Esso";
            case "SH":
                return "Shell";
            case "CA":
                return "Castrol";
            case "MO":
                return "Mobil";
            case "TN":
                return "Trong Nuoc";
            default:
                return null;
        }
    }

    public long getUnitPrice(){
        char s = id.charAt(0);
        switch (s){
            case 'X':
                return 128000;
            case 'D':
                return 11200;
            case 'N':
                return 9700;
            default:
                return 0;
        }
    }

    public long getTariff(){
        long tariff = 0;
        char s = id.charAt(0);
        if (id.substring(3,5).equals("TN")){
            tariff = 0;
        } else {
            if(s == 'X') tariff = 3840;
            if(s == 'D') tariff = 392;
            if(s == 'N') tariff = 194;
        }
        return tariff * quantity;
    }

    public long getAmount(){
        return getTariff() + quantity * getUnitPrice();
    }

    @Override
    public String toString() {
        return id + " " + getName() + " " + getUnitPrice() + " " + getTariff() + " " + getAmount();
    }
}