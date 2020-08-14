package Homework1;

import java.util.List;

public class Student implements StudentInterface {
    private String name;
    private String age;
    private String email;


    public Student(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void enroll(Course course, Catalogue catalogue) {
        catalogue.addStudentInCatalogue(new StudentCourseInformation(course,this));
    }

    public Grade checkGrade(Course course,Catalogue catalogue) {
        return catalogue.returnStudentCourseGrade(course,this);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
