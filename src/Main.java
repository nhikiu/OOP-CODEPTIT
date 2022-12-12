import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("inp.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().toLowerCase().replaceAll("\\W+", " ").split("\\s+");
            for (int i = 0; i < s.length; i++) {
                if (map.containsKey(s[i])) {
                    map.put(s[i], map.get(s[i]) + 1);
                } else {
                    list.add(s[i]);
                    map.put(s[i], 1);
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