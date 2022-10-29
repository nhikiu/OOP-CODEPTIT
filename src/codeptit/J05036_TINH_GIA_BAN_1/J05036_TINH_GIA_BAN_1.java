package codeptit.J05036_TINH_GIA_BAN_1;

import java.util.ArrayList;
import java.util.Scanner;

public class J05036_TINH_GIA_BAN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<MatHang> arrayList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            arrayList.add(new MatHang(i + 1, sc.next(), sc.next(), sc.nextInt(), sc.nextInt()));
        }

        for (MatHang mathang : arrayList) {
            System.out.println(mathang);
        }
    }
}

class MatHang{
    private int ma;
    private String ten;
    private String donViTinh;
    private int donGiaNhap;
    private int soLuong;

    public MatHang(int ma, String ten, String donViTinh, int donGiaNhap, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return String.format("MH%02d", ma);
    }

    public int getPhiVanChuyen(){
        return (int) Math.round(0.05 * (donGiaNhap * soLuong));
    }

    public int getThanhTien(){
        return donGiaNhap * soLuong + getPhiVanChuyen();
    }

    public int getGiaBan(){
        return (int) Math.round(1.02 * getThanhTien());
    }

    @Override
    public String toString() {
        return getMa() + " " + ten + " " + donViTinh + " " + getPhiVanChuyen() + " " + getThanhTien() + " " + getGiaBan();
    }
}