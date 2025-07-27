package oopAbstractizare2;

public abstract class Persoana {

    //Abstractizare = conceptul prin care definim comportamentul unei clase.
    //Clasa abstracta se identifica prin cuvantul abstract la nivelul clasei.
    //O clasa abstracta poate sau nu sa contina metode abstracte.
    //Intr-o clasa abstracta putem avea metode de tip public, private, protected.
    //Intr-o clasa abstracta putem avea un constructor => nu putem face un obiect dintr-o clasa abstracta.
    //O clasa poate mosteni o singura clasa/clasa abstracta.
    //Cand o clasa abstracta este mostenita trebuie sa i se implementeze toate metodele abstracte.

    public String nume;
    public String prenume;
    public int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public abstract void mergeLaBirou();
    public abstract void primesteSalariu();
    public abstract void muncesteUnNumarFixDeOre();
    public abstract void mergeInConcediu();

    public abstract void mergeLaFacultate();
    public abstract void mergeInVacanta();
    public abstract void primesteBursa();

}
