package codeptit;

import java.util.Scanner;

public class J03021_DIEN_THOAI_CUC_GACH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            String num = solve(s);
            if (check(num)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean check(String s) {
        for (int i = 0; i <= s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static String solve(String s) {
        String res = "";
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'B' || c == 'C') res += "2";
            else if (c == 'D' || c == 'E' || c == 'F') res += "3";
            else if (c == 'G' || c == 'H' || c == 'I') res += "4";
            else if (c == 'J' || c == 'K' || c == 'L') res += "5";
            else if (c == 'M' || c == 'N' || c == 'O') res += "6";
            else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') res += "7";
            else if (c == 'T' || c == 'U' || c == 'V') res += "8";
            else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') res += "9";
        }
        return res;
    }
}
