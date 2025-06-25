package Teme.tema3;

import org.testng.annotations.Test;

public class Tema3Test {

    @Test

    public void testMethod(){
        PrimulPC PrimulPC = new PrimulPC("Gigabyte Z790","Intel Core i7","Corsair 32GB DDR5","Corsair iCUE","Seasonic Focus GX","Gigabyte GeForce RTX 4070 Ti",
                "Samsung 980 PRO 1TB","Corsair 5000D","Corsair iCUE SP140",15320,false);
        PrimulPC.prezentareComandaPC();

        System.out.println();

        AlDoileaPC AlDoileaPC = new AlDoileaPC("Gigabyte Z790","Intel Core i5","Corsair 16GB DDR5","NZXT","Seasonic Focus GX","Gigabyte GeForce RTX 1080",
                "Samsung 980 PRO 2TB","Corsair 5000D Airflow","Corsair iCUE SP140",12220,true);
        AlDoileaPC.prezentareComandaPC();
    }
}
