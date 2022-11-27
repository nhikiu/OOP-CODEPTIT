package codeptit;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class J07040_LIET_KE_THEO_THU_TU_XUAT_HIEN implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("NHIPHAN.in");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();
        TreeSet<String> treeSet = new TreeSet<>();

        list.forEach(i -> {
            String[] tmp = i.trim().toLowerCase().split(" ");
            treeSet.addAll(Arrays.asList(tmp));
        });

        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if (treeSet.contains(s)) {
                System.out.println(s);
                treeSet.remove(s);
            }
        }
    }
}