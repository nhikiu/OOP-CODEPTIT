package codeptit.J05018_BANG_DIEM_HOC_SINH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05018_BANG_DIEM_HOC_SINH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> arrayList = new ArrayList<>();

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Student(i + 1, scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() == o2.getGpa()){
                    return o1.getId() > o2.getId() ? 1 : -1;
                }
                return o1.getGpa() < o2.getGpa() ? 1 : -1;
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

class Student{
    private int id;
    private String name;
    private String point;

    public Student(int id, String name, String point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        point = point.replaceAll("\\s+", " ");
        String[] mark = point.split(" ");
        double gpa = 0;
        gpa += Double.parseDouble(mark[0]) * 2 + Double.parseDouble(mark[1]) * 2;
        for (int i = 2; i < mark.length; i++) {
            gpa += Double.parseDouble(mark[i]);
        }
        return gpa/12;
    }

    public String getDecriptionGpa() {
        if(getGpa() < 5.0) return "YEU";
        if(getGpa() < 7.0) return "TB";
        if(getGpa() < 8.0) return "KHA";
        if(getGpa() < 9.0) return "GIOI";
        return "XUAT SAC";
    }

    @Override
    public String toString() {
        return String.format("HS%02d", id) + " " + name + " " + String.format("%.1f",Math.round(getGpa()*10.0)/10.0) + " " + getDecriptionGpa();
    }
}