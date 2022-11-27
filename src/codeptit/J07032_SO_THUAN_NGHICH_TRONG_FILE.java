package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07032_SO_THUAN_NGHICH_TRONG_FILE {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] count = new int[1000001];

        FileInputStream fileInputStream1 = new FileInputStream("DATA1.in.in");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream1.readObject();
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        list1.forEach(i -> {
            if (checkNumber(i)) {
                count[i]++;
                treeSet1.add(i);
            }
        });

        FileInputStream fileInputStream2 = new FileInputStream("DATA2.in");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        list2.forEach(i -> {
            if (checkNumber(i)) {
                count[i]++;
                treeSet2.add(i);
            }
        });

        int d = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (treeSet1.contains(i) && treeSet2.contains(i) && count[i] > 0 && check(i)) {
                System.out.println(i + " " + count[i]);
                d++;
                if (d == 10) break;
            }
        }
    }

    private static boolean check(int n) {
        String s = "" + n;
        if (s.length() % 2 == 0 || s.length() <= 1) return false;
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt("" + s.charAt(i)) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNumber(int n) {
        String s = "" + n;
        for (int i = 0; i <= s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
