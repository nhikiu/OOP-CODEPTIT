package codeptit.J07033_DANH_SACH_SV_FILE_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07033_DANH_SACH_SV_FILE_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        while (t-- > 0) {
            students.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(students);
        students.forEach(System.out::println);
        students.clear();
    }
}

class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String className;
    private String email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        name = name.toLowerCase().trim().replaceAll("\\s+", " ");
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + getName() + " " + className + " " + email;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}