package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachMonThi2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> list = new ArrayList<>();
        while (sc.hasNext()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hinhThuc = sc.nextLine();
            boolean check = false;
            for (MonThi monThi : list) {
                if (ma.equals(monThi.getMa())){
                    check = true;
                }
            }
            if (check == false) {
                list.add(new MonThi(ma, ten, hinhThuc));
            }
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}

class MonThi implements Comparable<MonThi>{
    private String ma;
    private String tenMon;
    private String hinhThucThi;

    public MonThi(String ma, String tenMon, String hinhThucThi) {
        this.ma = ma;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }

    @Override
    public String toString() {
        return ma + " " + tenMon + " " + hinhThucThi;
    }

    @Override
    public int compareTo(MonThi o) {
        return ma.compareTo(o.ma);
    }
}