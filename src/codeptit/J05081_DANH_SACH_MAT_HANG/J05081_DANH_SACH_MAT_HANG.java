package codeptit.J05081_DANH_SACH_MAT_HANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05081_DANH_SACH_MAT_HANG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        ArrayList<MatHang> arrayList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            arrayList.add(new MatHang(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(arrayList, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getLoiNhuan() == o2.getLoiNhuan()){
                    return o1.getMaMatHang() > o2.getMaMatHang() ? 1 : -1;
                }
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
    private String donViTinh;
    private int giaMua;
    private int giaBan;
    private int loiNhuan;

    public MatHang(int maMatHang, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getMaMatHang() {
        return maMatHang;
    }

    public int getLoiNhuan(){
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return String.format("MH%03d", maMatHang) + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + getLoiNhuan();
    }
}