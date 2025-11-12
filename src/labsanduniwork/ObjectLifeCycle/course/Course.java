package labsanduniwork.ObjectLifeCycle.course;

import java.util.ArrayList;

import labsanduniwork.ObjectLifeCycle.people.Student;
import labsanduniwork.ObjectLifeCycle.people.Teacher;

public class Course {
    String courseName;
    Teacher teacher;
    ArrayList<Student>  enrolledStudents = new ArrayList<>();

    public  Course(String courseName, Teacher teacher,ArrayList<Student>  enrolledStudents ){
        this.courseName = courseName;
        this.teacher = teacher;
        this.enrolledStudents = enrolledStudents;
    }

    public void addStudent(Student student){
        this.enrolledStudents.add(student);
        System.out.println(student.getName() + " was added to list of enrolled students");
    }

    public void courseInfo(){
        System.out.println("The teacher of this course is: " + teacher);
        System.out.println("The list of students enrolled: ");
        for (int x=0; x<enrolledStudents.size(); x++){
            enrolledStudents.get(x).getName();
        }
    }
}
