package codeptit.J06008_TINH_GIO_CHUAN_CHO_TUNG_GIANG_VIEN;

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
        return subject.getName() + " " + hour;
    }
}