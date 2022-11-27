package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class J07029_SO_NGUYEN_TO_LON_NHAT_TRONG_FILE implements Serializable {
    private static int[] prime = new int[1000001];
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("DATA.in");;
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);;
        ArrayList<Integer> integerList = (ArrayList<Integer>) objectInputStream.readObject();
        int[] count = new int[1000001];

        sangNguyenTo();
        integerList.forEach(i -> {
            count[i] += prime[i];
        });

        int d = 0;
        for (int i = 1000000; i >= 2; i--) {
            if (count[i] > 0) {
                d++;
                System.out.println(i + " " + count[i]);
                if (d == 10) break;
            }
        }
    }

    private static void sangNguyenTo(){
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
}
