package codeptit;

import java.util.Scanner;

public class J01004_SO_NGUYEN_TO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            if(isPrime(n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}