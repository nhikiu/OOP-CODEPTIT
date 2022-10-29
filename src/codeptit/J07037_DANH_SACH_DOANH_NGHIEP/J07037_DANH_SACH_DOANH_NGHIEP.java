package codeptit.J07037_DANH_SACH_DOANH_NGHIEP;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07037_DANH_SACH_DOANH_NGHIEP {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<Company> companies = new ArrayList<>();
        while (t-- > 0) {
            companies.add(new Company(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(companies);
        companies.forEach(System.out::println);
    }
}

class Company implements Comparable<Company>{
    private String id;
    private String name;
    private String numberOfStudent;

    public Company(String id, String name, String numberOfStudent) {
        this.id = id;
        this.name = name;
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberOfStudent;
    }

    @Override
    public int compareTo(Company o) {
        return this.id.compareTo(o.id);
    }
}