package codeptit.J05030_BANG_DIEM_THANH_PHAN_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05030_BANG_DIEM_THANH_PHAN_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<Student> arrayList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            arrayList.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                    scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        }

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(i + 1 + " " + arrayList.get(i));
        }
    }
}

class Student{
    private String id;
    private String name;
    private String className;
    private double point1, point2, point3;

    public Student(String id, String name, String className,
                   double point1, double point2, double point3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + String.format("%.1f", point1)
                + " " + String.format("%.1f", point2) + " " + String.format("%.1f", point3);
    }
}