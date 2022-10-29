package codeptit;

import java.util.*;

public class J02004_MANG_DOI_XUNG {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int t = scanner.nextInt();
        while (t-- > 0){
            solve();
        }
    }

    public static void solve(){
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        List<Integer> list1 = new ArrayList<>(list);

        Collections.reverse(list);

        if (list.equals(list1)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}