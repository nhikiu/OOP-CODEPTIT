package codeptit;

import java.util.Scanner;

public class J03027_RUT_GON_XAU_KY_TU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (res.isEmpty()) res += c;
            else if (c == res.charAt(res.length() - 1)) {
                res = res.substring(0, res.length() - 1);
            } else {
                res += c;
            }
        }
        System.out.println(res.isEmpty() ? "Empty String" : res);
    }
}
