package codeptit.J07046_DANH_SACH_LUU_TRU;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class J07046_DANH_SACH_LUU_TRU {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new FileInputStream("KHACH.in"));
        int t = Integer.parseInt(scanner.nextLine());
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            customers.add(new Customer(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getDay() < o2.getDay() ? 1 : -1;
            }
        });

        customers.forEach(System.out::println);
    }
}

class Customer {
    private int id;
    private String name;
    private String room;
    private Date checkIn;
    private Date checkOut;

    public Customer(int id, String name, String room, String checkIn, String checkOut) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.id = id;
        this.name = name;
        this.room = room;
        this.checkIn = sdf.parse(checkIn);
        this.checkOut = sdf.parse(checkOut);
    }

    public String getId() {
        return String.format("KH%02d", id);
    }

    public int getDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long d = checkOut.getTime() - checkIn.getTime();
        long day = TimeUnit.MILLISECONDS.toDays(d);
        return (int) day;
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + room + " " + getDay();
    }
}