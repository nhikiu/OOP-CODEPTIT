package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.ArrayList;

public class J07085_TONG_CHU_SO {
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("DATA.in");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();
        for (String s : list) {
            long sum = 0;
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    int tmp = Integer.parseInt("" + s.charAt(i));
                    sum += tmp;
                    res += s.charAt(i);
                }
            }
            System.out.println(removeZero(res) + " " + sum);
        }
    }

    public static String removeZero(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                res = i;
                break;
            }
        }
        return s.substring(res);
    }
}
