package codeptit;

import java.text.ParseException;
import java.util.Scanner;

public class J03004_CHUAN_HOA_XAU_HO_TEN_1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String name = scanner.nextLine();
            name = name.replaceAll("\\s+", " ").toLowerCase().trim();
            String[] tmp = name.split(" ");
            String res = "";
            for (int i = 0; i < tmp.length; i++) {
                res += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                if (i < tmp.length - 1) {
                    res += " ";
                }
            }
            System.out.println(res);
        }
    }
}