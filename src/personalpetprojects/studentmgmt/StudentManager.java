package personalpetprojects.studentmgmt;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public StudentManager(ArrayList<Student> students){
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println(student.name + "was added to students database");
        System.out.println("New database: " + student.toString());
    }

    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                students.remove(i);
                System.out.println(name + " was removed from the database.");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void printAllStudent(){
        if (students.isEmpty()){
            System.out.println("student database is empty");
        }

        for (Student student: students){
            System.out.println("Student name: " + student.name + "Student course: "+ student.course + "\n");
        }
    }

    public void findStudents(String name){
        for (Student student: students){
            if (student.getName().equalsIgnoreCase(name)){
                System.out.println("Found: " + student.getInfo());
                return;
            }
        }
        System.out.println("Student not found.");
    }

}
