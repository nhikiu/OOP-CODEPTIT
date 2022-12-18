package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J07011_THONG_KE_TU_KHAC_NHAU_TRONG_FILE_VAN_BAN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();
        while (t-- > 0) {
            Matcher matcher = Pattern.compile("\\w+").matcher(sc.nextLine().toLowerCase());
            while (matcher.find()) {
                String i = matcher.group();
                if (map.get(i) != null)
                    map.put(i, map.get(i) + 1);
                else {
                    map.put(i, 1);
                    list.add(i);
                }
            }
        }
        list.sort((o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
                return o1.compareTo(o2);
            }
            return map.get(o1) < map.get(o2) ? 1 : -1;
        });
        list.forEach(s -> System.out.println(s + " " + map.get(s)));
    }
}