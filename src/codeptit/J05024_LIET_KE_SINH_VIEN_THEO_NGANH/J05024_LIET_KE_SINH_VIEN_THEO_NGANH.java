package codeptit.J05024_LIET_KE_SINH_VIEN_THEO_NGANH;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024_LIET_KE_SINH_VIEN_THEO_NGANH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> arrayList = new ArrayList<>();

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        int Q = scanner.nextInt();
        scanner.nextLine();
        while (Q-- > 0){
            String majors = scanner.nextLine();
            majors = majors.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + majors + ":");
            for (int i = 0; i < arrayList.size(); i++) {
                if (majors.equals(arrayList.get(i).getMajors())){
                    System.out.println(arrayList.get(i));
                }
            }
        }
    }
}

class Student{
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajors(){
        String majors = id.substring(3, 7);
        if(majors.equals("DCKT")) return "KE TOAN";
        if(majors.equals("DCCN") && className.charAt(0) != 'E') return "CONG NGHE THONG TIN";
        if(majors.equals("DCAT") && className.charAt(0) != 'E') return "AN TOAN THONG TIN";
        if(majors.equals("DCVT")) return "VIEN THONG";
        if(majors.equals("DCDT")) return "DIEN TU";
        return null;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}