package personalpetprojects.studentmgmt;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager(new ArrayList<>());

        ArrayList<Integer> gradesIvan = new ArrayList<>();
        gradesIvan.add(85);
        gradesIvan.add(90);
        gradesIvan.add(78);

        ArrayList<Integer> gradesDenys = new ArrayList<>();
        gradesDenys.add(60);
        gradesDenys.add(70);
        gradesDenys.add(80);

        Student ivan = new Student("Ivan", "Computer Science", 1, "Home", true, gradesIvan);
        Student denys = new Student("Denys", "Business", 2, "International", false, gradesDenys);

        manager.addStudent(ivan);
        manager.addStudent(denys);

        manager.printAllStudent();

        manager.findStudents("Ivan");

        manager.removeStudent("Denys");

        manager.printAllStudent();

        scanner.close();
    }
}