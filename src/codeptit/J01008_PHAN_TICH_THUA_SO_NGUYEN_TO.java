package codeptit;

import java.util.Scanner;

public class J01008_PHAN_TICH_THUA_SO_NGUYEN_TO {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve(i + 1);
        }
    }

    private static void solve(int t){
        int n = sc.nextInt();
        System.out.print("Test " + t + ": ");
        int i = 2, count = 0;
        while (n >= i){
            while (n % i == 0){
                n /= i;
                count++;
            }
            if (count > 0){
                System.out.print(i + "(" + count + ") ");
                count = 0;
            }
            i++;
        }
        System.out.println();
    }
}