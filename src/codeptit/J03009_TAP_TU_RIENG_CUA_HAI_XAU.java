package codeptit;

import java.util.Scanner;
import java.util.TreeSet;

public class J03009_TAP_TU_RIENG_CUA_HAI_XAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] tmp1 = s1.trim().toLowerCase().split(" ");
            TreeSet<String> treeSet1 = new TreeSet<>();
            for (int i = 0; i < tmp1.length; i++) {
                treeSet1.add(tmp1[i]);
            }
            String[] tmp2 = s2.trim().toLowerCase().split(" ");
            TreeSet<String> treeSet2 = new TreeSet<>();
            for (int i = 0; i < tmp2.length; i++) {
                treeSet2.add(tmp2[i]);
            }
            treeSet1.forEach(s -> {
                if (!treeSet2.contains(s)) {
                    System.out.print(s + " ");
                }
            });
            System.out.println();
        }
    }
}
