package codeptit.J04022_WORDSET;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {
    private TreeSet<String> treeSet;

    public WordSet(String s) {
        treeSet = new TreeSet<>();
        String[] tmp = s.toLowerCase().split("\\s+");
        for (int i = 0; i < tmp.length; i++) {
            treeSet.add(tmp[i]);
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

    public WordSet union(WordSet s) {
        TreeSet<String> t = new TreeSet<>();
        t.addAll(treeSet);
        t.addAll(s.getTreeSet());
        return new WordSet(t);
    }

    public WordSet intersection(WordSet b) {
        TreeSet<String> t = new TreeSet();
        for (String s : treeSet) {
            if (b.getTreeSet().contains(s)) {
                t.add(s);
            }
        }
        return new WordSet(t);
    }

    @Override
    public String toString() {
        return String.join(" ", treeSet);
    }
}