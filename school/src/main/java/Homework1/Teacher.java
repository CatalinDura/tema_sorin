package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements TeacherInterface{
    private String name;
    private String email;
    private List<Course> teacherCourses=new ArrayList<Course>();

    public Teacher(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void giveGrade(Student student,Course course,Grade grade, Catalogue catalogue) {
        catalogue.updateStudentGrade(student,course,grade);
    }

    public void addAttendencesForStudent(Student student,Course course,Catalogue catalogue){
        catalogue.addAttendenceForStudent(student,course);
    }

    public void addCurriculum(Course course,String curriculum) {
        course.setCurriculum(curriculum);
    }

    public void addCourseForTeacher(Course course){
        teacherCourses.add(course);
    }
}
