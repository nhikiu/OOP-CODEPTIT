package codeptit.J05079_LOP_HOC_PHAN_1;

import java.util.*;

public class J05079_LOP_HOC_PHAN_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<LopHocPhan> classes = new ArrayList<>();
        while (n-- > 0) {
            classes.add(new LopHocPhan(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(classes);

        int t = scanner.nextInt();
        while (t-- > 0) {
            String id = scanner.next();
            String tmp = "";
            for (LopHocPhan c : classes) {
                if (id.equals(c.getId())) {
                    tmp = c.getName();
                    break;
                }
            }
            System.out.println("Danh sach nhom lop mon " + tmp + ":");
            for (LopHocPhan c : classes) {
                if (id.equals(c.getId())) {
                    System.out.println(c);
                }
            }
        }
    }

}

class LopHocPhan implements Comparable<LopHocPhan>{
    private String id;
    private String name;
    private String ordinal;
    private String nameOfTeacher;

    public LopHocPhan(String id, String name, String ordinal, String nameOfTeacher) {
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
        return ordinal + " " + nameOfTeacher;
    }

    @Override
    public int compareTo(LopHocPhan o) {
        return this.ordinal.compareTo(o.ordinal);
    }
}