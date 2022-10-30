package test.test2.model;

import java.io.Serializable;

public class HoaDon implements Serializable, Comparable<HoaDon> {
    private String maHoaDon, ngayXuat, hoTen;
    private int tienThanhToan;

    public HoaDon() {

    }

    public HoaDon(String maHoaDon, String ngayXuat, String hoTen) {
        this.maHoaDon = maHoaDon;
        this.ngayXuat = ngayXuat;
        this.hoTen = hoTen;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(int tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public int getNam() {
        return Integer.parseInt(ngayXuat.substring(ngayXuat.lastIndexOf("/") + 1));
    }

    @Override
    public int compareTo(HoaDon o) {
        return 0;
    }
}
