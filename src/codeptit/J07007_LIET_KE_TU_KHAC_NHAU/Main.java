package codeptit.J07007_LIET_KE_TU_KHAC_NHAU;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

class WordSet {
    private TreeSet<String> treeSet;

    public WordSet(String file) throws IOException{
        treeSet = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNext()) {
            treeSet.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        return String.join("\n", treeSet);
    }
}