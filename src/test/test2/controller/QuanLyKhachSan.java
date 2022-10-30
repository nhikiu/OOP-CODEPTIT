package test.test2.controller;



import test.test2.model.HoaDon;
import test.test2.model.HoaDonGio;
import test.test2.model.HoaDonNgay;
import test.test2.model.IChucNang;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLyKhachSan implements IChucNang {
    private List<HoaDon> list;
    private Scanner sc = new Scanner(System.in);

    public QuanLyKhachSan() {
        list = new ArrayList<>();
    }

    public List<HoaDon> getList() {
        return list;
    }

    public void setList(List<HoaDon> list) {
        this.list = list;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    private int timViTri(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaHoaDon().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    private HoaDon nhap() {
        String ma, ngayXuat, hoTen;
        String maChuan = "^[NX]{1}\\d{2}";
        String ngayChuan ="\\d{1,2}/\\d{1,2}/\\d{4}";
        while (true) {
            try{
                System.out.print("Ma hoa don: ");
                ma = sc.nextLine();
                if (timViTri(ma) == -1 && ma.toUpperCase().matches(maChuan)) {
                    break;
                } else {
                    throw new ValidException("Ma bi trung hoac khong dung dinh dang.");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        while (true) {
            try {
                System.out.print("Ngay xuat: ");
                ngayXuat = sc.nextLine();
                if (ngayXuat.matches(ngayChuan)) {
                    break;
                } else {
                    throw new ValidException("Ngay khong dung dinh dang");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        System.out.print("Ho ten khach hang: ");
        hoTen = sc.nextLine();
        return (new HoaDon(ma, ngayXuat, hoTen));
    }

    @Override
    public void nhapHoaDonTheoNgay() {
        HoaDon hd = nhap();
        int soNgayThue;
        while (true) {
            try {
                System.out.print("So ngay thue: ");
                soNgayThue = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }
        list.add(new HoaDonNgay(hd.getMaHoaDon(), hd.getNgayXuat(), hd.getHoTen(), soNgayThue));
    }

    @Override
    public void nhapHoaDOnTheoGio() {
        HoaDon hd = nhap();
        int soGioThue;
        while (true) {
            try {
                System.out.print("So gio thue: ");
                soGioThue = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }
        list.add(new HoaDonNgay(hd.getMaHoaDon(), hd.getNgayXuat(), hd.getHoTen(), soGioThue));
    }

    @Override
    public void inRaDanhSachHoaDon() {
        for (HoaDon hd : list) {
            System.out.println(hd);
        }
        System.out.println("-------------------------");
        System.out.println("Tong: " + list.size());
    }

    @Override
    public void luuFile(String fname) {
        IOFile.ghi(fname, list);
    }

    public void doc(String fname) {
        setList(IOFile.doc(fname));
    }

    @Override
    public void sua() {
        System.out.print("Nhap vao ma cua hoa don theo ngay can sua: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay ma hoa don can sua.");
        } else {
            HoaDon hd = list.get(vt);
            String ngayXuat, hoTen;
            String ngayChuan ="\\d{1,2}/\\d{1,2}/\\d{4}";
            while (true) {
                try {
                    System.out.print("Ngay xuat: ");
                    ngayXuat = sc.nextLine();
                    if (ngayXuat.matches(ngayChuan)) {
                        break;
                    } else {
                        throw new ValidException("Ngay khong dung dinh dang");
                    }
                } catch (ValidException e) {
                    System.err.println(e);
                }
            }
            System.out.print("Ho ten khach hang: ");
            hoTen = sc.nextLine();
            hd.setNgayXuat(ngayXuat);
            hd.setHoTen(hoTen);
            if (hd instanceof HoaDonNgay) {
                System.out.println("Sua hoa don theo ngay: ");
                int soNgayThue;
                while (true) {
                    try {
                        System.out.print("So ngay thue: ");
                        soNgayThue = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println(e);
                    }
                }
                ((HoaDonNgay) hd).setSoNgayThue(soNgayThue);
            } else if (hd instanceof HoaDonGio) {
                System.out.println("Chi sua duoc hoa don theo ngay.");
            }
            System.out.println("Sua thanh cong!!!");
        }
    }

    @Override
    public void sapXepHoaDonTheoNgayXuat() {
        list.sort(new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                StringTokenizer n1 = new StringTokenizer(o1.getNgayXuat());
                StringTokenizer n2 = new StringTokenizer(o2.getNgayXuat());
                String s1 = "", s2 = "";
                while (n1.hasMoreTokens()){
                    s1 = n1.nextToken() + s1;
                }
                while (n2.hasMoreTokens()){
                    s2 = n2.nextToken() + s2;
                }
                return s1.compareToIgnoreCase(s2);
            }
        });
        for (HoaDon hd : list) {
            System.out.println(hd);
        }
        System.out.println("-----------------------");
        System.out.println("Tong: " + list.size());
    }

    @Override
    public void tongTienHDTheoNam() {
        Map<Integer, Integer> sum = list.stream().collect(
                Collectors.groupingBy(
                        HoaDon::getNam,
                        Collectors.summingInt(
                                HoaDon::getTienThanhToan
                        )
                )
        );
        Iterator i = sum.keySet().iterator();
        while (i.hasNext()) {
            Object key = i.next();
            System.out.println(key +": " + sum.get(key));
        }
    }
}
