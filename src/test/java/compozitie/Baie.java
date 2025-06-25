package compozitie;

public class Baie extends Camera{
    public String cada;
    public String cabina;
    public String wc;

    public Baie(String nume, int suprafata, String descriere, String cada, String cabina, String wc) {
        super(nume, suprafata, descriere);
        this.cada = cada;
        this.cabina = cabina;
        this.wc = wc;
    }

    public void prezentareBaie(){
        prezentareCamera();
        System.out.println("Cada din baie este "+cada);
        System.out.println("Cabina din baie este "+cabina);
        System.out.println("Wc din baie este "+wc);
    }
}

