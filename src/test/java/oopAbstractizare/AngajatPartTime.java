package oopAbstractizare;

public class AngajatPartTime extends Angajat implements AngajatInterface{

    public String contractor;

    public AngajatPartTime(String nume, String prenume, int varsta, String contractor) {
        super(nume, prenume, varsta);
        this.contractor = contractor;
    }

    @Override
    public void mergeLaBirou() {
        System.out.println("Angajatul part time nu trebuie sa mearga la birou.");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul part time primeste salariu.");
    }

    @Override
    public void muncesteUnNumarFixDeOre() {
        System.out.println("Angajatul part time lucreaza 20 ore pe saptamana.");
    }

    @Override
    public void mergeInConcediu() {
        System.out.println("Angajatul part time nu are zile de concediu.");
    }
}
