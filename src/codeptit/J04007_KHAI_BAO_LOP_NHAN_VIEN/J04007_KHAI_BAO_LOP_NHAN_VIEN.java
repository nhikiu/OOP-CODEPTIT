package codeptit.J04007_KHAI_BAO_LOP_NHAN_VIEN;

import java.util.Scanner;

public class J04007_KHAI_BAO_LOP_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("00001", scanner.nextLine(), scanner.nextLine(),
                scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(employee);
    }
}

class Employee{
    private String id, name, gender, dob, address, taxIdNumber, contractDate;

    public Employee(String id, String name, String gender, String dob, String address,
                    String taxIdNumber, String contractDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxIdNumber = taxIdNumber;
        this.contractDate = contractDate;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + taxIdNumber + " " + contractDate;
    }
}