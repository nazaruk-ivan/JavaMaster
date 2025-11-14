package labsanduniwork.lab14Nov.Exercise1;

public class Quatuor {
    private Duet duet1;
    private Duet duet2;

    public Quatuor(Duet duet1, Duet duet2){
        this.duet1 = duet1;
        this.duet2 = duet2;
    }

    public String getDuetDetails(){
        return duet1.toString() + " | " + duet2.toString();
    }

    public void setDuets(Duet duet1New, Duet duet2New){
        this.duet1 = duet1New;
        this.duet2 = duet2New;
        System.out.println("Duets was re-initialized.");
    }
}
