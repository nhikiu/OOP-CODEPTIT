package codeptit;

import java.util.Scanner;

public class J03019_XAU_CON_LON_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "" + s.charAt(s.length() - 1);
        char c = s.charAt(s.length() - 1);
        for (int i = s.length() - 2; i >= 0; i--) {
            if (c <= (int) s.charAt(i)) {
                res = s.charAt(i) + res;
                c = s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
