package labsanduniwork.labs.lab_05Nov;

public class Student {
    String name;
    int IDnumber;
    int[] marks = new int[10];


    public Student(String name, int IDnumber){
        this.name = name;
        this.IDnumber = IDnumber;
    }

    public void updateMark(int mark, int index){
        for (int x = 0; x<marks.length; x++){
            if (x == index){
                marks[x] = mark;
            }
        }
    }

    public void numOfNumbers(){
        if (marks.length<40){
            System.out.println(marks.length);
        } else {
            System.out.println("The number of numbers are below 40.");
        }
    }

    public void addMark(int mark) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 0) {
                marks[i] = mark;
                System.out.println("Mark " + mark + " added at position " + i);
                return;
            }
        }
        System.out.println("No space left to add more marks.");
    }

    String getName(){
        return this.name;
    }
}
