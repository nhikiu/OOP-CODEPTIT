package codeptit.J05009_TIM_THU_KHOA_KY_THI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05009_TIM_THU_KHOA_KY_THI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> arrayList = new ArrayList<>();

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            arrayList.add(new Student(i + 1, scanner.nextLine(), scanner.next(),
                    scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        }

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getSumPoint() == o2.getSumPoint()){
                    return o1.getId() > o2.getId() ? 1 : -1;
                }
                return o1.getSumPoint() < o2.getSumPoint() ? 1 : -1;
            }
        });

        double maxPoint = arrayList.get(0).getSumPoint();
        for (int i = 0; i < t; i++) {
            if (arrayList.get(i).getSumPoint() == maxPoint){
                System.out.println(arrayList.get(i));
            }
        }
    }
}

class Student{
    private int id;
    private String name;
    private String dob;
    private double point1, point2, point3;

    public Student(int id, String name, String dob, double point1, double point2, double point3) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
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

    public double getSumPoint(){
        return point1 + point2 + point3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + String.format("%.1f", getSumPoint());
    }
}