package Homework1;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("catalin","23","catalindura97@yahoo.com");
        Student student2=new Student("andrei","20","and@yahoo.com");
        Catalogue catalogue=new Catalogue();
        Course course=new Course("matematica");
        Teacher teacher=new Teacher("Fane","fane@yahoo.com ");
        student1.enroll(course,catalogue);
        student2.enroll(course,catalogue);
        teacher.addAttendencesForStudent(student1,course,catalogue);
        teacher.addAttendencesForStudent(student1,course,catalogue);
        teacher.addAttendencesForStudent(student1,course,catalogue);
        teacher.giveGrade(student1,course,Grade.NINE,catalogue);
        teacher.giveGrade(student2,course,Grade.FOUR,catalogue);
        for(StudentCourseInformation s:catalogue.getStudentsCatalagoue()){
            System.out.println(s.toString());
        }
        System.out.println(student1.checkGrade(course,catalogue));

    }
}
