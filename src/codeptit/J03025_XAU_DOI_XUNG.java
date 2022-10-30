package codeptit;

import java.util.Scanner;

public class J03025_XAU_DOI_XUNG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (cnt(s) == 1 && s.length() % 2 == 0) {
                System.out.println("YES");
            } else if (cnt(s) <= 1 && s.length() % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int cnt (String s) {
        int dem = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                dem++;
            }
        }
        return dem;
    }
}
