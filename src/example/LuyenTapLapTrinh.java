package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuyenTapLapTrinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < t; i ++) {
            String name = sc.nextLine();
            String[] tmp = sc.nextLine().split(" ");
            int submitAC = Integer.parseInt(tmp[0]);
            int totalSubmit = Integer.parseInt(tmp[1]);
            students.add(new Student(name, submitAC, totalSubmit));
        }
        Collections.sort(students);
        students.forEach(System.out::println);

    }
}

class Student implements Comparable<Student>{
    private String name;
    private int submitAC;
    private int totalSubmit;

    public Student() {}

    public Student(String name, int submitAC, int totalSubmit) {
        this.name = name;
        this.submitAC = submitAC;
        this.totalSubmit = totalSubmit;
    }

    public String getName() {
        name = name.trim().toLowerCase().replaceAll("\\s++", " ");
        String[] tmp = name.split(" ");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1) + " ";
        }
        name = name.trim();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubmitAC() {
        return submitAC;
    }

    public void setSubmitAC(int submitAC) {
        this.submitAC = submitAC;
    }

    public int getTotalSubmit() {
        return totalSubmit;
    }

    public void setTotalSubmit(int totalSubmit) {
        this.totalSubmit = totalSubmit;
    }

    @Override
    public String toString() {
        return getName() + " " + submitAC + " " + totalSubmit;
    }

    @Override
    public int compareTo(Student o) {
        if (submitAC == o.submitAC) {
            if (totalSubmit == o.totalSubmit) {
                return name.compareTo(o.name);
            }
            return totalSubmit > o.totalSubmit ? 1 : -1;
        }
        return submitAC < o.submitAC ? 1 : -1;
    }
}