package MVCPatternExample;
public class MVCTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", "S123", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Alice Bob");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
