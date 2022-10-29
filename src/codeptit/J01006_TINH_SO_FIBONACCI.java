package codeptit;

import java.util.Scanner;

public class J01006_TINH_SO_FIBONACCI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            System.out.println(fibonacci(n));
        }
    }

    public static long fibonacci(int n){
        if(n == 1) return 1;
        if(n == 2) return 1;
        long f1 = 1, f2 = 1, fn = f1 + f2;
        for(int i = 3; i <= n; i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}