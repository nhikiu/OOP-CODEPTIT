package codeptit.J07084_THOI_GIAN_ONLINE_LIEN_TUC;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while (t-- > 0) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.sort((o1, o2) -> {
            if (o1.getMinute() == o2.getMinute()) {
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getMinute() < o2.getMinute() ? 1 : -1;
        });
        students.forEach(System.out::println);
    }
}

class Student {
    private String name;
    private LocalDateTime begin;
    private LocalDateTime end;

    public Student(String name, String b, String e) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.name = name;
        this.begin = LocalDateTime.parse(b, dtf);
        this.end = LocalDateTime.parse(e, dtf);
    }

    public String getName() {
        return name;
    }

    public int getMinute() {
        return (int) Duration.between(begin, end).toMinutes();
    }

    @Override
    public String toString() {
        return name + " " + getMinute();
    }
}