package codeptit;

import java.io.IOException;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class J03013_HIEU_SO_NGUYEN_LON_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            if (a.compareTo(b) == 1) {
                subtract(a, b);
            } else {
                subtract(b, a);
            }
        }
    }

    private static void subtract(BigInteger a, BigInteger b) {
        int n = a.toString().length();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "0";
        }
        DecimalFormat df = new DecimalFormat(s);
        System.out.println(df.format(a.subtract(b)));
    }
}