package codeptit;

import java.util.Scanner;

public class J01009_TONG_GIAI_THUA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = 0, s = 1;
        for(int i = 1; i <= n; i++){
            s = 1;
            for(int j = 1; j <= i; j++){
                s *= j;
            }
            ans += s;
        }
        System.out.println(ans);
    }
}