package codeptit.J05034_DANH_SACH_THUC_TAP_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05034_DANH_SACH_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<Student> arrayList = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Student(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                    scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        int Q = scanner.nextInt();
        scanner.nextLine();
        while (Q-- > 0) {
            String company = scanner.nextLine();
            for (int i = 0; i < t; i++) {
                if(company.equals(arrayList.get(i).getCompany())) {
                    System.out.println(arrayList.get(i));
                }
            }
        }
    }
}

class Student{
    private int ordinals;
    private String id;
    private String name;
    private String className;
    private String email;
    private String company;

    public Student(int ordinals, String id, String name, String className, String email, String company) {
        this.ordinals = ordinals;
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return ordinals + " " + id + " " + name + " " + className + " " + email + " " + company;
    }
}