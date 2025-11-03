package personalpetprojects.studentmgmt;

import java.util.ArrayList;

public class Student {
    String name;
    String course;
    int year;
    String fee_status;
    Boolean withPlacement;
    ArrayList<Integer> grades= new ArrayList<>();

    public Student(String name, String course, int year, String fee_status, Boolean withPlacement, ArrayList<Integer> grades){
        this.name = name;
        this.course = course;
        this.year = year;
        this.fee_status = fee_status;
        this.withPlacement = withPlacement;
        this.grades = grades;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
        System.out.println("New name: " + newName);
    }

    public void addGrade(int gradeToAdd){
        grades.add(gradeToAdd);
        System.out.println("New grades list for " + this.name + ": " + grades);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int x = 0; x < grades.size(); x++) {
            sum += grades.get(x);
        }

        double average = (double) sum / grades.size();
        return average;
    }

    public String getInfo(){
        return "Student name: " + name +
                ", Course: " + course +
                ", Year: " + year +
                ", Fee status: " + fee_status +
                ", With placement year: " + withPlacement +
                ", Grades: " + grades +
                ", Average: " + getAverageGrade();
    }

    @Override
    public String toString() {
        return getInfo();
    }
}

