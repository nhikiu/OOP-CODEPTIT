package example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThucTapCoSo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int nSv = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < nSv; i++) {
            sv.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        int nDetai = Integer.parseInt(sc2.nextLine());
        ArrayList<DeTai> dt = new ArrayList<>();
        for (int i = 0; i < nDetai; i++) {
            dt.add(new DeTai(i + 1, sc2.nextLine(), sc2.nextLine()));
        }
        Scanner sc3 = new Scanner(new File("HOIDONG.in"));
        int nNhiemVu = Integer.parseInt(sc3.nextLine());
        ArrayList<NhiemVu> nv = new ArrayList<>();
        for (int i = 0; i < nNhiemVu; i++) {
            String[] inp = sc3.nextLine().split(" ");
            String msv = inp[0];
            int iMsv = 0;
            for (int j = 0; j < sv.size(); j++) {
                if (msv.equals(sv.get(j).getId())){
                    iMsv = j;
                }
            }
            String maDeTai = inp[1];
            int iDeTai = 0;
            for (int j = 0; j < dt.size(); j++) {
                if (maDeTai.equals(dt.get(j).getId())) {
                    iDeTai = j;
                }
            }
            nv.add(new NhiemVu(sv.get(iMsv), dt.get(iDeTai), inp[2]));
        }
        Collections.sort(nv);
        for (NhiemVu i : nv) {
            System.out.println(i);
        }
    }
}



class SinhVien {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;

    public SinhVien(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class DeTai {
    private int id;
    private String giangVien;
    private String deTai;

    public DeTai(int id, String giangVien, String deTai) {
        this.id = id;
        this.giangVien = giangVien;
        this.deTai = deTai;
    }

    public String getId() {
        return String.format("DT%03d", id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    public String getDeTai() {
        return deTai;
    }

    public void setDeTai(String deTai) {
        this.deTai = deTai;
    }

    @Override
    public String toString() {
        return getId() + " " + getGiangVien() + " " + getDeTai();
    }
}

class NhiemVu implements Comparable<NhiemVu>{
    private SinhVien sv;
    private DeTai dt;
    private String hoiDong;

    public NhiemVu(SinhVien sv, DeTai dt, String hoiDong) {
        this.sv = sv;
        this.dt = dt;
        this.hoiDong = hoiDong;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public DeTai getDt() {
        return dt;
    }

    public void setDt(DeTai dt) {
        this.dt = dt;
    }

    public String getHoiDong() {
        return hoiDong;
    }

    public void setHoiDong(String hoiDong) {
        this.hoiDong = hoiDong;
    }

    @Override
    public String toString() {
        return sv.getId() + " " + sv.getName() + " " + dt.getDeTai() + " " + dt.getGiangVien();
    }

    @Override
    public int compareTo(NhiemVu o) {
        return this.dt.getId().compareTo(o.dt.getId());
    }
}