package codeptit.J07058_DANH_SACH_MON_THI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class J07058_DANH_SACH_MON_THI {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("MONHOC.in"));
        int t = Integer.parseInt(scanner.nextLine());
        List<MonHoc> monHoc = new ArrayList<>();
        while(t-- > 0){
            monHoc.add(new MonHoc(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(monHoc, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (MonHoc mh : monHoc){
            System.out.println(mh);
        }
    }
}

class MonHoc{
    private String ma;
    private String ten;
    private String hinhThucThi;

    public MonHoc(String ma, String ten, String hinhThucThi) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhThucThi;
    }
}