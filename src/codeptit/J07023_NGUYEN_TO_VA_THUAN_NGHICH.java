package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class J07023_NGUYEN_TO_VA_THUAN_NGHICH implements Serializable {
    private static int[] prime = new int[10000];
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream1 = new FileInputStream("DATA1.in");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream1.readObject();

        FileInputStream fileInputStream2 = new FileInputStream("DATA2.in");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();

        int[] a = new int[10000];
        int[] b = new int[10000];

        sangNguyenTo();

        list1.forEach(i -> {
            a[i] += prime[i];
        });
        list2.forEach(i -> {
            b[i] += prime[i];
        });

        for (int i = 2; i < 10000; i++) {
            if (a[i] > 0 && b[i] > 0 && soThuanNghich(i)) {
                System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }
    }

    private static boolean soThuanNghich(int n) {
        String s = "" + n;
        for (int i = 0; i <= s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static void sangNguyenTo() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 100; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < 10000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
}
