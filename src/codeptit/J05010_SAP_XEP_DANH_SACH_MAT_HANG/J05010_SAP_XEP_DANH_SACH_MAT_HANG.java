package codeptit.J05010_SAP_XEP_DANH_SACH_MAT_HANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05010_SAP_XEP_DANH_SACH_MAT_HANG  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<MatHang> arrayList = new ArrayList<>();
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            arrayList.add(new MatHang(i + 1, scanner.nextLine(),
                    scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble()));
        }

        Collections.sort(arrayList, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o1.getLoiNhuan() < o2.getLoiNhuan() ? 1 : -1;
            }
        });


        for (int i = 0; i < t; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

class MatHang{
    private int maMatHang;
    private String tenMatHang;
    private String nhomHang;
    private double giaMua;
    private double giaBan;

    public MatHang(int maMatHang, String tenMatHang, String nhomHang, double giaMua, double giaBan) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double getLoiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maMatHang + " " + tenMatHang + " " + nhomHang + " " + String.format("%.2f", getLoiNhuan());
    }
}