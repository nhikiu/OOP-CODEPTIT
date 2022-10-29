package codeptit.J05045_SAP_XEP_NHAN_VIEN_THEO_THU_NHAP;

import java.util.*;

public class J05045_SAP_XEP_NHAN_VIEN_THEO_THU_NHAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<Employee> arrayList = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            arrayList.add(new Employee(i + 1, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(arrayList, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() + o1.getAllowance() == o2.getSalary() + o2.getAllowance()){
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.getSalary() + o1.getAllowance() < o2.getSalary() + o2.getAllowance() ? 1 : -1;
            }

        });

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

class Employee{
    private int id;
    private String name;
    private String position;
    private int basicSalary;
    private int workingDays;

    public Employee(int id, String name, String position, int basicSalary, int workingDays) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.workingDays = workingDays;
    }

    public String getId() {
        return String.format("NV%02d", id);
    }

    public int getAllowance(){
        switch (position) {
            case "GD":
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            default:
                return 100;
        }
    }

    public int getSalary(){
        return basicSalary * workingDays;
    }

    public int getAdvancePayment(){
        double advancePayment = (getSalary() + getAllowance()) * 2 / 3;
        if (advancePayment < 25000) {
            return (int) Math.round(advancePayment/1000) * 1000;
        }
        return 25000;
    }

    public int getNetIncome(){
        return getSalary() + getAllowance() - getAdvancePayment();
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + getAllowance() + " " + getSalary() + " " + getAdvancePayment() + " " + getNetIncome();
    }
}