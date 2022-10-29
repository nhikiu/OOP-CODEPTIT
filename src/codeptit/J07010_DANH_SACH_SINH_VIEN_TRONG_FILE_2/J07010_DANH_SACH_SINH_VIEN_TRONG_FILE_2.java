package codeptit.J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            students.add(new Student(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine())));
        }
        students.forEach(System.out::println);
    }
}

class Student{
    private int id;
    private String name;
    private String className;
    private String dob;
    private double gpa;

    public Student(int id, String name, String className, String dob, double gpa) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String getId() {
        return String.format("B20DCCN%03d", id);
    }

    public String getDob() {
        String DOB = "";
        if(dob.charAt(1) == '/' && dob.charAt(3) == '/') DOB += "0" + dob.charAt(0) + "/" + "0" + dob.substring(2);
        else if(dob.charAt(1) == '/' && dob.charAt(4) == '/') DOB += "0" + dob.substring(0);
        else if(dob.charAt(2) == '/' && dob.charAt(4) == '/') DOB += dob.substring(0, 3) + "0" + dob.substring(3);
        return DOB;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString(){
        return getId() + " " + name + " " + className + " " + getDob()+ " " + String.format("%.2f", getGpa());
    }
}