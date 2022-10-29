package codeptit;

import java.text.ParseException;
import java.util.Scanner;

public class J02008_BCNN_CUA_N_SO {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            solve(n);
        }
    }

    public static void solve(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i / gcd(res, i);
        }
        System.out.println(res);
    }

    public static long gcd (long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}