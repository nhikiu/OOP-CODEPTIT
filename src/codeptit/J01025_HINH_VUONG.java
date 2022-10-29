package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class J01025_HINH_VUONG {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];

        for (int i = 0; i < 4; i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int res = Math.max(a[3] - a[0], b[3] - b[0]);
        System.out.println(res * res);
    }
}