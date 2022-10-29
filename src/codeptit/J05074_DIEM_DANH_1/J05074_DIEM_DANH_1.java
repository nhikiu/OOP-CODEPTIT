package codeptit.J05074_DIEM_DANH_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05074_DIEM_DANH_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Student> studentList = new ArrayList<>();
        scanner.nextLine();
        while (t-- > 0) {
            studentList.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        for (int i = 0; i < studentList.size(); i++) {
            String id = scanner.next();
            String point = scanner.next();
            for (Student student : studentList){
                if (id.equals(student.getId())){
                    student.setPoint(point);
                }
            }
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}


class Student{
    private String id;
    private String name;
    private String className;
    private String point;

    public Student(String id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPoint() {
        int p = 10;
        for (int i = 0; i < point.length(); i++){
            if (point.charAt(i) == 'm') p -= 1;
            else if (point.charAt(i) == 'v') p -= 2;
        }
        if (p < 0) p = 0;
        return p;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getStatus() {
        if (getPoint() == 0) {
            return "KDDK";
        }
        return "";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + getPoint() + " " + getStatus();
    }
}