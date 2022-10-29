package codeptit.J04013_BAI_TOAN_TUYEN_SINH;

import java.text.DecimalFormat;
import java.util.Scanner;

public class J04013_BAI_TOAN_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(),
                scanner.nextDouble(), scanner.nextDouble());
        System.out.println(student);
    }
}

class Student{
    private String id;
    private String name;
    private double math;
    private double physic;
    private double chemistry;

    public Student(String id, String name, double math, double physic, double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public double sumMark(){
        return math * 2 + physic + chemistry;
    }

    public double diemUuTien(){
        String s = id.substring(0, 3);
        if(s.equals("KV1")) return 0.5;
        if(s.equals("KV2")) return 1.0;
        if(s.equals("KV3")) return 2.5;
        return 0;
    }

    public String status(){
        if(sumMark() + diemUuTien() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }

    public static String removeZero(double number) {
        DecimalFormat format = new DecimalFormat("#.###########");
        return format.format(number);
    }

    @Override
    public String toString(){
        return id + " " + name + " " + removeZero(diemUuTien()) + " " + removeZero(sumMark()) + " " + status();
    }
}