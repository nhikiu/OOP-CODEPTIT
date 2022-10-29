package codeptit;

import java.text.ParseException;
import java.util.Scanner;

public class J03006_SO_DEP_1 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(solve(s));
        }
    }

    private static String solve(String s) {
        int n = s.length();
        for (int i = 0; i <= n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1) || s.charAt(i) % 2 != 0 || s.charAt(n - i - 1) % 2 != 0) {
                return "NO";
            }
        }
        return "YES";
    }
}