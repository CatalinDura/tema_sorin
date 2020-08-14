package Homework1;

public class StudentCourseInformation {
    private Course course;
    private Grade grade;
    private Student student;
    private int attendences;

    public StudentCourseInformation(Course course, Student student) {
        this.course = course;
        this.grade = Grade.NOTGRADED;
        this.student = student;
        this.attendences=0;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAttendences() {
        return attendences;
    }

    public void setAttendences(int attendences) {
        this.attendences = attendences;
    }

    @Override
    public String toString() {
        return "StudentCourseInformation{" +
                "course=" + course.toString() +
                ", grade=" + grade +
                ", student=" + student.toString() +
                ", attendences=" + attendences +
                '}';
    }
}
