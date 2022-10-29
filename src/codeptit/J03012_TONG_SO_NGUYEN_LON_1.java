package codeptit;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J03012_TONG_SO_NGUYEN_LON_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            add(a,b);
        }
    }

    private static void add(BigInteger a, BigInteger b) {
        System.out.println(a.add(b));
    }
}