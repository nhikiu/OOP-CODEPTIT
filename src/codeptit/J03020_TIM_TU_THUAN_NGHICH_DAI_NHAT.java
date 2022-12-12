package codeptit;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class J03020_TIM_TU_THUAN_NGHICH_DAI_NHAT {
    // Ctrl + D: ket thuc input
    private static boolean thuanNghich(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            try {
                String s = sc.next();
                if (thuanNghich(s)) {
                    if (map.containsKey(s)) {
                        int tmp = map.get(s);
                        map.put(s, tmp + 1);
                    } else {
                        map.put(s, 1);
                        list.add(s);
                    }
                }
            } catch (RuntimeException e) {
                break;
            }
        }

        int m = 0;
        for (String i : list){
            if (i.length() > m) {
                m = i.length();
            }
        }
        for (String i : list) {
            if (i.length() == m) {
                System.out.println(i + " " + map.get(i));
            }
        }
    }
}