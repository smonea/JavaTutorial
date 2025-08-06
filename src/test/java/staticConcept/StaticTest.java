package staticConcept;

import org.testng.annotations.Test;

public class StaticTest{

    @Test

    public void testMethod(){

        Elev Gojo = new Elev("Gojo", "Satoru");
        Gojo.prezentareElev();

//        Elev.scoala = "JJK";

        System.out.println();

        Elev Andrei = new Elev("AAA", "Andrei");
        Andrei.prezentareElev();

        System.out.println();

        Elev Marius = new Elev("BBB","Marius");
        Marius.prezentareElev();

    }

}
