package codeptit.J06008_TINH_GIO_CHUAN_CHO_TUNG_GIANG_VIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Subject> subjects;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    public static void inputSubject() {
        subjects = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            subjects.add(new Subject(sc.nextLine()));
        }
    }

    public static void inputTeacher() {
        teachers = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            teachers.add(new Teacher(sc.nextLine()));
        }
    }

    public static void inputCourse() {
        courses = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            Subject subject = null;
            Teacher teacher = null;
            String idTeacher = sc.next();
            for (Teacher tea : teachers) {
                if (idTeacher.equals(tea.getId())) {
                    teacher = tea;
                }
            }

            String idSubject = sc.next();
            for (Subject s : subjects) {
                if (idSubject.equals(s.getId())) {
                    subject = s;
                }
            }

            float hour = sc.nextFloat();
            if (subject != null && teacher != null) {
                boolean b = false;
                for (int i = 0; i < courses.size(); i++) {
                    if (teacher.getId().equals(courses.get(i).getTeacher().getId()) &&
                            subject.getId().equals(courses.get(i).getSubject().getId())) {
                        b = true;
                    }
                }
                if (!b) courses.add(new Course(subject, teacher, hour));
            }
        }
    }

    public static void output() {
        String idTeacher = sc.next();
        int res = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (idTeacher.equals(courses.get(i).getTeacher().getId())) {
                res = i;
                break;
            }
        }
        float sum = 0.0F;
        if (res >= 0) {
            System.out.println("Giang vien: " + courses.get(res).getTeacher().getName());
            for (int i = 0; i < courses.size(); i++) {
                if (idTeacher.equals(courses.get(i).getTeacher().getId())) {
                    System.out.println(courses.get(i));
                    sum += courses.get(i).getHour();
                }
            }
            System.out.println("Tong: " + String.format("%.2f", sum));
        }
    }

    public static void main(String[] args) {
        inputSubject();
        inputTeacher();
        inputCourse();
        output();
    }
}