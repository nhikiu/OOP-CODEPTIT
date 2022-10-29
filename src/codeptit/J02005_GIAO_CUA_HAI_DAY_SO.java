package codeptit;

import java.util.*;

public class J02005_GIAO_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[1000];
        Arrays.fill(a, 0);
        for (int i = 0; i < n; i++) {
            a[sc.nextInt()] = 1;
        }
        List<Integer> res = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (a[x] == 1) {
                res.add(x);
                a[x] = 0;
            }
        }
        Collections.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : -1;
            }
        });
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}