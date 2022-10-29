package codeptit;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J03014_TONG_SO_NGUYEN_LON_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        add(a,b);
    }

    private static void add(BigInteger a, BigInteger b) {
        System.out.println(a.add(b));
    }
}