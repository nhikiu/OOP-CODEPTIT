package codeptit;

import java.util.Scanner;

public class J01016_CHU_SO_4_VA_CHU_SO_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solve(s));
    }

    private static String solve(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                count++;
            }
        }
        if(count == 4 || count == 7){
            return "YES";
        }
        return "NO";
    }
}