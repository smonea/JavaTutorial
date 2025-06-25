package compozitie;

public class Living extends Camera{

    public String televizor;
    public String canapea;
    public String masa;

    public Living(String nume, int suprafata, String descriere, String televizor, String canapea, String masa) {
        super(nume, suprafata, descriere);
        this.televizor = televizor;
        this.canapea = canapea;
        this.masa = masa;
    }

    public void prezentareLiving(){
        prezentareCamera();
        System.out.println("Televizorul din living este "+televizor);
        System.out.println("Canapeaua din living este "+canapea);
        System.out.println("Masa din living este "+masa);
    }
}
