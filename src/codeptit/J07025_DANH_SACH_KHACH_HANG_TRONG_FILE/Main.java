package codeptit.J07025_DANH_SACH_KHACH_HANG_TRONG_FILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main implements Serializable {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            customers.add(new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(customers);
        customers.forEach(System.out::println);
    }
}

class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;

    public Customer(int id, String name, String gender, String dateOfBirth, String address) {
        this.id = id;
        setName(name);
        this.gender = gender;
        setDateOfBirth(dateOfBirth);
        this.address = address;
    }

    public String getId() {
        return String.format("KH%03d", id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] tmp = name.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < tmp.length; i++) {
            res += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        this.name = res.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dateOfBirth);
    }

    public void setDateOfBirth(String dateOfBirth) {
        String[] tmp = dateOfBirth.split("/");
        String res = String.format("%02d", Integer.parseInt(tmp[0])) + "/" +
                String.format("%02d", Integer.parseInt(tmp[1])) + "/" +
                String.format("%04d", Integer.parseInt(tmp[2]));
        this.dateOfBirth = res;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getGender() + " " + getAddress() + " " + dateOfBirth;
    }

    @Override
    public int compareTo(Customer o) {
        try {
            return getDateOfBirth().compareTo(o.getDateOfBirth());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
