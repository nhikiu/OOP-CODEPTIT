package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BOI_SO_CHUNG_NHO_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger gcd = a.gcd(b);
            System.out.println(a.multiply(b).divide(gcd));
        }
    }
}