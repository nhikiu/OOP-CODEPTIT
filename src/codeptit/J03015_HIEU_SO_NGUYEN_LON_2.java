package codeptit;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HIEU_SO_NGUYEN_LON_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        subtract(a, b);
    }

    private static void subtract(BigInteger a, BigInteger b) {
        System.out.println(a.subtract(b));
    }
}