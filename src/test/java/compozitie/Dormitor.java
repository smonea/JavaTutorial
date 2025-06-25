package compozitie;

public class Dormitor extends Camera{

    public String pat;
    public String televizor;
    public String fotoliu;
    public String noptiera;

    public Dormitor(String nume, int suprafata, String descriere, String pat, String televizor, String fotoliu, String noptiera) {
        super(nume, suprafata, descriere);
        this.pat = pat;
        this.televizor = televizor;
        this.fotoliu = fotoliu;
        this.noptiera = noptiera;
    }

    public void prezentareDormitor(){
        prezentareCamera();
        System.out.println("Patul din dormitor este "+pat);
        System.out.println("Televizorul din dormitor este "+televizor);
        System.out.println("Fotoliul din dormitor este "+fotoliu);
        System.out.println("Noptiera din dormitor este "+noptiera);
    }
}
