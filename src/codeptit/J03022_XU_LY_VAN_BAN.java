package codeptit;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Ctrl + D: ket thuc input

public class J03022_XU_LY_VAN_BAN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //input
        while (true) {
            try {
                String s = sc.nextLine().trim().toLowerCase();
                String[] tmp = s.split("\\s+");
                for (int i = 0; i < tmp.length; i++) {
                    if (tmp[i].substring(tmp[i].length() - 1).matches("[,?.!:]")) {
                        list.add(tmp[i].substring(0, tmp[i].length() - 1)); //them tung tu
                        list.add(tmp[i].substring(tmp[i].length() - 1)); //them dau
                    } else {
                        list.add(tmp[i]);
                    }
                }

            } catch (Exception e) {
                break;
            }
        }

        //xu ly van ban
        String res = "";
        for (String i : list) {
            if (i.matches("[.!?]")) {
                System.out.println(res);
                res = "";
            } else if (i.matches("[,:]")) {
                res = res.substring(0, res.length() - 1) + i + " ";
            } else {
                if (res.equals("")) {
                    res += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
                } else {
                    res += i + " ";
                }
            }
        }
        if (!res.equals("")) {
            System.out.println(res);
        }
    }
}