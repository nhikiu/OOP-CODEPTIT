package codeptit;

import java.util.Scanner;

public class J01010_CAT_DOI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            String s = scanner.next();
            try {
                Long.parseLong(solve(s));
                if(Long.parseLong(solve(s)) == 0){
                    System.out.println("INVALID");
                } else {
                    System.out.println(Long.parseLong(solve(s)));
                }
            } catch (Exception e) {
                System.out.println(solve(s));
            }
        }
    }

    private static String solve(String s){
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9'){
                return "INVALID";
            }
            if(s.charAt(i) == '8' || s.charAt(i) == '9'){
                ans  += "0";
            }
            else ans += s.charAt(i);
        }
        return ans;
    }
}