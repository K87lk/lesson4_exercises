package student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Иван Иванов");
        Teacher teacher = new Teacher("Петр Петров", "геометрия");

        teacher.evaluateStudent(student);
    }
}
