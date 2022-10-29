package codeptit;

import java.text.ParseException;
import java.util.Scanner;

public class J03008_SO_DEP_3 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            if (solve1(s) && solve2(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean solve1(String s) {
        int n = s.length();
        for (int i = 0; i <= n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean solve2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!isPrime(Integer.parseInt(String.valueOf(s.charAt(i))))) {
                return false;
            }
        }
        return true;
    }
}