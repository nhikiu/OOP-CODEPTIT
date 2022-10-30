package codeptit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class J03011_UCLN_SO_NGUYEN_LON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> res = new ArrayList<>();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            System.out.println(a.gcd(b));
        }
    }
}
