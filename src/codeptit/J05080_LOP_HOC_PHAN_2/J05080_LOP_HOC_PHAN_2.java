package codeptit.J05080_LOP_HOC_PHAN_2;

import java.util.*;

public class J05080_LOP_HOC_PHAN_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Class> classes = new ArrayList<>();
        while (n-- > 0) {
            classes.add(new Class(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(classes);

        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String teacher = scanner.nextLine();
            System.out.println("Danh sach cho giang vien " + teacher + ":");
            for (Class c : classes) {
                if (teacher.equals(c.getNameOfTeacher())) {
                    System.out.println(c);
                }
            }
        }
    }

}

class Class implements Comparable<Class>{
    private String id;
    private String name;
    private String ordinal;
    private String nameOfTeacher;

    public Class(String id, String name, String ordinal, String nameOfTeacher) {
        this.id = id;
        this.name = name;
        this.ordinal = ordinal;
        this.nameOfTeacher = nameOfTeacher;
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

    public String getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + ordinal;
    }

    @Override
    public int compareTo(Class o) {
        if (this.id.equals(o.id)) {
            return this.ordinal.compareTo(o.ordinal);
        }
        return this.id.compareTo(o.id);
    }
}