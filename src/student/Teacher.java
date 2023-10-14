package student;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluateStudent(Student student) {
        Random random = new Random();
        int[] grades = {2,3,4,5};
        int grade = random.nextInt(grades.length);
        String evaluation = "";
        switch (grade) {
            case 0 -> evaluation = "неудовлетворительно";
            case 1 -> evaluation = "удовлетворительно";
            case 2 -> evaluation = "хорошо";
            case 3 -> evaluation = "отлично";
        }
        System.out.println("Преподаватель " + this.name +
                " оценил студента с именем " + student.getName() + 
                " по предмету " + this.subject + " на оценку " + evaluation);
    }
}
