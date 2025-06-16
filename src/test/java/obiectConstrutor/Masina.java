package obiectConstrutor;

public class Masina {

    //Constructor = are ca rol sa initializeze atributele unei clase.
    //Recunoastem un constructor intr-o clasa dupa numele clasei care este la fel cu constructorul.
    //Un constructor poate sa fie public, private, protected urmat de acelasi nume cu clasa.
    //Intr-o clasa putem sa avem mai multi constructori diferentiati prin numarul sau tipul de parametrii.

    //Obiect = instanta a unei clase care contine proprietatile si metodele acesteia.
    //Dintr-o clasa putem sa creem o multime de obiecte diferentiate prin numele acestora.
    //In momentul cand se initializeaza un obiect folosim cuvantul new urmat de apelarea constructorului din clasa.
    //Exemplu: Masina silviaAudi= new Masina("Audi","A7");
    //In momentul cand am initializat un obiect, pe baza lui putem sa accesam proprietatile si metodele din clasa respectiva.
    //In momentul cand creem un obiect se aloca spatiu in memorie special pentru aceasta reprezentare.

    public String marca;
    public String model;
    public String consum;
    public String culoare;
    public int caiPutere;
    public int greutate;
    public String nrKm;
    public int pret;

    public Masina(String marca, String model, String consum, String culoare, int caiPutere, int greutate, String nrKm) {
        this.marca = marca;
        this.model = model;
        this.consum = consum;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.greutate = greutate;
        this.nrKm = nrKm;
    }

    public Masina(String marca, String model, String consum, String culoare, int caiPutere, int greutate, String nrKm, int pret) {
        this.marca = marca;
        this.model = model;
        this.consum = consum;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.greutate = greutate;
        this.nrKm = nrKm;
        this.pret = pret;
    }

    public void prezentareComandaMasina(){
        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Consumul masinii este "+consum);
        System.out.println("Culoarea masinii este "+culoare);
        System.out.println("Masina are "+caiPutere+" cai putere.");
        System.out.println("Greutatea masinii este de "+greutate+" kg.");
        System.out.println("Numarul de kilometrii: "+nrKm);
        if(pret>0) {
            System.out.println("Pret: " + pret);
        }
    }
    //Daca greutatea este pana in 2000 trebuie sa platim 5 lei
    //Daca greutatea este cuprinsa intre 2000 si 4000 platim 10 lei
    //Daca greutatea este peste 4000 platim 15 lei

    public void taxaGreutate(){
        if (greutate<=2000){
            System.out.println("Taxa de greutate: 5 lei");
        }
        if (greutate>2000&&greutate<=4000){
            System.out.println("Taxa de greutate: 10 lei");
        }
        if (greutate>4000){
            System.out.println("Taxa de greutate: 15 lei");
        }
    }

}


