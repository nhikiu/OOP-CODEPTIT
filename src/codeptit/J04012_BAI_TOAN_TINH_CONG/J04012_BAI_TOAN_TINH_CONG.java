package codeptit.J04012_BAI_TOAN_TINH_CONG;

import java.util.Scanner;

public class J04012_BAI_TOAN_TINH_CONG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee(1, scanner.nextLine(),
                scanner.nextInt(), scanner.nextInt(), scanner.next());
        System.out.println(employee);
    }
}

class Employee{
    private String id;
    private String name;
    private int basicSalary;
    private int workingDay;
    private String position;

    public Employee() {
    }

    public Employee(int id, String name, int basicSalary,
                    int workingDay, String position) {
        this.id = "NV" + ((id < 10) ? "0" + id : id);
        this.name = name;
        this.basicSalary = basicSalary;
        this.workingDay = workingDay;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary(){
        return basicSalary * workingDay;
    }

    public int getBonus(){
        if (workingDay >= 25) {
            return getSalary() / 5;
        }
        if (workingDay >= 22) {
            return getSalary() / 10;
        }
        return 0;
    }

    public int getAllowance(){
        if (position.equals("GD")) {
            return 250000;
        }
        if (position.equals("PGD")) {
            return 200000;
        }
        if (position.equals("TP")) {
            return 180000;
        }
        if (position.equals("NV")) {
            return 150000;
        }
        return 0;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + getSalary() + " " + getBonus() + " " + getAllowance() + " " + (getSalary() + getBonus() + getAllowance());
    }
}