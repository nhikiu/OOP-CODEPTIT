package codeptit.J05082_DANH_SACH_KHACH_HANG;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05082_DANH_SACH_KHACH_HANG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<Customer> customers = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            customers.add(new Customer(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(customers);

        customers.forEach(System.out::println);
    }
}

class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String gender;
    private String dob;
    private String address;

    public Customer(int id, String name, String gender, String dob, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getId() {
        return String.format("KH%03d", id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        name = name.trim().replaceAll("\\s+", " ");
        String[] tmp = name.split(" ");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        name = name.trim();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        String[] tmp = dob.split("/");
        return String.format("%02d/", Integer.parseInt(tmp[0])) + String.format("%02d/", Integer.parseInt(tmp[1])) + tmp[2];
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + gender + " "  + address + " " + getDob() ;
    }

    @Override
    public int compareTo(Customer o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1;
        Date date2;
        try {
            date1 = sdf.parse(this.getDob());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        try {
            date2 = sdf.parse(o.getDob());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date1.compareTo(date2);
    }
}