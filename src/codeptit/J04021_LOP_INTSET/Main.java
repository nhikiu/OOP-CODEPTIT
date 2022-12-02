package codeptit.J04021_LOP_INTSET;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

class IntSet {
    private TreeSet<Integer> treeSet;

    public IntSet(int[] a) {
        treeSet = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            treeSet.add(a[i]);
        }
    }

    public IntSet(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    public TreeSet<Integer> getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    public IntSet union(IntSet b) {
        TreeSet<Integer> res = new TreeSet<>();
        res.addAll(treeSet);
        res.addAll(b.getTreeSet());
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for (Integer i : treeSet) {
            res += i + " ";
        }
        return res;
    }
}