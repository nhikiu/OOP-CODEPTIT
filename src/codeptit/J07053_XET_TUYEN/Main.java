package codeptit.J07053_XET_TUYEN;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> candidates = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            candidates.add(new Candidate(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        candidates.forEach(System.out::println);
    }
}

class Candidate {
    private String id;
    private String name;
    private String dateOfbirth;
    private double point1, point2;

    public Candidate(int id, String name, String dateOfbirth, double point1, double point2) {
        this.id = String.format("PH%02d", id);
        setName(name);
        setDateOfbirth(dateOfbirth);
        this.point1 = point1;
        this.point2 = point2;
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

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        String[] tmp = dateOfbirth.split("/");
        this.dateOfbirth = String.format("%02d/%02d/%04d", Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
    }

    public double getPoint1() {
        return point1;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public double getPoint2() {
        return point2;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    public double getBonusPoint() {
        if (point1 >= 8 && point2 >= 8) return 1;
        if (point1 >= 7.5 && point2 >= 7.5) return 0.5;
        return 0;
    }

    public int getFinalPoint() {
        int point = (int) Math.round((point1 + point2) / 2 + getBonusPoint());
        return (point > 10) ? 10 : point;
    }
    public String getXL() {
        if (getFinalPoint() < 5) return "Truot";
        if (getFinalPoint() <= 6) return  "Trung binh";
        if (getFinalPoint() <= 7) return "Kha";
        if (getFinalPoint() <= 8) return "Gioi";
        return "Xuat sac";
    }

    public int getAge() {
        return 2021 - Integer.parseInt(dateOfbirth.substring(dateOfbirth.lastIndexOf("/") + 1));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getAge() + " " + getFinalPoint() + " " + getXL();
    }
}