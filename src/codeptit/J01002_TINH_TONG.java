package codeptit;

import java.util.Scanner;

public class J01002_TINH_TONG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            long n = scanner.nextLong();
            System.out.println((1 + n) * n /2);
        }
    }
}