package codeptit.J06007_BANG_TINH_GIO_CHUAN;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private float hour;

    public Course(Subject subject, Teacher teacher, float hour) {
        this.subject = subject;
        this.teacher = teacher;
        this.hour = hour;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return teacher.getName() + " " + String.format("%.2f", hour);
    }
}
