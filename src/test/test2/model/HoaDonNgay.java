package test.test2.model;

import java.io.Serializable;

public class HoaDonNgay extends HoaDon implements IHoaDon, Serializable {
    private int soNgayThue;

    public HoaDonNgay(){

    }

    public HoaDonNgay(String maHoaDon, String ngayXuat, String hoTen, int soNgayThue) {
        super(maHoaDon, ngayXuat, hoTen);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public double getTienTT() {
        if (getSoNgayThue() < 7) {
            return 300 * getSoNgayThue();
        }
        return 300 * getSoNgayThue() * 0.9;
    }

    @Override
    public String toString() {
        return getMaHoaDon() +"\t" + getNgayXuat() +"\t" + getHoTen() + "\t" + getSoNgayThue() + "\t"+getTienTT();
    }
}
