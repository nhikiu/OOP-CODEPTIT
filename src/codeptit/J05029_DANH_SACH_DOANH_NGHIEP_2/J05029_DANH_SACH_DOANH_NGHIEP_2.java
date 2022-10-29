package codeptit.J05029_DANH_SACH_DOANH_NGHIEP_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05029_DANH_SACH_DOANH_NGHIEP_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<Company> arrayList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            arrayList.add(new Company(scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
        }

        Collections.sort(arrayList, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                if (o1.getNumberOfStudent() == o2.getNumberOfStudent()){
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.getNumberOfStudent() < o2.getNumberOfStudent() ? 1 : -1;
            }
        });

        int Q = scanner.nextInt();
        while (Q-- > 0) {
            int left = scanner.nextInt(), right = scanner.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + left+ " DEN " + right + " SINH VIEN:");
            for (int i = 0; i < t; i++) {
                if (arrayList.get(i).getNumberOfStudent() >= left && arrayList.get(i).getNumberOfStudent() <= right) {
                    System.out.println(arrayList.get(i));
                }
            }
        }
    }
}

class Company{
    private String id;
    private String name;
    private int numberOfStudent;

    public Company(String id, String name, int numberOfStudent) {
        this.id = id;
        this.name = name;
        this.numberOfStudent = numberOfStudent;
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

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberOfStudent;
    }
}