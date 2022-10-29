package codeptit.J04015_TINH_THU_NHAP_GIAO_VIEN;

import java.util.Scanner;

public class J04015_TINH_THU_NHAP_GIAO_VIEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
        System.out.println(teacher);
    }
}

class Teacher{
    private String id;
    private String name;
    private int basicSalary;
    private String position;
    private int salaryLevel;
    private int allowance;

    public Teacher(String id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getPosition() {
        return id.substring(0,2);
    }

    public int getSalaryLevel() {
        return Integer.parseInt(id.substring(2));
    }

    public int getAllowance() {
        if(getPosition().equals("HT")) return 2000000;
        if(getPosition().equals("HP")) return 900000;
        if(getPosition().equals("GV")) return 500000;
        return 0;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + getSalaryLevel() + " " + getAllowance()
                + " " + (basicSalary * getSalaryLevel() + getAllowance());
    }
}