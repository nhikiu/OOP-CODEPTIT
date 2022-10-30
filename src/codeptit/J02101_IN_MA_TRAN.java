package codeptit;

import java.util.Scanner;

public class J02101_IN_MA_TRAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < a.length; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                } else {
                    for (int j = a.length - 1; j >= 0; j--) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
