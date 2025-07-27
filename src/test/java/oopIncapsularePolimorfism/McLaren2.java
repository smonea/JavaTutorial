package oopIncapsularePolimorfism;

import java.util.List;

public class McLaren2 extends Masina2{

    private List<String> dotariExterioare;

    private List<String> dotariInterioare;

    public McLaren2(String marca, String model, String culoare, int caiPutere, int pret,List<String> dotariExterioare, List<String> dotariInterioare ) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }



    public void prezentareComandaMcLaren2(){
        prezentareComandaMasina2();
        System.out.println("Dotari exterioare McLaren: ");
        for (int i=0; i<dotariExterioare.size(); i++){
            System.out.println((i+1)+". "+dotariExterioare.get(i));
        }
        System.out.println("Dotari interioare McLaren: ");
        for (int i=0; i<dotariInterioare.size(); i++){
            System.out.println((i+1)+". "+dotariInterioare.get(i));
        }
    }

    public void pornesteMotor(){
        System.out.println("Masina McLaren porneste motorul din telefon");
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}
