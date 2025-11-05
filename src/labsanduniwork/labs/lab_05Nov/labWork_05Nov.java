package labsanduniwork.labs.lab_05Nov;

public class labWork_05Nov {
    public static void main(String[] args) {
        Car mini_cooper = new Car("Mini Cooper", 180, 40000);
        Sportperson ivan = new Sportperson("Ivan", "Football");
        Student ivanst = new Student("ivan", 1281231);
        //i will update the age to my age here
        for (int x = 0; x <= 18; x++){
            ivan.addAge();
        }

        System.out.println(ivan.age);

        ivanst.addMark(50);

        for (int x = 0; x< ivanst.marks.length; x++){
            System.out.print(ivanst.marks[x] +  "|");
        }


        Student s1 = new Student("Ivan", 101);
        Student s2 = new Student("Denys", 102);

        Group group = new Group(s1, s2);

        System.out.println("__________");
        System.out.println("Second student in the group is: " + group.getSecondStudent().getName());

    }
}
