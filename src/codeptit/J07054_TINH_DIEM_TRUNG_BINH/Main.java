package codeptit.J07054_TINH_DIEM_TRUNG_BINH;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            students.add(new Student(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(students);
        students.get(0).setRanking(1);
        for (int i = 1; i < students.size(); i++) {
            if (Double.parseDouble(students.get(i).getMark()) == Double.parseDouble(students.get(i - 1).getMark())) {
                students.get(i).setRanking(students.get(i - 1).getRanking());
            } else {
                students.get(i).setRanking(i + 1);
            }
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}

class Student implements Comparable<Student>{
    private String id, name;
    private double m1, m2, m3;
    private int ranking;

    public Student(int t, String name, double m1, double m2, double m3) {
        this.id = String.format("SV%02d", t);
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getName() {
        name = name.trim().toLowerCase().replaceAll("\\s++", " ");
        String[] tmp = name.split(" ");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1) + " ";
        }
        return name.trim();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getM3() {
        return m3;
    }

    public void setM3(double m3) {
        this.m3 = m3;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getMark() {
        return String.format("%.2f", (m1 * 3 + m2 * 3 + m3 * 2) / 8);
    }

    @Override
    public String toString() {
        return id + " " + getName() + " " + getMark() + " " + ranking;
    }

    @Override
    public int compareTo(Student o) {
        if (Double.parseDouble(getMark()) == Double.parseDouble(o.getMark())) {
            return id.compareTo(o.id);
        }
        return (Double.parseDouble(getMark()) < Double.parseDouble(o.getMark())) ? 1 : -1;
    }
}