package codeptit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J02007_DEM_SO_LAN_XUAT_HIEN {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            int[] a = new int[100];
            int[] b = new int[100000];
            List<Integer> res = new ArrayList<>();
            Arrays.fill(b, 0);
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (b[a[i]] == 0){
                    res.add(a[i]);
                }
                b[a[i]]++;
            }
            System.out.println("Test " + k + ":");
            for (int x : res) {
                System.out.println(x + " xuat hien " + b[x] + " lan");
            }
        }
    }
}