package codeptit;

import java.util.Scanner;

public class J01017_SO_LIEN_KE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            String s = scanner.next();
            System.out.println(solve(s));
        }
    }

    private static String solve(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1){
                return "NO";
            }
        }
        return "YES";
    }
}