package codeptit.J07081_SAP_XEP_DANH_SACH_SINH_VIEN;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while (n-- > 0) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.sort((o1, o2) -> {
            if (o1.getEngName().equals(o2.getEngName())) {
                return o1.getId().compareTo(o2.getId());
            }
            return o1.getEngName().compareTo(o2.getEngName());
        });
        students.forEach(System.out::println);
    }
}

class Student {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;

    public Student(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEngName() {
        String[] tmp = name.split(" ");
        String res = "";
        for (int i = 1; i < tmp.length - 1; i++) {
            res += tmp[i];
        }
        return tmp[tmp.length - 1] + " " + tmp[0] + " " + res;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + email;
    }
}