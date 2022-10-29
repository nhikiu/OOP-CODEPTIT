package codeptit.J05062_HOC_BONG_SINH_VIEN;

import java.util.*;

public class J05062_HOC_BONG_SINH_VIEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(), n = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            students.add(new Student(i + 1, scanner.nextLine(), scanner.nextDouble(), scanner.nextInt()));
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGpa() < o2.getGpa() ? 1 : -1;
            }
        });

        double gpa = students.get(n - 1).getGpa();

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        });

        for (Student student : students) {
            if (student.getGpa() >= gpa) {
                System.out.println(student.getName() + ": " + solve(student.getGpa(), student.getTrainingPoint()));
            } else {
                System.out.println(student.getName() + ": KHONG");
            }
        }
    }

    public static String solve(double gpa, int drl){
        if (gpa >= 2.5 && drl >= 70){
            if (gpa < 3.2 || drl < 80) return "KHA";
            if (gpa < 3.6 || drl < 90) return "GIOI";
            return "XUATSAC";
        }
        return "KHONG";
    }
}

class Student{
    private int id;
    private String name;
    private double gpa;
    private int trainingPoint;

    public Student(int id, String name, double gpa, int trainingPoint) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.trainingPoint = trainingPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTrainingPoint() {
        return trainingPoint;
    }

    public void setTrainingPoint(int trainingPoint) {
        this.trainingPoint = trainingPoint;
    }

}