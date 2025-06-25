package compozitie;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CompozitieTest {

    @Test

    public void testMethod(){

        Living livingM = new Living("Camera de zi", 15,"Camera principala din casa","Samsung","Canapea AA","Masa BB");

        Bucatarie bucatarieM = new Bucatarie("Bucatarie1",12,"Bucatarie CCC","DDD","LED","EEE");
        Bucatarie bucatarieMS = new Bucatarie("Bucatarie2",15,"Bucatarie CCC","DDD","LEDsff","EEEwss");
        List<Bucatarie> bucatarieList = Arrays.asList(bucatarieM,bucatarieMS);

        Dormitor dormitorM = new Dormitor("Dormitor1", 20,"Dddd","EEss","ABC","Nu","Da");
        Dormitor dormitorS = new Dormitor("Dormitor2", 15,"Dddsasdd","EEsdds","ABC","Nu","Da");
        List<Dormitor> dormitorList = Arrays.asList(dormitorM,dormitorS);

        Baie baieM = new Baie("Baie1",4,"SASD","Nu","Da","Da");
        Baie baieS = new Baie("Baie2",6,"SAsadd","Da","Nu","Da");
        List<Baie> baieList = Arrays.asList(baieM,baieS);

        Casa casaMea = new Casa(livingM,bucatarieList,dormitorList,baieList);
        casaMea.prezentareGeneralaCasa();
    }
}
