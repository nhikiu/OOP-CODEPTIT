package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J01011_BOI_SO_CHUNG_UOC_SO_CHUNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            long a = scanner.nextInt(), b = scanner.nextInt();
            long gcd = gcdThing(a, b);
            System.out.println(a * b / gcd + " " + gcd);
        }
    }

    public static long gcdThing(long a, long b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }
}