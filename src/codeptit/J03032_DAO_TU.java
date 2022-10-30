package codeptit;

import java.util.Scanner;

public class J03032_DAO_TU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] tmp = s.split(" ");
            for (int i = 0; i < tmp.length; i++) {
                for (int j = tmp[i].length() - 1; j >= 0; j--) {
                    System.out.print(tmp[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
