package codeptit.J05076_NHAP_XUAT_HANG;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMatHang = new ArrayList<>();
        while (n-- > 0) {
            listMatHang.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = sc.nextInt();
        while (m-- > 0) {
            DonHang d = new DonHang(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            for (MatHang mh : listMatHang) {
                if (mh.getMa().equals(d.getMa())) {
                    d.setMatHang(mh);
                }
            }
            System.out.println(d);
        }
    }
}

class MatHang {
    private String ma;
    private String ten;
    private String xepLoai;

    public MatHang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
}

class DonHang {
    private String ma;
    private int soLuongNhap;
    private int donGiaNhap;
    private int soLuongXuat;
    private MatHang matHang;

    public DonHang(String ma, int soLuongNhap, int donGiaNhap, int soLuongXuat) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
    }

    public String getMa() {
        return ma;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public int tongNhap() {
        return soLuongNhap * donGiaNhap;
    }

    public int tongXuat() {
        if (matHang.getXepLoai().equals("A")) return soLuongXuat * donGiaNhap * 108 / 100;
        if (matHang.getXepLoai().equals("B")) return soLuongXuat * donGiaNhap * 105 / 100;
        if (matHang.getXepLoai().equals("C")) return soLuongXuat * donGiaNhap * 102 / 100;
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + matHang.getTen() + " " + tongNhap() + " " + tongXuat();
    }
}