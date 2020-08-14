package Homework1;

public interface TeacherInterface {
    public void giveGrade(Student student,Course course,Grade grade, Catalogue catalogue);
    public void addCurriculum(Course course,String curriculum);
    public void addAttendencesForStudent(Student student,Course course,Catalogue catalogue);
}
