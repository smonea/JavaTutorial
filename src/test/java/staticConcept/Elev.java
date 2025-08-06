package staticConcept;

public class Elev {

    //Static = reprezinta o modalitate prin care putem accesa o variabila/metoda dintr-o clasa.
    //In momentul cand folosim acest keyword nu mai este nevoie sa facem un obiect.
    //Putem considera acest concept ca fiind proprietatea comuna pentru toate obiectele.

    public String nume;
    public String prenume;
    public static String scoala = "JJK Highschool";
    public static int nrEcuson = 0;

    public Elev(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        nrEcuson++;
    }

    public void prezentareElev(){
        System.out.println("Numele elevului este "+nume);
        System.out.println("Prenumele elevului este "+prenume);
        System.out.println("Scoala elevului este "+scoala);
        System.out.println("Numarul ecusonului este "+nrEcuson);
    }
}
