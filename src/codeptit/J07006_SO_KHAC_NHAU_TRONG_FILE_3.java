package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006_SO_KHAC_NHAU_TRONG_FILE_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("DATA.in");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Integer> list = (ArrayList<Integer>) objectInputStream.readObject();
        int[] mark = new int[1000];
        list.forEach(i -> {
            mark[i]++;
        });
        for (int i = 0; i < 1000; i++) {
            if (mark[i] > 0) {
                System.out.println(i + " " + mark[i]);
            }
        }
    }
}
