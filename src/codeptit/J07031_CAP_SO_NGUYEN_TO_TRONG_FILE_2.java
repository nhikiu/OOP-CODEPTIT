package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07031_CAP_SO_NGUYEN_TO_TRONG_FILE_2 {
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //prime in DATA1.in.in
        FileInputStream fileInputStream1 = new FileInputStream("DATA1.in.in");
        ObjectInputStream objectInputStream1= new ObjectInputStream(fileInputStream1);
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream1.readObject();
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        list1.forEach(i -> {
            if (isPrime(i)) {
                treeSet1.add(i);
            }
        });

        //prime in DATA2.in
        FileInputStream fileInputStream2 = new FileInputStream("DATA2.in");
        ObjectInputStream objectInputStream2= new ObjectInputStream(fileInputStream2);
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();
        TreeSet<Integer> treeSet2 = new TreeSet<>();

        list2.forEach(i -> {
            if (isPrime(i)) {
                treeSet2.add(i);
            }
        });

        treeSet1.forEach(i -> {
            if (i * 2 >= 1000000) {
                return;
            }
            if (treeSet1.contains(1000000 - i) && !treeSet2.contains(i) && !treeSet2.contains(1000000 - i)) {
                System.out.println(i + " " + (1000000 - i));
            }
        });
    }
}
