package codeptit.J07057_DIEM_TUYEN_SINH;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            students.add(new Student(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        students.sort((o1, o2) -> {
            if (o1.getTotalPoint() == o2.getTotalPoint()) {
                return o1.getId().compareTo(o2.getId());
            }
            return o1.getTotalPoint() < o2.getTotalPoint() ? 1 : -1;
        });
        students.forEach(System.out::println);
    }
}

class Student {
    private String id;
    private String name;
    private double point;
    private String ethnic;
    private int zone;

    public Student(int id, String name, double point, String ethnic, int zone) {
        this.id = String.format("TS%02d", id);
        setName(name);
        this.point = point;
        this.ethnic = ethnic;
        this.zone = zone;
    }

    public String getId() {
        return id;
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

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    private double getBonusPoint() {
        double p = 0.0;
        if (zone == 1) p += 1.5;
        else if (zone == 2) p += 1;
        if (!ethnic.equalsIgnoreCase("kinh")) p += 1.5;
        return p;
    }

    public double getTotalPoint() {
        return point + getBonusPoint();
    }

    public String getStatus() {
        if (getTotalPoint() >= 20.5) return "Do";
        return "Truot";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", getTotalPoint()) + " " + getStatus();
    }
}