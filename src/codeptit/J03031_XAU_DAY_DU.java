package codeptit;

import java.util.Scanner;
import java.util.TreeSet;

public class J03031_XAU_DAY_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            System.out.println(solve(s, k));
        }
    }

    private static String solve(String s, int k) {
        TreeSet<Character> treeSet = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                treeSet.add(s.charAt(i));
            }
        }
        int tmp = 26 - treeSet.size() - k;
        if (tmp > 0) return "NO";
        return "YES";
    }
}
