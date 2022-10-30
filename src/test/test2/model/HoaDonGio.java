package test.test2.model;

import java.io.Serializable;

public class HoaDonGio extends HoaDon implements IHoaDon, Serializable {
    private int soGioThue;

    public HoaDonGio() {

    }

    public HoaDonGio(String maHoaDon, String ngayXuat, String hoTen, int soGioThue) {
        super(maHoaDon, ngayXuat, hoTen);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public double getTienTT() {
        if (getSoGioThue() < 5) {
            return 50 * getSoGioThue();
        }
        return 50 * getSoGioThue() * 0.7;
    }

    @Override
    public String toString() {
        return getMaHoaDon() + "\t" + getNgayXuat()  +"\t" + getHoTen() +"\t" + getSoGioThue() + "\t" + getTienTT();    }
}
