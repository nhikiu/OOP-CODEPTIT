package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J07015_SO_NGUYEN_TO_FILE_NHI_PHAN implements Serializable {
    private static int[] prime = new int[10000];
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Integer> integerList = new ArrayList<>();
        int[] count = new int[10000];

        sangNguyenTo();

        try {
            fileInputStream = new FileInputStream("SONGUYEN.in");
            objectInputStream = new ObjectInputStream(fileInputStream);
            integerList = (List<Integer>) objectInputStream.readObject();
        } catch (Exception exception){

        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }

        integerList.forEach(i -> {
            count[i] += prime[i];
        });

        for (int i = 2; i < 10000; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }

    private static void sangNguyenTo(){
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 100; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < 10000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
}
