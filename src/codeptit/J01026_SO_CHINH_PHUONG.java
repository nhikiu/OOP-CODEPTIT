package codeptit;

import java.util.Scanner;

public class J01026_SO_CHINH_PHUONG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    private static String solve(int n){
        if((int)Math.sqrt(n) != Math.sqrt(n)){
            return "NO";
        }
        return "YES";
    }
}