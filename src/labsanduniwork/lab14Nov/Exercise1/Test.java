package labsanduniwork.lab14Nov.Exercise1;

public class Test {
    public static void main(String[] args) {
        Singer ivan = new Singer("Ivan Nazaruk", 19);

        if (ivan.getAge()>18){
            System.out.println(ivan.getName() + "is an adult.");
        }

        //duet creating
        Singer singerChris = new Singer("Chris", 34);
        Singer singerMaria = new Singer("Maria", 30);

        Duet ChrisAndMaria = new Duet(singerChris, singerMaria);
        System.out.println(ChrisAndMaria.reBothProfessional());

        Singer singerTom = new Singer("Tom", 24);
        Singer singerDima = new Singer("Dima", 19);

        Duet TomAndDima = new Duet(singerTom, singerDima);

        Quatuor cityQuatuor = new Quatuor(ChrisAndMaria, TomAndDima);

        System.out.println(cityQuatuor.getDuetDetails());
    }




}