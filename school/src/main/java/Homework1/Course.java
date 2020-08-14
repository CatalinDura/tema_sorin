package Homework1;

public class Course {
    private String name;
    private String curriculum;

    public Course(String name, String curriculum) {
        this.name = name;
        this.curriculum = curriculum;
    }

    public Course(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", curriculum='" + curriculum + '\'' +
                '}';
    }
}
