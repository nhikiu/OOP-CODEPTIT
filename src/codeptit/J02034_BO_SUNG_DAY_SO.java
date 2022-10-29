package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02034_BO_SUNG_DAY_SO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= a[n - 1]; i++) {
            list.add(i);
        }
        for (int i = 0; i < n; i++) {
            list.remove(list.indexOf(a[i]));
        }
        if (list.size() == 0) {
            System.out.println("Excellent!");
        } else {
            list.forEach(System.out::println);
        }
    }
}