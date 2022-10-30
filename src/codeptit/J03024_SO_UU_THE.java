package codeptit;

import java.util.Scanner;

public class J03024_SO_UU_THE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String n = sc.nextLine();
            if (!check(n)) {
                System.out.println("INVALID");
            } else {
                if (soUuThe(n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static boolean check(String n) {
        if (n.charAt(0) == '0') return false;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) < '0' || n.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean soUuThe(String s) {
        int chan = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 2 == 0) {
                chan++;
            }
        }
        if (s.length() % 2 == 0 && chan > s.length() - chan) return true;
        if (s.length() % 2 == 1 && chan < s.length() - chan) return true;
        return false;
    }
}
