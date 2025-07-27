package oopIncapsularePolimorfism;

import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest2 {

    @Test

    public void testMethod(){

        List<String> dotariExterioareLogan = Arrays.asList("Senzori","Camera video", "Jante");
        Dacia2 Logan = new Dacia2("Dacia", "Logan", "Negru", 85, 12333, dotariExterioareLogan);

        Logan.prezentareComandaDacia2();

        Logan.setCuloare("Rosu");
        Logan.setModel("Sandero");

        Logan.prezentareComandaDacia2();
        Logan.pornesteMotor();
        Logan.procesarePlata();
        Logan.procesarePlata(true);
        Logan.procesarePlata(10);

        System.out.println();

        List<String> dotariExterioareMcLaren = Arrays.asList("AAA", "BBB", "CCC");
        List<String> dotariInterioareMcLaren = Arrays.asList("DDD", "EEE", "FFF");

        McLaren2 McL = new McLaren2("McLaren", "ZZZ","Alb", 250, 34556,dotariExterioareMcLaren, dotariInterioareMcLaren);

        McL.prezentareComandaMcLaren2();
        McL.pornesteMotor();
    }
}
