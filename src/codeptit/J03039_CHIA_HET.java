package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039_CHIA_HET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if (a.mod(b).equals(new BigInteger("0")) || b.mod(a).equals(new BigInteger("0"))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
