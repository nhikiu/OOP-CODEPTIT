package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07022_LOAI_BO_SO_NGUYEN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> res = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                res.add(s);
            }
        }
        res.sort(String::compareTo);
        System.out.println(String.join(" ", res));
    }
}
