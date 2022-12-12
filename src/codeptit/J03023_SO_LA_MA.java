package codeptit;

import java.util.HashMap;
import java.util.Scanner;

public class J03023_SO_LA_MA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        while (t-- > 0) {
            String s = sc.next();
            int res = map.get(s.charAt(s.length() - 1));
            for (int i = s.length() - 2; i >= 0; i--) {
                if (map.get(s.charAt(i + 1)) > map.get(s.charAt(i))) {
                    res -= map.get(s.charAt(i));
                } else {
                    res += map.get(s.charAt(i));
                }
            }
            System.out.println(res);
        }
    }
}
