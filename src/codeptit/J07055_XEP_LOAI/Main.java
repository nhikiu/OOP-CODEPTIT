package codeptit.J07055_XEP_LOAI;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            students.add(new Student(i, sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        students.sort((o1, o2) -> {
            return o1.getTotalPoint() < o2.getTotalPoint() ? 1 : -1;
        });
        students.forEach(System.out::println);
    }
}

class Student {
    private String id, name;
    private int p1, p2, p3;

    public Student() {}

    public Student(int id, String name, int p1, int p2, int p3) {
        this.id = String.format("SV%02d", id);
        setName(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
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
        String[] tmp = name.trim().split("\\s+");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        this.name = name.trim();
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getP3() {
        return p3;
    }

    public double getTotalPoint() {
        return (double) (p1 * 25 + p2 * 35 + p3 * 40) / 100;
    }

    public String getXL() {
        if (getTotalPoint() >= 8.0) return "GIOI";
        if (getTotalPoint() >= 6.5) return "KHA";
        if (getTotalPoint() >= 5.0) return "TRUNG BINH";
        return "KEM";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", getTotalPoint()) + " " + getXL();
    }
}