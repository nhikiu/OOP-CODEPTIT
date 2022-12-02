import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
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
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String[] tmp = sc.nextLine().split("\\s+");
            for (int i = 0; i < tmp.length; i++) {
                if (thuanNghich(tmp[i])) {
                    list.add(tmp[i]);
                }
            }
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : list) {
            if (hashMap.containsKey(s)) {
                hashMap.replace(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }

        final int[] max = {0};
        hashMap.forEach((k, v) -> {
            if (k.length() > max[0]) {
                max[0] = k.length();
            }
        });

        hashMap.forEach((k, v) -> {
            if (k.length() == max[0]) {
                System.out.println(k + " " + v);
            }
        });
    }
}