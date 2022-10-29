package codeptit.J04006_KHAI_BAO_LOP_SINH_VIEN;

import java.util.Scanner;

public class J04006_KHAI_BAO_LOP_SINH_VIEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("B20DCCN001", scanner.nextLine(),
                scanner.next(), scanner.next(), scanner.nextDouble());
        System.out.printf(String.valueOf(student));
    }
}

class Student{
    private String id;
    private String name;
    private String className;
    private String dob;
    private double gpa;

    public Student(String id, String name, String className, String dob, double gpa) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.dob = dob;
        this.gpa = gpa;
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
        return id + " " + name + " " + className + " " + getDob()+ " " + String.format("%.2f", getGpa());
    }
}