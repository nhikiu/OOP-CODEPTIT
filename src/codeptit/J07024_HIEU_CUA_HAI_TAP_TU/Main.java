package codeptit.J07024_HIEU_CUA_HAI_TAP_TU;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.util.TreeSet;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

class WordSet {
    private TreeSet<String> treeSet;

    public WordSet(String file) throws FileNotFoundException {
        treeSet = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNext()) {
            treeSet.add(sc.next().toLowerCase());
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

    public WordSet difference(WordSet b) {
        TreeSet ans = new TreeSet();
        treeSet.forEach(s -> {
            if (!b.getTreeSet().contains(s)) {
                ans.add(s);
            }
        });
        return new WordSet(ans);
    }

    @Override
    public String toString() {
        return String.join(" ", treeSet);
    }
}