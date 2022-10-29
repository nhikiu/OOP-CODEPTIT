package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TINH_TONG {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (scanner.hasNext()) {
            String s = scanner.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e){

            }
        }
        System.out.println(sum);
    }
}