package codeptit;

import java.util.Scanner;

public class J02103_TICH_MA_TRAN_CHUYEN_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int r = sc.nextInt(), c = sc.nextInt();
            int[][] a = new int[r][c];
            int[][] b = new int[c][r];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int[][] res = new int[r][r];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    res[i][j] = 0;
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    for (int k = 0; k < c; k++) {
                        res[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + t + ":");
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
