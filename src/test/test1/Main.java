package test.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SoNguyen n = null;
        Xau s = null;
        DaThuc a = null;
        while (true) {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1. Nhap vao so nguyen n.");
            System.out.println("2. Viet ra cac uoc so nguyen to nho hon n.");
            System.out.println("3. Viet ra day so fibonacci.");
            System.out.println("4. Nhap vao 1 xau.");
            System.out.println("5. Dua ra so cau.");
            System.out.println("6. Chuan hoa xau theo chuan tieng Anh.");
            System.out.println("7. Nhap da thuc P^n(x).");
            System.out.println("8. Tinh gia tri da thuc tai x = 2.");
            System.out.println("9. Tim da thuc du cua 2 da thuc.");
            System.out.println("0. Thoat.");
            System.out.print("Nhap 1 so tu 0-9: ");
            Scanner scanner = new Scanner(System.in);
            int chon;
            chon = scanner.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Thoat");
                    System.exit(0);
                    break;
                case 1:
                    n = new SoNguyen();
                    n.input();
                    break;
                case 2:
                    n.uocSoNguyenToNhoHonN();
                    break;
                case 3:
                    n.dayFibo();
                    break;
                case 4:
                    scanner.nextLine();
                    s = new Xau();
                    s.input();
                    break;
                case 5:
                    s.soCau();
                    break;
                case 6:
                    s.chuanHoa();
                    break;
                case 7:
                    a = new DaThuc();
                    a.input();
                    break;
                case 8:
                    a.tinhGiaTri();
                    break;
                case 9:
                    DaThuc b = new DaThuc();
                    b.input();
                    a.chiaLayDu(b);
                    break;
                default:
                    System.out.println("Chi chon so tu 0-9");
            }
        }
    }
}
