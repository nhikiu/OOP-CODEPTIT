package codeptit;

import java.util.Scanner;

public class J01005_CHIA_TAM_GIAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt(), h = scanner.nextInt();
            System.out.println(solve(n, h));
        }
    }

    private static String solve(int n, int h){
        String res = "";
        double height = 0.0;
        for(int i = 1; i < n; i++){
            height = h * Math.sqrt((double) i / n);
            res += String.format("%.6f ", height);
        }
        return res;
    }
}