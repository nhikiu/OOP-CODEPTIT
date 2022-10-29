package codeptit.J07051_TINH_TIEN_PHONG;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class J07051_TINH_TIEN_PHONG {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File("KHACHHANG.in"));
        int t = scanner.nextInt();
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            customers.add(new Customer(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
        }

        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getAmount() < o2.getAmount() ? 1 : -1;
            }
        });

        for (Customer customer: customers){
            System.out.println(customer);
        }
    }
}


class Customer{
    private int id;
    private String name;
    private String room;
    private Date checkIn;
    private Date checkOut;
    private int fee;

    public Customer(int id, String name, String room, String checkIn, String checkOut, int fee) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.id = id;
        this.name = name;
        this.room = room;
        this.checkIn = simpleDateFormat.parse(checkIn);
        this.checkOut = simpleDateFormat.parse(checkOut);
        this.fee = fee;
    }

    public String getId() {
        return String.format("KH%02d", id);
    }

    public String getName() {
        name = name.toLowerCase().trim().replaceAll("\\s+", " ");
        String[] tmp = name.split(" ");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1) + " ";
        }
        name = name.trim();
        return name;
    }

    public int getDay(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        long d = checkOut.getTime() - checkIn.getTime();
        long day = TimeUnit.MILLISECONDS.toDays(d);
        return (int) day + 1;
    }

    private int getUnitPrice(){
        int n = Integer.parseInt(room.substring(0,1));
        switch (n){
            case 1:
                return 25;
            case 2:
                return 34;
            case 3:
                return 50;
            case 4:
                return 80;
            default:
                return 0;
        }
    }

    public int getAmount(){
        return getDay() * getUnitPrice() + fee;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + room + " " + getDay() + " " + getAmount();
    }
}