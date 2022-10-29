package codeptit;

import java.util.Scanner;

public class J01018_SO_KHONG_LIEN_KE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            String s = scanner.next();
            System.out.println(solve(s));
        }
    }

    private static String solve(String s){
        if(solveA(s) && solveB(s)){
            return "YES";
        }
        return "NO";
    }

    // Tong chu so cua s chia het cho 10
    private static boolean solveA(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(sum % 10 == 0){
            return true;
        }
        return false;
    }

    // Cac chu so canh nhau deu khac nhau dung 2 don vi
    private static boolean solveB(String s){
        for (int i = 0; i < s.length() - 1; i++) {
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2){
                return false;
            }
        }
        return true;
    }
}