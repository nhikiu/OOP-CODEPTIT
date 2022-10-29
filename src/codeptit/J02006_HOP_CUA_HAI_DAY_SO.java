package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class J02006_HOP_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[1000];
        Arrays.fill(a, 0);
        for (int i = 0; i < n + m; i++) {
            a[sc.nextInt()] = 1;
        }
        for (int i = 1; i < 1000; i++) {
            if (a[i] != 0)
                System.out.print(i + " ");
        }
    }
}