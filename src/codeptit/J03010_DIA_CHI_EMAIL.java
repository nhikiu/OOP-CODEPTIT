package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03010_DIA_CHI_EMAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> res = new ArrayList<>();
        while (t-- > 0) {
            String name = sc.nextLine();
            name = name.trim().replaceAll("\\s++", " ").toLowerCase();
            String[] tmp = name.split(" ");
            name = tmp[tmp.length - 1];
            for (int i = 0; i < tmp.length - 1; i++) {
                name += tmp[i].charAt(0);
            }
            res.add(name);
            int cnt = Collections.frequency(res, name);
            if (cnt > 1) name += cnt;
            System.out.println(name + "@ptit.edu.vn");
        }
    }
}
