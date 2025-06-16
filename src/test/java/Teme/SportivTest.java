package Teme;

import org.testng.annotations.Test;

public class SportivTest {


    @Test
    public void testMethod(){

        Sportiv primulSportiv= new Sportiv("Tenis","Alex",3,0,1,27,72.3);
        Sportiv alDoileaSportiv= new Sportiv("Atletism","Marius",2,5,0,29,68.5);
        Sportiv alTreileaSportiv= new Sportiv("Inot","Corina",1,3,2,23,56.1);

        primulSportiv.prezentareSportiv();
        System.out.println();
        alDoileaSportiv.prezentareSportiv();
        System.out.println();
        alTreileaSportiv.prezentareSportiv();

    }
}
