package codeptit.J07034_DANH_SACH_MON_HOC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07034_DANH_SACH_MON_HOC {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(scanner.nextLine());
        List<Subject> subjects = new ArrayList<>();
        while (t-- > 0) {
            subjects.add(new Subject(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        Collections.sort(subjects);
        subjects.forEach(System.out::println);
    }
}

class Subject implements Comparable<Subject>{
    private String id;
    private String name;
    private int credit;

    public Subject(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + credit;
    }

    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.name);
    }
}