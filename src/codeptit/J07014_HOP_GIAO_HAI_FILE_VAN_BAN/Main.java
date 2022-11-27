package codeptit.J07014_HOP_GIAO_HAI_FILE_VAN_BAN;

import java.io.*;
import java.util.*;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {
    private TreeSet<String> treeSet;

    public WordSet(String file) throws FileNotFoundException {
        treeSet = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            treeSet.add(s);
        }
    }

    public WordSet(TreeSet<String> treeSet) {
        this.treeSet = treeSet;
    }

    public TreeSet<String> getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(TreeSet<String> treeSet) {
        this.treeSet = treeSet;
    }

    public WordSet union(WordSet b) {
        TreeSet ts = new TreeSet<>();
        ts.addAll(treeSet);
        ts.addAll(b.getTreeSet());
        return new WordSet(ts);
    }

    public WordSet intersection(WordSet b) {
        TreeSet ts = new TreeSet<>();
        treeSet.forEach(s -> {
            if (b.getTreeSet().contains(s)) {
                ts.add(s);
            }
        });
        return new WordSet(ts);
    }

    @Override
    public String toString() {
        return String.join(" ", treeSet);
    }
}