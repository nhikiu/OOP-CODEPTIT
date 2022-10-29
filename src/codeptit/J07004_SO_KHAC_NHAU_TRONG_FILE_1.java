package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004_SO_KHAC_NHAU_TRONG_FILE_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        int[] a = new int[1000];

        for (int i = 0; i < 1000; i++) {
            a[i] = 0;
        }

        while (scanner.hasNext()) {
            a[scanner.nextInt()]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}