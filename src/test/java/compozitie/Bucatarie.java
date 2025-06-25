package compozitie;

public class Bucatarie extends Camera{

    public String aragaz;
    public String televizor;
    public String frigider;

    public Bucatarie(String nume, int suprafata, String descriere, String aragaz, String televizor, String frigider) {
        super(nume, suprafata, descriere);
        this.aragaz = aragaz;
        this.televizor = televizor;
        this.frigider = frigider;
    }

    public void prezentareBucatarie(){
        prezentareCamera();
        System.out.println("Aragazul din bucatarie este "+aragaz);
        System.out.println("Televizorul din bucatarie este "+televizor);
        System.out.println("Frigiderul din bucatarie este "+frigider);
    }
}
