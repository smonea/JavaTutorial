package oopIncapsularePolimorfism;

public class Masina2 {

    //Incapsulare = concept pe baza caruia tinem departe de exterior valorile proprietatilor pe care nu vrem sa le modificam.
    //Incapsularea se poate aplica la nivel de proprietati, dar si de metode.
    //private = access control care are ca rol sa restraga vizibilitatea unei proprietati/metode doar la nivelul clasei unde e definita.
    //get/set

    //Polimorfism = concept pe baza caruia o metoda poate avea implementari diferite pentru fiecare circumstanta.
    //Este de 2 feluri dinamic(override) si statis(overload).
    //dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite.
    //polimorfismul dinamic se regaseste doar relatia de tip parinte-copil
    //static = posibilitatea de a defini de mai multe ori o metoda cu acelasi nume insa cu numar/tip de parametrii diferiti
    //polimorfismul static nu este fortat de prezenta unei relatii de tip parinte-copil

    private String marca;
    private String model;
    private String culoare;
    private int caiPutere;
    private int pret;

    public Masina2(String marca, String model, String culoare, int caiPutere, int pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.pret = pret;
    }

    public Masina2(String marca, String model, String culoare, int caiPutere) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
    }

    public void prezentareComandaMasina2() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Masina are " + caiPutere + " cai putere.");
        System.out.println("Pret: " + pret);
    }

    public void pornesteMotor(){
        System.out.println("Masina se porneste de la buton");
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public int getPret() {
        return pret;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}


