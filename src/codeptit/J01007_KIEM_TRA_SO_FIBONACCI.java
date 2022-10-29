package codeptit;

import java.util.Scanner;

public class J01007_KIEM_TRA_SO_FIBONACCI {
    static long[] fibo = new long[93];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            long n = scanner.nextLong();
            fibonacci();
            if(checkFibo(n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean checkFibo(long n){
        for(int i = 0; i <= 92; i++){
            if(fibo[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void fibonacci(){
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i <= 92; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
}