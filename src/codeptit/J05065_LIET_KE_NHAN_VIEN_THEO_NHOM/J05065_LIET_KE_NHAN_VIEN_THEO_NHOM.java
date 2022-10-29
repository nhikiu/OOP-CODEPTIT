package codeptit.J05065_LIET_KE_NHAN_VIEN_THEO_NHOM;

import java.util.*;

public class J05065_LIET_KE_NHAN_VIEN_THEO_NHOM {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    public static void main(String[] args) {
        input();
        sort();
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            for (Employee employee : employeeList) {
                if (employee.getPosition().equals(s)) {
                    System.out.println(employee);
                }
            }
        }
    }

    public static void input() {
        int numberOfEmployee = scanner.nextInt();
        int gd = 0, tp = 0, pp = 0;
        for (int i = 0; i < numberOfEmployee; i++) {
            String id = scanner.next();
            String name = scanner.nextLine();
            name = name.trim();
            employeeList.add(new Employee(id, name));
            String position = employeeList.get(i).getPosition();
            if (position.equals("GD")) {
                gd++;
                if (gd > 1) {
                    employeeList.get(i).setId(employeeList.get(i).getId().replace("GD", "NV"));
                }
            }
            else if (position.equals("TP")) {
                tp++;
                if (tp > 3) {
                    employeeList.get(i).setId(employeeList.get(i).getId().replace("TP", "NV"));
                }
            }
            else if (position.equals("PP")) {
                pp++;
                if (pp > 3) {
                    employeeList.get(i).setId(employeeList.get(i).getId().replace("PP", "NV"));
                }
            }
        }
    }

    public static void sort() {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o2.getSalaryLevel().equals(o1.getSalaryLevel())) {
                    return o1.getId().compareTo(o2.getId());
                }
                return o2.getSalaryLevel().compareTo(o1.getSalaryLevel());
            }
        });
    }
}

class Employee {
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
}