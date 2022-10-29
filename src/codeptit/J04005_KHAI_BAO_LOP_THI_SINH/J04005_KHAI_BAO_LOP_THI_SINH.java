package codeptit.J04005_KHAI_BAO_LOP_THI_SINH;

import java.util.Scanner;

public class J04005_KHAI_BAO_LOP_THI_SINH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(scanner.nextLine(), scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        student.setSumMark(student.getSumMark());
        System.out.println(student);
    }
}

class Student{
    private String name;
    private String dob;
    private double mark1;
    private double mark2;
    private double mark3;
    private double sumMark;

    public Student() {
    }

    public Student(String name, String dob, double mark1, double mark2, double mark3) {
        this.name = name;
        this.dob = dob;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double getSumMark() {
        return sumMark;
    }

    public void setSumMark(double sumMark) {
        this.sumMark = mark1 + mark2 + mark3;
    }

    @Override
    public String toString(){
        return name + " " + dob + " " + String.format("%.1f", sumMark);
    }
}