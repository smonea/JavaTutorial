package Teme;

public class Sportiv {

    public String sport;
    public String nume;
    public int medaliiAur;
    public int medaliiArgint;
    public int medaliiBronz;
    public int varsta;
    public double greutate;

    public Sportiv(String sport, String nume, int medaliiAur, int medaliiArgint, int medaliiBronz, int varsta, double greutate) {
        this.sport = sport;
        this.nume = nume;
        this.medaliiAur = medaliiAur;
        this.medaliiArgint = medaliiArgint;
        this.medaliiBronz = medaliiBronz;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public void prezentareSportiv(){
        System.out.println("Sport: "+sport);
        System.out.println("Nume: "+nume);
        System.out.println("Medalii de Aur: "+medaliiAur);
        System.out.println("Medalii de Argint: "+medaliiArgint);
        System.out.println("Medalii de Bronz: "+medaliiBronz);
        System.out.println("Varsta: "+varsta);
        System.out.println("Greutate in kg: "+greutate);
    }
}
