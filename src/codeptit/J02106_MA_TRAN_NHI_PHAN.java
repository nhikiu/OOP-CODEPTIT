package codeptit;

import java.util.Scanner;

public class J02106_MA_TRAN_NHI_PHAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        int res = 0;
        for (int i = 0; i < a.length; i++){
            int cnt = 0;
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) {
                    cnt++;
                }
            }
            if(cnt > 1) res++;
        }
        System.out.println(res);
    }
}
