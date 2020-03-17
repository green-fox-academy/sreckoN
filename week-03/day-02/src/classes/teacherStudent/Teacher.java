package classes.teacherStudent;

public class Teacher {

    public void teach(Student student) {
        student.learn();
    }

    public void answer() {
        System.out.println("The teacher is answering a question.");
    }
}
