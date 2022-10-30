package codeptit;

import java.util.Scanner;

public class J03040_BIEN_SO_DEP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            s = s.substring(s.length() - 6);
            s = s.replace(".", "");
            check(s);
        }
    }

    private static void check (String s) {
        if (check1(s) || check2(s) || check3(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean check1(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean check2(String s) {
        if (s.charAt(3) != s.charAt(4)) return false;
        if (s.charAt(0) != s.charAt(1) || s.charAt(1) != s.charAt(2) || s.charAt(0) != s.charAt(2)) return false;
        return true;
    }

    private static boolean check3(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }
}
