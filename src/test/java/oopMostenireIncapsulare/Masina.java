package oopMostenireIncapsulare;

public class Masina {

    //OOP - Object oriented programming
    // Avem 4 concepte: Mostenire, Incapsulare, Abstractizare, Polimorfism
    // Mostenire - conceptul prin care o clasa parinte este mostenita de una sau mai multe clase copil
    // In java o clasa copil poate mosteni o singura clasa parinte
    // Cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    // Copilul apeleaza constructorul din parinte folosing super
    // Ca sa folosim mostenirea apelam la cuvantul "extends"
    // Cand copilul mosteneste parintele, copilul are acces la variabile/metode din interiorul parintelui
    // Daca sunt public/protected

    public String marca;
    public String model;
    public String culoare;
    public int caiPutere;
    public int pret;

    public Masina(String marca, String model, String culoare, int caiPutere, int pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.pret = pret;
    }

    public Masina(String marca, String model, String culoare, int caiPutere) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
    }

    public void prezentareComandaMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Masina are " + caiPutere + " cai putere.");
        System.out.println("Pret: " + pret);
    }
}


