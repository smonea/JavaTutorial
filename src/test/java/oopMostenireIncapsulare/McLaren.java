package oopMostenireIncapsulare;

import java.util.List;

public class McLaren extends Masina{

    public List<String> dotariExterioare;

    public List<String> dotariInterioare;

    public McLaren(String marca, String model, String culoare, int caiPutere, int pret,List<String> dotariExterioare, List<String> dotariInterioare ) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void prezentareComandaMcLaren(){
        prezentareComandaMasina();
        System.out.println("Dotari exterioare McLaren: ");
        for (int i=0; i<dotariExterioare.size(); i++){
            System.out.println((i+1)+". "+dotariExterioare.get(i));
        }
        System.out.println("Dotari interioare McLaren: ");
        for (int i=0; i<dotariInterioare.size(); i++){
            System.out.println((i+1)+". "+dotariInterioare.get(i));
        }
    }
}
