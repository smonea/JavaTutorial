package compozitie;

public class Camera {

    public String nume;
    public int suprafata;
    public String descriere;

    public Camera(String nume, int suprafata, String descriere) {
        this.nume = nume;
        this.suprafata = suprafata;
        this.descriere = descriere;
    }

    public void prezentareCamera(){
        System.out.println("Numele camerei este "+nume);
        System.out.println("Suprafata camerei este "+suprafata);
        System.out.println("Descrierea camerei este "+descriere);
    }
}
