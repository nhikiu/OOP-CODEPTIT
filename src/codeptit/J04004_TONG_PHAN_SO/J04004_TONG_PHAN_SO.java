package codeptit.J04004_TONG_PHAN_SO;

import java.math.BigInteger;
import java.util.Scanner;

public class J04004_TONG_PHAN_SO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhanSo p = new PhanSo();
        PhanSo q = new PhanSo();

        p.setTuSo(scanner.nextLong());
        p.setMauSo(scanner.nextLong());
        q.setTuSo(scanner.nextLong());
        q.setMauSo(scanner.nextLong());

        PhanSo ans = new PhanSo();
        ans.setTuSo(p.getTuSo() * q.getMauSo() + p.getMauSo() * q.getTuSo());
        ans.setMauSo(p.getMauSo() * q.getMauSo());

        long gcd = PhanSo.gcdThing(ans.getTuSo(), ans.getMauSo());
        ans.setTuSo(ans.getTuSo() / gcd);
        ans.setMauSo(ans.getMauSo() / gcd);

        System.out.println(ans);
    }
}

class PhanSo{
    private long tuSo;
    private long mauSo;

    public PhanSo() {
    }

    public PhanSo(long p, long q) {
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

    public static long gcdThing(long a, long b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }

    @Override
    public String toString(){
        return tuSo + "/" + mauSo;
    }
}