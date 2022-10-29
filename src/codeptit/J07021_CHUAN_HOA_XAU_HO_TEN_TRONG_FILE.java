package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021_CHUAN_HOA_XAU_HO_TEN_TRONG_FILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("END")) return;
            System.out.println(solve(s));
        }
    }

    private static String solve(String s) {
        s = s.toLowerCase().trim().replaceAll("\\s+", " ");
        String[] tmp = s.split(" ");
        s = "";
        for (int i = 0; i < tmp.length; i++) {
            s += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1) + " ";
        }
        return s;
    }
}