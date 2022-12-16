package codeptit.J05078_BANG_LUONG_THEO_PHONG_BAN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Department> departments = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            departments.add(new Department(sc.nextLine()));
        }

        ArrayList<Employee> employees = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            employees.add(new Employee(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        String department = sc.nextLine();
        String s = "";
        for (Department d : departments) {
            if (d.getId().equals(department)) {
                System.out.println("Bang luong phong " + d.getName() + ":");
            }
        }
        for (Employee employee : employees) {
            if (employee.getId().substring(3, 5).equals(department)) {
                System.out.println(employee);
            }
        }
    }
}

class Department {
    private String id;
    private String name;

    public Department(String s) {
        String[] tmp = s.split(" ");
        this.id = tmp[0];
        String res = "";
        for(int i = 1; i < tmp.length; i++) {
            res += tmp[i] + " ";
        }
        this.name = res.trim();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Employee {
    private String id;
    private String name;
    private int basicSalary;
    private int workingDays;

    public Employee(String id, String name, int basicSalary, int workingDays) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.workingDays = workingDays;
    }

    public String getId() {
        return id;
    }

    private int getSalaryScale(){
        char group = id.charAt(0);
        int exp = Integer.parseInt(id.substring(1, 3));
        if (group == 'A') {
            if (exp >= 1 && exp <= 3) return 10;
            if (exp >= 4 && exp <= 8) return 12;
            if (exp >= 9 && exp <= 15) return 14;
            if (exp >= 16) return 20;
        }
        if (group == 'B') {
            if (exp >= 1 && exp <= 3) return 10;
            if (exp >= 4 && exp <= 8) return 11;
            if (exp >= 9 && exp <= 15) return 13;
            if (exp >= 16) return 16;
        }
        if (group == 'C') {
            if (exp >= 1 && exp <= 3) return 9;
            if (exp >= 4 && exp <= 8) return 10;
            if (exp >= 9 && exp <= 15) return 12;
            if (exp >= 16) return 14;
        }
        if (group == 'D') {
            if (exp >= 1 && exp <= 3) return 8;
            if (exp >= 4 && exp <= 8) return 9;
            if (exp >= 9 && exp <= 15) return 11;
            if (exp >= 16) return 13;
        }
        return 1;
    }

    public int getSalary() {
        return basicSalary * workingDays * getSalaryScale() * 1000;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getSalary();
    }
}