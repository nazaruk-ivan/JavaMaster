package labsanduniwork.lab14Nov.Exercise1;

public class Duet {
    private Singer singer1;
    private Singer singer2;

    public Duet(Singer singer1, Singer singer2){
        this.singer1 = singer1;
        this.singer2 = singer2;
    }

    public Boolean reBothProfessional(){
        if (singer1.isProfessional() && singer2.isProfessional()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return singer1.getName() + " & " + singer2.getName();
    }
}
