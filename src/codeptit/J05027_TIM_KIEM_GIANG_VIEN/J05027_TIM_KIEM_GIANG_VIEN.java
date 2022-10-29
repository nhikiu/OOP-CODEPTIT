package codeptit.J05027_TIM_KIEM_GIANG_VIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05027_TIM_KIEM_GIANG_VIEN {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Teacher> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Teacher(i + 1, sc.nextLine(), sc.nextLine()));
        }

        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            solve();
        }
    }
    private static void solve(){
        String name = sc.nextLine();
        System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + name + ":");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getFullName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(arrayList.get(i));
            }
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

    public String getFullName() {
        return fullName;
    }

    public String getSubject() {
        String[] s = subject.split(" ");
        String res = "";
        for (int i = 0; i < s.length; i++) {
            res += s[i].charAt(0);
        }
        return res.toUpperCase();
    }

    @Override
    public String toString() {
        return getId() + " " + fullName + " " + getSubject();
    }
}