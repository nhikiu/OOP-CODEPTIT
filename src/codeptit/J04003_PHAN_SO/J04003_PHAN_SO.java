package codeptit.J04003_PHAN_SO;

import java.math.BigInteger;
import java.util.Scanner;

public class J04003_PHAN_SO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo phanSo = new PhanSo();
        phanSo.setTuSo(sc.nextLong());
        phanSo.setMauSo(sc.nextLong());
        long gcd = gcdThing(phanSo.getTuSo(), phanSo.getMauSo());
        System.out.println(phanSo.getTuSo() / gcd + "/" + (phanSo.getMauSo()) / gcd);
    }

    public static long gcdThing(long a, long b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }
}

class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(){

    }
    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }
}