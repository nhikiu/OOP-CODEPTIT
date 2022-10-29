package codeptit;

import java.util.Scanner;

public class J01021_TINH_LUY_THUA {
    static final long mod = (long) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            long a = scanner.nextLong(), b = scanner.nextLong();
            if(a == 0 && b == 0){
                return;
            }
            System.out.println(solve(a, b));
        }
    }

    private static long solve(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long res = solve(a, b/2) % mod;
        if(b % 2 == 0) return res * res % mod;
        return res * res % mod * a % mod;
    }
}