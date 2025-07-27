package oopMostenireIncapsulare;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test

    public void testMethod(){

        List<String> dotariExterioareLogan = Arrays.asList("Senzori","Camera video", "Jante");
        Dacia Logan = new Dacia("Dacia", "Logan", "Negru", 85, 12333, dotariExterioareLogan);

        Logan.prezentareComandaDacia();
        System.out.println();

        List<String> dotariExterioareMcLaren = Arrays.asList("AAA", "BBB", "CCC");
        List<String> dotariInterioareMcLaren = Arrays.asList("DDD", "EEE", "FFF");
        McLaren McL = new McLaren("McLaren", "ZZZ","Alb", 250, 34556,dotariExterioareMcLaren, dotariInterioareMcLaren);

        McL.prezentareComandaMcLaren();
    }

}
