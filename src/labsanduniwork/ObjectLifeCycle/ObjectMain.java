package labsanduniwork.ObjectLifeCycle;



import labsanduniwork.ObjectLifeCycle.course.Course;
import labsanduniwork.ObjectLifeCycle.people.Student;
import labsanduniwork.ObjectLifeCycle.people.Teacher;

import java.util.ArrayList;

public class ObjectMain {

    public static void main(String[] args) {
        //The life cycle of an object
        Student Ivan  = new Student("Ivan", 19, "CSG1002", 89);
        Student Dmytro = new Student("Dmytro", 19, "RUL1002", 95);
        Teacher teacher1 = new Teacher("John Smith", 45, "Computer Science");

        Student student1 = new Student("Ivan", 19, "S001", 89.5);
        Student student2 = new Student("Denys", 20, "S002", 76.4);
        Student student3 = new Student("Matteo", 18, "S003", 92.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Course javaCourse = new Course("Java Programming", teacher1, students);

        javaCourse.addStudent(new Student("Nazar", 21, "S004", 81.2));
        javaCourse.courseInfo();

        System.out.println(student1.Introduce());
        System.out.println(teacher1.Introduce());

        student2.setGrade(88.0);
        System.out.println(student2.Introduce());




    }

}