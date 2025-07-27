package oopAbstractizare;

public class AngajatFullTime extends Angajat implements AngajatInterface{

    private String firma;

    public AngajatFullTime(String nume, String prenume, int varsta, String firma) {
        super(nume, prenume, varsta);
        this.firma = firma;
    }

    @Override
    public void mergeLaBirou() {
        System.out.println("Angajatul full time trebuie sa mearga la birou.");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul full time primeste salariu.");
    }

    @Override
    public void muncesteUnNumarFixDeOre() {
        System.out.println("Angajatul full time lucreaza 40 ore pe saptamana.");
    }

    @Override
    public void mergeInConcediu() {
        System.out.println("Angajatul full time merge in concediu.");
    }
}
