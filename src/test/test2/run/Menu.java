package test.test2.run;

import test.test2.controller.QuanLyKhachSan;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QuanLyKhachSan q = new QuanLyKhachSan();
        String fname = "src/test/test2/run/hd.dat";

        while (true) {
            System.out.println("-------------------MENU------------------");
            System.out.println("1. Nhap hoa don theo ngay.");
            System.out.println("2. Nhap hoa don theo gio.");
            System.out.println("3. Viet ra danh sach toan bo hoa don cua khach san.");
            System.out.println("4. Luu hoa don vao file hd.dat");
            System.out.println("5. Sua 1 hoa don theo ngay khi nhap ma.");
            System.out.println("6. Sap xep hoa don theo ngay xuat.");
            System.out.println("7. Tinh tong tien hoa don theo nam.");
            System.out.println("8. Doc file");
            System.out.println("0. Thoat.");
            System.out.print("Moi chon (0-8): ");

            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("Thoat.");
                    q.luuFile(fname);
                    System.exit(0);
                case 1:
                    System.out.println("Nhap hoa don khach san theo ngay:");
                    q.nhapHoaDonTheoNgay();
                    break;
                case 2:
                    System.out.println("Nhap hoa don theo gio:");
                    q.nhapHoaDOnTheoGio();
                    break;
                case 3:
                    System.out.println("Danh sach toan bo hoa don cua khach san:");
                    q.inRaDanhSachHoaDon();
                    break;
                case 4:
                    System.out.println("Luu hoa don vao file");
                    q.luuFile(fname);
                    break;
                case 5:
                    System.out.println("Sua hoa don theo ngay.");
                    q.sua();
                    break;
                case 6:
                    System.out.println("Sap xep hoa don theo ngay: ");
                    q.sapXepHoaDonTheoNgayXuat();
                    break;
                case 7:
                    System.out.println("Tong tien hoa don theo nam: ");
                    q.tongTienHDTheoNam();
                    break;
                case 8:
                    q.doc(fname);
                    break;
                default:
                    System.out.println("Chi nhap cac so co trong MENU.");
            }
        }
    }
}
