package codeptit;

import java.util.Scanner;

public class J01012_UOC_SO_CHIA_HET_CHO_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            solve(n);
        }
    }

    private static void solve(int n){
        int count = 0;
        if (n % 2 == 1) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        count++;
                    }
                    if (n / i % 2 == 0 && n / i != i) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}