package codeptit.J05053_SAP_XEP_DON_HANG;

import java.util.Arrays;
import java.util.Scanner;

public class J05053_SAP_XEP_DON_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        MatHang[] matHang = new MatHang[t];
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            matHang[i] = new MatHang(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(matHang);
        for (MatHang i : matHang){
            System.out.println(i);
        }
    }
}

class MatHang implements Comparable<MatHang> {
    private String tenHang;
    private String maDonHang;
    private int donGia;
    private int soLuong;

    public MatHang(String tenHang, String maDonHang, int donGia, int soLuong) {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getSoThuTu(){
        return maDonHang.substring(1,4);
    }

    public int getGiamGia(){
        if(maDonHang.endsWith("1")) return (int) Math.round(0.5 * donGia * soLuong);
        if(maDonHang.endsWith("2")) return (int) Math.round(0.3 * donGia * soLuong);
        return 0;
    }

    public int getThanhTien(){
        return soLuong * donGia - getGiamGia();
    }

    @Override
    public String toString() {
        return tenHang + " " + maDonHang + " " + getSoThuTu() + " " + getGiamGia() + " " + getThanhTien();
    }

    @Override
    public int compareTo(MatHang o) {
        return getSoThuTu().compareTo(o.getSoThuTu());
    }
}