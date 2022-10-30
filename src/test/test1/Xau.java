package test.test1;

import java.util.Scanner;

public class Xau {
    private String s;

    public Xau() {

    }

    public Xau(String s) {
        this.s = s;
    }

    public String getXau() {
        return s;
    }

    public void setXau(String s) {
        this.s = s;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau:");
        s = sc.nextLine();
    }

    public void soCau() {
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!') {
                dem++;
            }
        }
        System.out.println("Xau s co " + dem +" cau.");
    }

    public void chuanHoa() {
        String name = s;
        name = name.replaceAll("\\s+", " ").toLowerCase().trim();
        String[] tmp = name.split(" ");
        String res = "";
        for (int i = 1; i < tmp.length; i++) {
            res += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
            if (i < tmp.length - 1) {
                res += " ";
            }
        }
        res += ", " + tmp[0].toUpperCase();
        System.out.println("Xau sau khi chuan hoa: " + res);
    }
}

