package codeptit;

import java.util.Scanner;

public class J01014_UOC_SO_NGUYEN_TO_LON_NHAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            long n = scanner.nextLong();
            solve(n);
        }
    }

    private static void solve(long n){
        if(isPrime(n)){
            System.out.println(n);
        } else {
            for(int i = 2; i <= n; i++){
                if(n % i == 0){
                    if(isPrime(n / i)){
                        System.out.println(n/i);
                        return;
                    }
                }
            }
        }
    }

    private static boolean isPrime(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}