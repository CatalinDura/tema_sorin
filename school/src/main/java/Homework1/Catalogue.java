package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<StudentCourseInformation> studentsGradesCatalagoue=new ArrayList<StudentCourseInformation>();

    public List<StudentCourseInformation> getStudentsCatalagoue() {
        return studentsGradesCatalagoue;
    }

    public void addStudentInCatalogue(StudentCourseInformation grade){
        studentsGradesCatalagoue.add(grade);
    }

    public void updateStudentGrade(Student student,Course course,Grade grade){
        for(StudentCourseInformation gAux:studentsGradesCatalagoue){
                if(gAux.getStudent().equals(student)&&
               gAux.getCourse().equals(course)) gAux.setGrade(grade);
        }
    }

    public void addAttendenceForStudent(Student student,Course course) {
        for (StudentCourseInformation gAux : getStudentsCatalagoue()) {
            if (gAux.getStudent().equals(student) &&
                    gAux.getCourse().equals(course))
                gAux.setAttendences(gAux.getAttendences() + 1);
        }
    }

    public Grade returnStudentCourseGrade(Course course,Student student){
        for(StudentCourseInformation auxStudent:studentsGradesCatalagoue){
            if(auxStudent.getStudent().equals(student) && auxStudent.getCourse().equals(course)) return auxStudent.getGrade();
        }
        return Grade.NOTGRADED;
    }
}
