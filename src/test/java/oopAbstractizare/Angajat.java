package oopAbstractizare;

public class Angajat {

    //Abstractizare = conceptul prin care putem defini comportamentul unei clase.
    //Acest concept se poate realiza prin interfete sau clase abstracte.
    //Recunoastem o interfata pe baza cuvantului interface.
    //O interfata contine doar metode abstracte(metoda fara body).
    //Toate metodele dintr-o interfata sunt publice.
    //Nu avem constructor in interfata => nu putem face obiect tip interfata.
    //O interfata se implementeaza.
    //O clasa poate implementa una sau mai multe interfete/o interfata poate sa fie implementata de una sau mai multe clase.
    //In momentul cand o clasa implementeaza o interfata trebuia sa implementeze toate metodele din interfata.

    private String nume;
    private String prenume;
    private int varsta;

    public Angajat(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void prezentareAngajat(){
        System.out.println("Numele angajatului este "+nume);
        System.out.println("Prenumele angajatului este "+prenume);
        System.out.println("Varsta angajatului este "+varsta);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
