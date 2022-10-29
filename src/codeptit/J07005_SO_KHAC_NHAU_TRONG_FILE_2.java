package codeptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J07005_SO_KHAC_NHAU_TRONG_FILE_2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1000];

        for (int i = 0; i < 100000; i++) {
            a[dataInputStream.readInt()]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}