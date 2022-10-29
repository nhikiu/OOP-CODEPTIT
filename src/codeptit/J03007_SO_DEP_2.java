package codeptit;

import java.text.ParseException;
import java.util.Scanner;

public class J03007_SO_DEP_2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            if (solve1(s) && solve2(s) && solve3(s)) {
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

    private static boolean solve2(String s) {
        if (s.charAt(0) == '8' && s.charAt(s.length() - 1) == '8') {
            return true;
        }
        return false;
    }

    private static boolean solve3(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        if (sum % 10 == 0) return true;
        return false;
    }
}