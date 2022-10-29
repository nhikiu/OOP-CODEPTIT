package codeptit;

import java.util.Scanner;

public class J01013_TONG_UOC_SO_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        while (t-- > 0) {
            res += solve(sc.nextInt());
        }
        System.out.println(res);
    }
    private static long solve(int n) {
        int s = 0;
        while (n % 2 == 0) {
            s += 2;
            n /= 2;
        }
        while (n % 3 == 0) {
            s += 3;
            n /= 3;
        }
        int i = 5;
        while (i <= Math.sqrt(n)) {
            while (n % i == 0) {
                s += i;
                n /= i;
            }
            while (n % (i + 2) == 0) {
                s += i + 2;
                n /= (i + 2);
            }
            i += 6;
        }
        if (n > 1) s += n;
        return s;
    }
}