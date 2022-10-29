package codeptit.J05025_SAP_XEP_DANH_SACH_GIANG_VIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05025_SAP_XEP_DANH_SACH_GIANG_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Teacher> arrayList = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Teacher(i + 1, sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if (o1.getName().equals(o2.getName())){
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

class Teacher{
    private int id;
    private String fullName;
    private String subject;

    public Teacher(int id, String fullName, String subject) {
        this.id = id;
        this.fullName = fullName;
        this.subject = subject;
    }

    public String getId() {
        return String.format("GV%02d", id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        String[] s = subject.split(" ");
        String res = "";
        for (int i = 0; i < s.length; i++) {
            res += s[i].charAt(0);
        }
        return res.toUpperCase();
    }

    public String getName(){
        String[] name = fullName.split(" ");
        return name[name.length - 1];
    }

    @Override
    public String toString() {
        return getId() + " " + fullName + " " + getSubject();
    }
}