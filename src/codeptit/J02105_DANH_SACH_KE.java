package codeptit;

import java.util.ArrayList;
import java.util.Scanner;

public class J02105_DANH_SACH_KE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) {
                    tmp.add(j + 1);
                }
            }
            ans.add(tmp);
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("List(" + (i + 1) + ") = ");
            for (Integer x : ans.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
