package codeptit.J05004_DANH_SACH_DOI_TUONG_SINH_VIEN_2;

import java.util.ArrayList;
import java.util.Scanner;

public class J05004_DANH_SACH_DOI_TUONG_SINH_VIEN_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        ArrayList<Student> arrayList = new ArrayList<>();

        for (int i = 0; i < t ; i++) {
            scanner.nextLine();
            arrayList.add(new Student(i + 1, scanner.nextLine(), scanner.next(), scanner.next(), scanner.nextDouble()));
        }

        for (int i = 0; i < t ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

class Student{
    private int id;
    private String dob;
    private String name;
    private String className;
    private double gpa;


    public Student() {
        id = 0;
        name = "";
        className = "";
        dob = "";
        gpa = 0;
    }

    public Student(int id, String name, String className, String dob, double gpa) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.dob = dob;
        this.gpa = gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        name = name.trim().toLowerCase();

        name = name.replaceAll("\\s+", " ");
        String[] temp= name.split(" ");
        String t = "";
        for (int i = 0; i < temp.length; i++) {
            t+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1) + " ";
        }

        return t;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        String DOB = "";
        if(dob.charAt(1) == '/' && dob.charAt(3) == '/') DOB += "0" + dob.charAt(0) + "/" + "0" + dob.substring(2);
        else if(dob.charAt(1) == '/' && dob.charAt(4) == '/') DOB += "0" + dob.substring(0);
        else if(dob.charAt(2) == '/' && dob.charAt(4) == '/') DOB += dob.substring(0, 3) + "0" + dob.substring(3);
        return DOB;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("B20DCCN%03d", id) + " " + name + " " + className + " " + getDob() + " " + String.format("%.2f", gpa);
    }
}