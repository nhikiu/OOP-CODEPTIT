package codeptit.J07073_DANG_KY_HINH_THUC_GIANG_DAY;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> monHocList = new ArrayList<>();
        while (n-- > 0) {
            MonHoc monHoc = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    sc.nextLine(), sc.nextLine());
            if (!monHoc.getHinhThucThucHanh().equals("Truc tiep")) {
                monHocList.add(monHoc);
            }
        }
        monHocList.sort((o1, o2) -> o1.getMa().compareTo(o2.getMa()));
        monHocList.forEach(System.out::println);
    }
}

class MonHoc {
    private String ma;
    private String ten;
    private int soTinChi;
    private String hinhThucLyThuyet;
    private String hinhThucThucHanh;

    public MonHoc(String ma, String ten, int soTinChi, String hinhThucLyThuyet, String hinhThucThucHanh) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
        this.hinhThucLyThuyet = hinhThucLyThuyet;
        this.hinhThucThucHanh = hinhThucThucHanh;
    }

    public String getMa() {
        return ma;
    }

    public String getHinhThucThucHanh() {
        return hinhThucThucHanh;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soTinChi + " " + hinhThucLyThuyet + " " + hinhThucThucHanh;
    }
}