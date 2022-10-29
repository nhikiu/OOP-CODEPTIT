package codeptit.J05054_XEP_HANG_HOC_SINH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05054_XEP_HANG_HOC_SINH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        ArrayList<Student> listStudent = new ArrayList<Student>();
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            listStudent.add(new Student(i + 1, scanner.nextLine(), scanner.nextDouble()));
        }
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMark() < o2.getMark() ? 1 : -1;
            }
        });

        listStudent.get(0).setRank(1);
        for (int i = 1; i < listStudent.size(); i++) {
            listStudent.get(i).setRank(i + 1);
            if(listStudent.get(i).getMark() == listStudent.get(i - 1).getMark()){
                listStudent.get(i).setRank(listStudent.get(i - 1).getRank());
            }
        }
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Student student : listStudent){
            System.out.println(student);
        }
    }
}

class Student{
    private int id;
    private String name;
    private double mark;
    private int rank;

    public Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public String getId() {
        return String.format("HS%02d", id);
    }

    public double getMark() {
        return mark;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getClassification(){
        if(mark < 5) return "Yeu";
        if(mark < 7) return "Trung Binh";
        if(mark < 9) return "Kha";
        return "Gioi";
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + String.format("%.1f", mark) + " " + getClassification() + " " + getRank();
    }
}


