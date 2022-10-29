package codeptit;

import java.util.Scanner;

public class J01024_SO_TAM_PHAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            String s = scanner.next();
            System.out.println(solve(s));
        }
    }

    static String solve(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2'){
                return "NO";
            }
        }
        return "YES";
    }
}