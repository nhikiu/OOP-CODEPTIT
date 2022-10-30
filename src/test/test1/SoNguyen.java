package test.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SoNguyen {
    private int n;

    public SoNguyen() {

    }

    public SoNguyen(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen duong n: ");
        n = sc.nextInt();
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void uocSoNguyenToNhoHonN() {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    res.add(i);
                }
                if (isPrime(n/i)) {
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : -1;
            }
        });
        System.out.print("Uoc so nguyen to cua " + n + ": ");
        for (Integer i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private long[] fibo() {
        long[] f = new long[93];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 93; i++) {
            f[i] = f[i - 1] + f[i-2];
        }
        return f;
    }

    public void dayFibo() {
        long[] fi = fibo();
        System.out.print("Day so fibo nho hon " + n + ": ");
        for (int i = 0; i < 93; i++) {
            if (fi[i] < n) {
                System.out.print(fi[i] + " ");
            }
        }
        System.out.println();
    }
}
