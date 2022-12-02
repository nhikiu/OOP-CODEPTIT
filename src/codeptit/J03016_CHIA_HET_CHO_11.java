package codeptit;

import java.util.Scanner;

public class J03016_CHIA_HET_CHO_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int even = 0, odd = 0;
            for (int i = 0; i < s.length(); i++) {
                int tmp = Integer.parseInt("" + s.charAt(i));
                if (i % 2 == 0) {
                    even += tmp;
                } else {
                    odd += tmp;
                }
            }
            if ((even - odd) % 11 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}