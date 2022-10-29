package codeptit.J05037_TINH_GIA_BAN_2;

import java.util.*;

public class J05037_TINH_GIA_BAN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<MatHang> arrayList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            arrayList.add(new MatHang(i + 1, sc.next(), sc.next(), sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(arrayList, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o1.getGiaBanLe() < o2.getGiaBanLe() ? 1 : -1;
            }
        });

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

    public int getGiaBanLe(){
        return (int) Math.ceil((1.02 * getThanhTien() / soLuong) / 100) * 100;
    }

    @Override
    public String toString() {
        return getMa() + " " + ten + " " + donViTinh + " " + getPhiVanChuyen() + " " + getThanhTien() + " " + getGiaBanLe();
    }
}