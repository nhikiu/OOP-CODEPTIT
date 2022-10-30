package codeptit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03038_DANH_DAU_CHU_CAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), 1);
        }
        System.out.println(m.size());
    }
}
