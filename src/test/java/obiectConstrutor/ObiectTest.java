package obiectConstrutor;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test

    public void testMethod(){
        Masina silviaAudi=new Masina("Audi","A7","5.7l/100km","Rosu",265,2320,"53456");
        silviaAudi.prezentareComandaMasina();
        silviaAudi.taxaGreutate();
        System.out.println();

        Masina silviaRangeRover=new Masina("Range Rover","BB","6.2l/100km","Negru",232,5000,"64456");
        silviaRangeRover.prezentareComandaMasina();
        System.out.println();
        silviaRangeRover.culoare="Alb";
        silviaRangeRover.model="CC";
        silviaRangeRover.prezentareComandaMasina();
        silviaRangeRover.taxaGreutate();
        System.out.println();

        Masina silviaVolskwagen=new Masina("Volskwagen","DD","7.2l/100km","Negru",182,1876,"34456", 6500);
        silviaVolskwagen.prezentareComandaMasina();
        silviaVolskwagen.taxaGreutate();
    }
}
