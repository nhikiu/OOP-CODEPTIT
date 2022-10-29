package codeptit.J05050_TINH_TIEN_DIEN;

import java.util.*;

public class J05050_TINH_TIEN_DIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<TienDien> arrayList = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arrayList.add(new TienDien(i + 1, sc.next(), sc.nextLong(), sc.nextLong()));
        }
        for (TienDien tienDien : arrayList) {
            System.out.println(tienDien);
        }
    }
}

class TienDien{
    private int maKhachHang;
    private String loaiSuDUng;
    private long chiSoCu;
    private long chiSoMoi;

    public TienDien(int maKhachHang, String loaiSuDUng, long chiSoCu, long chiSoMoi) {
        this.maKhachHang = maKhachHang;
        this.loaiSuDUng = loaiSuDUng;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public String getMaKhachHang() {
        return String.format("KH%02d",maKhachHang);
    }

    public long getHeSo(){
        switch (loaiSuDUng){
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            case "CN":
                return 2;
            default:
                return 0;
        }
    }

    public long getThanhTien(){
        return (chiSoMoi - chiSoCu) * getHeSo() * 550;
    }

    public long getPhuTroi(){
        long chiSo = chiSoMoi - chiSoCu;
        if(chiSo < 50) return 0;
        if(chiSo <= 100) return (long) Math.round(getThanhTien() / 100.0 * 35);
        return getThanhTien();
    }
    public long getTongTien(){
        return getPhuTroi() + getThanhTien();
    }

    @Override
    public String toString() {
        return getMaKhachHang() + " " + getHeSo() + " " + getThanhTien() + " " + getPhuTroi() + " " + getTongTien();
    }
}