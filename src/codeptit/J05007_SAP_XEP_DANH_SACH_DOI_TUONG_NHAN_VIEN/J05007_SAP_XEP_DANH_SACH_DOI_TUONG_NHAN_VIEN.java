package codeptit.J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> arrayList = new ArrayList<>();

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Employee(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                    scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getDob().substring(6,10).equals(o2.getDob().substring(6,10))){
                    if(o1.getDob().substring(3,5).equals(o2.getDob().substring(3,5))){
                        return Integer.parseInt(o1.getDob().substring(0,2)) > Integer.parseInt(o2.getDob().substring(0,2)) ? 1 : -1;
                    }
                    return Integer.parseInt(o1.getDob().substring(3,5)) > Integer.parseInt(o2.getDob().substring(3,5)) ? 1 : -1;
                }
                return Integer.parseInt(o1.getDob().substring(6,10)) > Integer.parseInt(o2.getDob().substring(6,10)) ? 1 : -1;
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

class Employee{
    private int id;
    private String name, gender, dob, address, taxIdNumber, contractDate;

    public Employee(int id, String name, String gender, String dob, String address,
                    String taxIdNumber, String contractDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxIdNumber = taxIdNumber;
        this.contractDate = contractDate;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString(){
        return String.format("%05d", id) + " " + name + " " + gender + " " + dob + " " + address + " " + taxIdNumber + " " + contractDate;
    }
}