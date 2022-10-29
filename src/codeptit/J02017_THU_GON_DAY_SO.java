package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02017_THU_GON_DAY_SO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if ((list.get(i) + list.get(i + 1)) % 2 == 0) {
                    list.remove(i);
                    list.remove(i);
                    check = true;
                }
            }
        }
        System.out.println(list.size());
    }
}