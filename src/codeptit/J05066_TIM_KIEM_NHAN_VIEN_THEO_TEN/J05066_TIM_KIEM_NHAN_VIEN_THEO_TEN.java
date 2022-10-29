package codeptit.J05066_TIM_KIEM_NHAN_VIEN_THEO_TEN;

import java.util.*;

public class J05066_TIM_KIEM_NHAN_VIEN_THEO_TEN {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    public static void main(String[] args) {
        input();
        Collections.sort(employeeList);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            String tmp = s.toLowerCase();
            for (Employee employee : employeeList) {
                if (employee.getName().toLowerCase().contains(tmp)) {
                    System.out.println(employee);
                }
            }
        }
    }

    public static void input() {
        int numberOfEmployee = scanner.nextInt();
        int gd = 0, tp = 0, pp = 0, nv = 0;
        for (int i = 0; i < numberOfEmployee; i++) {
            String id = scanner.next();
            String name = scanner.nextLine();
            name = name.trim();
            employeeList.add(new Employee(id, name));
        }
        for (int i = 0; i < employeeList.size(); i++) {
            String position = employeeList.get(i).getPosition();
            int numId = Integer.parseInt(employeeList.get(i).getId().substring(4));
            if (position.equals("GD")) {
                if (numId > 1) {
                    employeeList.get(i).setId(employeeList.get(i).getId().replace("GD", "NV"));
                }
            }
            else if (position.equals("TP")) {
                if (numId > 3) {
                    employeeList.get(i).setId(employeeList.get(i).getId().replace("TP", "NV"));
                }
            }
            else if (position.equals("PP")) {
                if (numId > 3) {
                    employeeList.get(i).setId(employeeList.get(i).getId().replace("PP", "NV"));
                }
            }
        }
    }
}

class Employee implements Comparable<Employee>{
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
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

    public String getPosition() {
        return id.substring(0,2);
    }

    public String getIdNumber() {
        return id.substring(4,7);
    }

    public String getSalaryLevel() {
        return id.substring(2,4);
    }

    @Override
    public String toString() {
        return name + " " + getPosition() + " " + getIdNumber() + " " + getSalaryLevel();
    }

    @Override
    public int compareTo(Employee o) {
        if (o.getSalaryLevel().equals(this.getSalaryLevel())) {
            return this.id.compareTo(o.id);
        }
        return o.getSalaryLevel().compareTo(this.getSalaryLevel());
    }
}